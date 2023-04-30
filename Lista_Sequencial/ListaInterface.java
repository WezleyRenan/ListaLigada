package Lista_Sequencial;

public interface ListaInterface {

	public void adicionar(int valor,String nome);
	
	public void remover(Elemento elemento, int valor, int tamanho) throws Exception;
	
	public void get(int posicao) ;
	
	public void getNome(int posicao);



	
}
