public class ArvoreTest {
    private Arvore arvore;

    @Before
    public void setUp() {
        arvore = new Arvore();
    }

    @Test
    public void testInserir() throws ArvoreCheiaException, MesmoValorException, NoInexistenteException {
        arvore.inserir(10);
        arvore.inserir(5);
        arvore.inserir(15);

        assertEquals(10, arvore.buscar(10).getValor());
        assertEquals(5, arvore.buscar(5).getValor());
        assertEquals(15, arvore.buscar(15).getValor());
    }

    @Test
    public void testRemover() throws ArvoreCheiaException, MesmoValorException, NoInexistenteException {
        arvore.inserir(10);
        arvore.inserir(5);
        arvore.inserir(15);

        arvore.remover(5);

        assertNull(arvore.buscar(5));
    }

    @Test(expected = MesmoValorException.class)
    public void testInserirMesmoValor() throws ArvoreCheiaException, MesmoValorException {
        arvore.inserir(10);
        arvore.inserir(10);
    }

    @Test(expected = ArvoreCheiaException.class)
    public void testInserirArvoreCheia() throws ArvoreCheiaException {
        for (int i = 0; i < 21; i++) {
            arvore.inserir(i);
        }
    }

    @Test(expected = NoInexistenteException.class)
    public void testBuscarNoInexistente() throws NoInexistenteException {
        assertNull(arvore.buscar(5));
    }
}