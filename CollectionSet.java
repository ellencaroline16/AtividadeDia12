package Collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		//Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer, 
//		inicializada com 10 valores inteiros. 
//		O programa deverá solicitar ao usuário, que ele digite via teclado 1 número inteiro 
//		e caso ele seja encontrado no Set, exiba na tela a mensagem: Número 00 Encontrado! 
//		Caso o número não seja encontrado, ele deverá exibir na tela a mensagem: O número NN não foi encontrado!

//		//Na construção do Algoritmo, utilize os seguintes conteúdos:
//			Entrada e Saída de dados
//			Laços Condicionais
//			Laços de Repetição
//			Collection Set

		// 1º declarar as variáveis

		Set<Integer> setValoresInteiros = new HashSet<Integer>();
		setValoresInteiros.add(2);
		setValoresInteiros.add(5);
		setValoresInteiros.add(1);
		setValoresInteiros.add(3);
		setValoresInteiros.add(4);
		setValoresInteiros.add(9);
		setValoresInteiros.add(7);
		setValoresInteiros.add(8);
		setValoresInteiros.add(10);
		setValoresInteiros.add(6);
		
		int numero = 0; // numero recebe 0
		Scanner ler = new Scanner(System.in);

		System.out.println(" Digite um número");
		numero = ler.nextInt();

		// 2º criar a condição - lógica

		if (setValoresInteiros.contains(numero)) { // referência - nessa coleção, existe esse valor ?
			System.out.println("Numero " + numero + " encontrado!"); // informando o nº do vagão
		} else {
			System.out.println("Número " + numero + " não foi encontrado!");
		}

	}

}
