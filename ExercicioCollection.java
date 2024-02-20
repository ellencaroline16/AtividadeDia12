package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExercicioCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Escreva um programa Java para criar uma Collection ArrayList de Objetos da
		// Classe String.
		// O programa deverá solicitar ao usuário, que ele digite via teclado 5 cores
		// e deverá adicioná-las individualmente no ArrayList. Em seguida, faça o que se
		// pede:
		// Mostre na tela todas as cores que foram adicionadas.
		// Mostre na tela todas as cores que foram adicionadas ordenadas em ordem
		// crescente.

		// Na construção do Algoritmo, utilize os seguintes conteúdos:
		// Entrada e Saída de dados
		// Laços de Repetição
		// Collection ArrayList

		// Variáveis

		ArrayList<String> coresList = new ArrayList<>();
		Scanner ler = new Scanner(System.in);
		String cor;

		for (int contador = 0; contador < 5; contador++) {
			System.out.println(" Digite uma cor: ");
			cor = ler.next();
			coresList.add(cor);
		}

		System.out.println("Listar todas as cores: ");
		for (int contador = 0; contador < 5; contador++) {
			System.out.println(coresList.get(contador));

		}

		System.out.println();

		Collections.sort(coresList);
		System.out.println("Ordenar as cores: ");
		for (int contador = 0; contador < 5; contador++) {
			System.out.println(coresList.get(contador));

		}

	}

}
