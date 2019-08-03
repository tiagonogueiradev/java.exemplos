/**
 * 
 */
package br.com.tiagonogueiradev.exemplos.selecao;

/**
 * @author tiagonogueira
 *
 */
public class EstruturasDeSelecao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("vamos começar a falar de if else e ternários em Java");

		System.out.println("primeiro vamos a um if simples");

		/*
		 * Aqui vamos começar com um if bem simples
		 *  vamos declarar uma variável para condicao onde vamos setar ela como true
		 *  se você ainda não entende de tabela verdade 
		 *  da uma olhada no meu site
		 *  https://www.tiagonogueira.dev/2019/07/condicoes-de-selecao-if-else.html
		 */

		System.out.println("iniciando a variável condicao como true");

		boolean condicao= true;

		if(condicao) {
			System.out.println("como condicao é true essa mensagem será impressa");
		}

		System.out.println("agora podemos negar ela para ver o que vai acontecer");

		if(!condicao) {
			System.out.println("é agora será falso, não a váriavel mas a condição negada do if "+!condicao);
		}

		System.out.println("é o print anterior não vai acontecer, já que a condição é false");

		// vamos falar de else

		System.out.println("agora vamos testar o else");// a proposito esse teclado do mac é foda pra quem não está acostumado kkkk

		if(!condicao) {
			System.out.println("aqui nao vai imprimir");
		}else {
			System.out.println("mas aqui vai porque a condicao é falsa");
			//o else trabalha como exceção a condição verdadeira
			//vamos identar esse código
		}
		
		//conição ternário
		System.out.println("É uma condição " + (condicao?"Verdadeira":"falsa"));
		
		//é o controlador de fluxo caso, pode ser usado com Enuns também
		int opcao = 50;
		switch (opcao ) {
		case 0:
			System.out.println("Opção 0 ");
			break ;
		case 1:
			System.out.println("Opção 1 ");

			break ;
		case 2:
			System.out.println("Opção 2 ");

			break ;

		default:
			System.out.println("Não encontrou nenhuma opção ");
		}

	}

}
