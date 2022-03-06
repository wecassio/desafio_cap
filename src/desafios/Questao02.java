package desafios;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); // variavel para ler o valor

		System.out.printf("Tamanho do vetor: ");//inprima na tela

		int tamanho = in.nextInt(); // ler valor inteiro.
		int[] valores = new int[tamanho]; // declarar vetor

		// laço de repeticao para salvar os valores no vetor
		for (int i = 0; i < tamanho; i++) {
			System.out.printf("Digite um numero: ");//inprima na tela
			valores[i] = in.nextInt(); // lendo um valor inteiro do console e salvando na casa 'i' do vetor
		}

		Map<Integer, Integer> map = construirHashMap(valores);
		
		int maiorValor = getMaiorValorDoHashMap(map);

		System.out.println("\nQuantidade de pares inteiros: " + maiorValor);

		in.close();
	}
	
	public static Map<Integer, Integer> construirHashMap(int[] vetor){
		final Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < vetor.length; i++) {
			for (int j = i+1; j < vetor.length; j++) {
				int subtracao = Math.abs(vetor[i] - vetor[j]);
				
				if(subtracao % 2 == 0) {
					if(map.containsKey(subtracao)) {
						map.put(subtracao, map.get(subtracao)+1);
					}else {
						map.put(subtracao, 1);
					}					
				}
			}
		}
		
		return map;
	}
	
	public static int getMaiorValorDoHashMap(Map<Integer, Integer> map) {
		int maior=0;
		for (Integer chave: map.keySet()) {
			if(map.get(chave) > maior) {
				maior = map.get(chave);
			}
		}
		
		return maior;
	}
}
