package ArvoreBinariaDeBuscaProva;

public class Arvore implements IArvore {

    private No raiz;
    private int altura;

    @Override
    public void inserir(int valor) {
        try {
            inserirRecursivo(raiz, valor);
        } catch (MesmoValorException e) {
            // TODO Auto-generated catch block
            e.getMessage();
        }
    }

    public No inserirRecursivo(No raiz, int valor) throws MesmoValorException {
        if (raiz == null) {
            raiz = new No(valor);
            return raiz;
        }
        if (valor == raiz.getValor()) {
            throw new MesmoValorException("mesmo valor do NO");
        }
        if (valor > raiz.getValor()) {
            raiz.setDireito(inserirRecursivo(raiz.getDireito(), valor));
        } else if (valor < raiz.getValor()) {
            raiz.setEsquerdo(inserirRecursivo(raiz.getEsquerdo(), valor));
        }
        return raiz;
    }

    @Override
    public No remover(int valor) throws NoInexistenteException {
        if (removerRecursivo(raiz, valor) == null) {
            throw new NoInexistenteException("nenhum No encontrado");
        }
        return removerRecursivo(raiz, valor);

    }

    public No removerRecursivo(No raiz, int valor) {
        if (raiz == null) {
            return raiz;
        }
        if (valor < raiz.getValor()) {
            raiz.setEsquerdo(removerRecursivo(raiz.getEsquerdo(), valor));
        } else if (valor > raiz.getValor()) {
            raiz.setDireito(removerRecursivo(raiz.getDireito(), valor));
        } else {
            // Caso com um ou sem filhos
            if (raiz.getEsquerdo() == null)
                return raiz.getDireito();
            else if (raiz.getDireito() == null)
                return raiz.getEsquerdo();

            // Caso com dois filhos: encontra o nó sucessor ou seja, é o menor nó na
            // subárvore direita
            No sucessor = encontrarMenorNo(raiz.getDireito());

            // Copia o valor do sucessor para este nó
            raiz.setValor(sucessor.getValor());

            // Remove o sucessor
            raiz.setDireito(removerRecursivo(raiz.getDireito(), sucessor.getValor()));
        }

        return raiz;
    }

    private No encontrarMenorNo(No no) {
        while (no.getEsquerdo() != null)
            no = no.getEsquerdo();
        return no;
    }

    @Override
    public No buscar(int valor) throws NoInexistenteException {
        return BuscarRecursivo(raiz, valor);
    }

    public No BuscarRecursivo(No raiz, int valor) throws NoInexistenteException {
        // Se o valor da arvore não for encontrado
        if (raiz == null) {
            throw new NoInexistenteException("Nó não encontrado na árvore.");
        }

        // Se o valor a ser buscado é menor que o valor do nó atual, busca na subárvore
        // esquerda
        if (valor < raiz.getValor()) {
            return BuscarRecursivo(raiz.getEsquerdo(), valor);
        }
        // Se o valor a ser buscado é maior que o valor do nó atual, busca na subárvore
        // direita
        else if (valor > raiz.getValor()) {
            return BuscarRecursivo(raiz.getDireito(), valor);
        }
        // O valor foi encontrado
        else {
            return raiz;
        }
    }

    @Override
    public boolean estaVazia() {
        return raiz == null;
    }

    @Override
    public void imprimirArvore(No raiz) {
        if (raiz != null) {
            imprimirArvore(raiz.getEsquerdo());
            System.out.print(raiz.getValor() + " ");
            imprimirArvore(raiz.getDireito());
        }
    }
}