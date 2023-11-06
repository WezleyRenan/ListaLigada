package ArvoreBinariaDeBuscaProva;

public interface INo extends Comparable<T> {

    void setValor(int valor);

    void setEsquerdo(No no);

    void setDireito(No no);

    int getValor();

    No getEsquerdo();

    No getDireito();

}