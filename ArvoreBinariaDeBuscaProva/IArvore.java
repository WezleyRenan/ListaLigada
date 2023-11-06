package ArvoreBinariaDeBuscaProva;

public interface IArvore {

    void inserir(int valor);

    No remover(int valor) throws NoInexistenteException;

    No buscar(int valor) throws NoInexistenteException;

    boolean estaVazia();

    void imprimirArvore(No raiz);

}