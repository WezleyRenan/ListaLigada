package ArvoreBinariaDeBuscaProva;

public class ArvoreBinaria extends Arvore implements IArvoreBinaria {

    // percorrer por Profundidade

    @Override
    public void preOrdem(No no) {
        if (no != null) {
            System.out.print(no.getValor() + "  "); // visita o nó antes de visitar os outros
            preOrdem(no.getEsquerdo()); // visita o filho esquerdo
            preOrdem(no.getDireito()); // visita o filho direito
        }
    }
    @Override
    public void inOrdem(No no) {
        if (no == null)
            return;

        inOrdem(no.getEsquerdo()); // Visita o filho esquerdo
        System.out.print(no.getValor() + " "); // visita o no antes de visitar o direito
        inOrdem(no.getDireito()); // Visita o filho direito
    }
    @Override
    public void posOrdem(No no) {
        if (no == null)
            return;

        posOrdem(no.getEsquerdo()); // Visita o filho esquerdo
        posOrdem(no.getDireito()); // Visita o filho direito
        System.out.print(no.getValor() + " "); // Visita o nó depois de visitar os filhos
    }

    // percorrer por Largura
    @Override
    public void percorrerLargura() {
        if (raiz == null) {
            return;
        }

        // Inicialize a lista Encadeada para o primeiro nível com a raiz
        No nivelAtual = raiz;

        while (nivelAtual != null) {
            No ElementoAtual = nivelAtual;
            while (ElementoAtual != null) {
                System.out.print(ElementoAtual.getValor() + " ");
                if (ElementoAtual.getEsquerdo() != null) {
                    nivelAtual = ElementoAtual.getEsquerdo();
                }
                ElementoAtual = ElementoAtual.getDireito();
            }
            nivelAtual = nivelAtual.getDireito();
        }
    }

}
