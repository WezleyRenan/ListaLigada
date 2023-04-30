package Lista_Sequencial;

import java.util.Scanner;

public class Programa{

	public static void main(String[] args) {

		ListaLigada lista = new ListaLigada();
		Scanner input = new Scanner(System.in);
		int numero;
		String nome;

		lista.adicionar(23,"wezley");
		lista.adicionar(18,"renan");
		lista.adicionar(40,"joao");
		System.out.println(lista.getTamanho());
		System.out.println("escolha uma das seguintes opçoes:");
		System.out.println(" 1 = visualizar a lista\n 2 = remover da lista\n 3 = adicionar no inicio\n 4 = adicionar no final\n 0 = finalizar");

		try {
			int opcao = input.nextInt();
			while (opcao != 0) {
				switch (opcao) {
				case 1:
					int tamanho = (int) (lista.getTamanho());
					//lista.ordenar(lista.getPrimeiro(), tamanho, 0);
					lista.get(tamanho);
					break;
				case 2:
					System.out.println("digite qual posicao de elemento deseja remover");
					numero = input.nextInt();
					lista.remover(lista.getPrimeiro(),numero,lista.getTamanho());
					break;
				case 3:
					System.out.println("informe a idade");
					numero = input.nextInt();
					System.out.println("informe o nome");
					nome = input.next();
					lista.adicionarInicio(numero,nome);
					break;
				case 4:
					System.out.println("informe a idade");
					numero = input.nextInt();
					System.out.println("informe o nome");
					nome = input.next();
					lista.adicionar(numero,nome);
					break;
				}
				System.out.println(" ");
				System.out.println(" 1 = visualizar a lista\n 2 = remover da lista\n 3 = adicionar no inicio\n 4 = adicionar no final\n 0 = finalizar");
				opcao = input.nextInt();
			}
		} catch (Exception erro) {

		}

		System.out.println("tamanho " + lista.getTamanho());
		System.out.println("primeiro elemento " + lista.getPrimeiro().getValor());
		System.out.println("ultimo " + lista.getUltimo().getValor());

	}

}
