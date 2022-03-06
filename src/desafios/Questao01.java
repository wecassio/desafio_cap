package desafios;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // Variavel para ler valor do console

		System.out.printf("Quantidade de numeros: "); // imprime na tela

		int quantidade = in.nextInt(); // ler valor inteiro
		int[] valores = new int[quantidade]; // declarando vetor com N casas

		// laço de repeticao para salvar os valores no vetor
		for (int i = 0; i < quantidade; i++) {
			System.out.printf("Digite um numero da posicao [%d]: ", i + 1);
			valores[i] = in.nextInt(); // lendo um valor inteiro do console e salvando na casa 'i' do vetor
		}

		int[] valoresOrdenados = ordenarVetorCrescente(valores, quantidade); // chamando funcao para ordernar os valores
																				// do vetor

		System.out.printf("\nMediana: %f\n", mediana(valoresOrdenados)); // imprime na tela
		in.close(); // fechando a leitura de dados
	}

	public static float mediana(int[] vetor) {
		float med = 0;

		if (vetor.length % 2 != 0) {
			int posicao = (int) Math.ceil(vetor.length / 2);
			med = vetor[posicao];
		} else {
			int posicao_1 = (vetor.length / 2) - 1;
			int posicao_2 = (vetor.length / 2);
			med = (float) ((vetor[posicao_1] + vetor[posicao_2]) / 2.0);
		}

		return med;
	}

	public static int[] ordenarVetorCrescente(int[] vetor, int quantidade) {

		for (int i = 0; i < quantidade; i++) {
			for (int j = 0; j < quantidade - 1; j++) {
				if (vetor[j] > vetor[j + 1]) {
					int auxiliar = vetor[j + 1];
					vetor[j + 1] = vetor[j];
					vetor[j] = auxiliar;
				}
			}
		}

		return vetor;
	}

	private static int[] ordenarVetorDecrescente(int[] vetor, int quantidade) {

		for (int i = 0; i < quantidade; i++) {
			for (int j = 0; j < quantidade - 1; j++) {
				if (vetor[j] < vetor[j + 1]) {
					int auxiliar = vetor[j + 1];
					vetor[j + 1] = vetor[j];
					vetor[j] = auxiliar;
				}
			}
		}

		return vetor;
	}
}
