package Lista_Sequencial;

public class ListaLigada implements ListaInterface {

	private Elemento primeiro;
	private Elemento ultimo;
	private int tamanho;

	public ListaLigada() {
		super();
		this.tamanho = 0;
	}

	public Elemento getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(Elemento primeiro) {
		this.primeiro = primeiro;
	}

	public Elemento getUltimo() {
		return ultimo;
	}

	public void setUltimo(Elemento ultimo) {
		this.ultimo = ultimo;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public void adicionar(int valor, String nome) {
		Elemento novoElemento = new Elemento(valor, nome);
		if (primeiro == null && ultimo == null) {
			this.primeiro = novoElemento;
			this.ultimo = novoElemento;
		} else {
			this.ultimo.setProximo(novoElemento);
			this.ultimo = novoElemento;
		}
		this.tamanho++;
	}

	@Override
	public void remover(Elemento elemento,int valor,int tamanho) throws Exception {
		Elemento atual = elemento;
		Elemento anterior = elemento;
		for (int ordem = 1; ordem <= tamanho; ordem++) {
			if(tamanho == 0 ) {
				throw new Exception("lista vazia");
			}
			if(ordem == valor && ordem == 1) {
				primeiro = elemento.getProximo();
				tamanho--;
			}
			if(ordem == valor && ordem == tamanho) {
				anterior.setProximo(null);
				tamanho--;
			}
			if(ordem == valor) {
				anterior = elemento.getProximo();
				elemento = anterior;
				tamanho--;
			}
			anterior = atual;
			atual = elemento.getProximo();
		}
	}

	

	@Override
	public void get(int posicao) {
		Elemento atual = this.primeiro;
		int ordem = 1;
		System.out.println("idade:"+atual.getValor() + "| nome:" + atual.getNome()+ "| posiçao:" + ordem);
		for (int i = 0; i < posicao; i++) {
			if (atual.getProximo() != null) {
				atual = atual.getProximo();
				ordem++;
				System.out.println("idade:"+atual.getValor() + "| nome:" + atual.getNome()+ "| posiçao:" + ordem);
			}
		}
	}

	public void adicionarInicio(int valor, String nome) {
		Elemento auxiliar;
		Elemento novoElemento = new Elemento(valor, nome);
		if (primeiro != null) {
			auxiliar = this.primeiro;
			this.primeiro = novoElemento;
			this.primeiro.setProximo(auxiliar);
		} else {
			this.ultimo.setProximo(novoElemento);
			this.ultimo = novoElemento;
		}
		this.tamanho++;
	}

	@Override
	public void getNome(int posicao) {
		Elemento atual = this.primeiro;
		for (int i = 0; i < posicao; i++) {
			if (atual.getProximo() != null) {
				atual = atual.getProximo();
				System.out.print(atual.getNome() + " ");
			}
		}

	}

}
