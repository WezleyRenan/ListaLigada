package Lista_Sequencial;

public class Elemento {
	
	private int valor;
	private int ordem;
	private String nome;
	private Elemento proximo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Elemento(int valor, String nome) {
		this.valor = valor;
		this.nome = nome;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public Elemento getProximo() {
		return proximo;
	}
	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}
	
	

}
