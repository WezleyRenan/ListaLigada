package ArvoreBinariaDeBuscaProva;

public class No implements INo {
    private int valor; // Valor armazenado no nó
    private No esquerdo; // Filho esquerdo
    private No direito; // Filho direito

    public No(int valor) { // construtor
        this.valor = valor;
        this.esquerda = null; // Inicializado como nulo, pois ainda não temos um filho esquerdo
        this.direita = null; // Inicializado como nulo, pois ainda não temos um filho direito
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setEsquerdo(No no) {
        this.esquerdo = no;
    }

    public void setDireito(No no) {
        this.direito = no;
    }

    public int getValor() {
        return valor;
    }

    public No getEsquerdo() {
        return esquerdo;
    }

    public No getDireito() {
        return direito;
    }
}