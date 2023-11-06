package ArvoreBinariaDeBuscaProva;

public interface IArvoreBinaria extends IArvore {

    // percorrer Profundidade;
    void preOrdem(No no);

    void inOrdem(No no);

    void posOrdem(No no);

    // percorrer Largura;
    void percorrerLargura();
}