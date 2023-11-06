package ArvoreBinariaDeBuscaProva;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        try {
            //Inserir elementos na árvore
            arvore.inserir(10);
            arvore.inserir(45);
            arvore.inserir(15);
            arvore.inserir(10);
            arvore.inserir(5);

            //Imprimir a árvore
            System.out.println("Árvore Inicial:");
            arvore.percorrerLargura();
            System.out.println();

            // Buscar elementos na árvore
            int valorBuscado = 10;
            No noEncontrado = arvore.buscar(valorBuscado);
            System.out.println("Nó com valor " + valorBuscado + " encontrado: " + noEncontrado.getValor());

            //Remover um elemento da árvore
            int valorRemovido = 5;
            arvore.remover(valorRemovido);
            System.out.println("Nó com valor " + valorRemovido + " removido da árvore.");

            //Imprimir a árvore após a remoção
            System.out.println("Árvore após a remoção:");
            arvore.imprimirArvore(arvore.raiz);
        } catch ( NoInexistenteException e) {
            System.err.println("Erro: " + e.getMessage());
        } catch (MesmoValorException e) {
            e.printStackTrace();
        }
    }
}
