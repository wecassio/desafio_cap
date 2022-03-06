package desafios;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um texto: ");

		String texto = entrada.nextLine();

		String textoSemEspaco = texto.replaceAll(" ", "");

		int quantidadeDeLetras = textoSemEspaco.length();
		int raizQuadrada = (int) Math.ceil(Math.sqrt(quantidadeDeLetras));

		Character[][] matriz = criandoMatriz(textoSemEspaco, raizQuadrada);
		Character[][] matrizInvertida = inverterMatriz(matriz, raizQuadrada);

		String textoInvertido = converterMatrizParaString(matrizInvertida, raizQuadrada);
		System.out.println("Texto encriptado: " + textoInvertido);

		entrada.close();
	}

	public static Character[][] criandoMatriz(String texto, int raizQuadrada){
		int contadorTexto = 0;
		
		Character[][] matriz = new Character[raizQuadrada][raizQuadrada];
		for (int linha = 0; linha < raizQuadrada; linha++) {
			for (int coluna = 0; coluna < raizQuadrada; coluna++) {
				if (contadorTexto < texto.length()) {
					matriz[linha][coluna] = texto.charAt(contadorTexto);
					contadorTexto++;
				}
			}
		}
	
		return matriz;
	}
	
	public static String converterMatrizParaString(Character[][] matriz, int raizQuadrada) {
		String textoInvertido = "";

		for (int linha = 0; linha < raizQuadrada; linha++) {
			for (int coluna = 0; coluna < raizQuadrada; coluna++) {
				if (matriz[linha][coluna] != null) {
					textoInvertido = textoInvertido + matriz[linha][coluna];
				}
			}

			if(linha+1 != raizQuadrada) {
				textoInvertido = textoInvertido + " ";				
			}
		}
		return textoInvertido;
	}

	public static Character[][] inverterMatriz(Character[][] matriz, int raizQuadrada) {
		Character[][] matrizInvertida = new Character[raizQuadrada][raizQuadrada];

		for (int linha = 0; linha < raizQuadrada; linha++) {
			for (int coluna = 0; coluna < raizQuadrada; coluna++) {
				if (matriz[coluna][linha] != null) {
					matrizInvertida[linha][coluna] = matriz[coluna][linha];
				}
			}
		}
		return matrizInvertida;
	}

	private static void imprimirMatriz(Character[][] matriz, int qtdLinha, int qtdColuna) {
		for (int linha = 0; linha < qtdLinha; linha++) {
			for (int coluna = 0; coluna < qtdColuna; coluna++) {
				if (matriz[linha][coluna] != null) {
					System.out.print(matriz[linha][coluna]);
				}
			}
			System.out.println();
		}
	}

}
