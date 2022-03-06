package testesUnitarios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import desafios.Questao03;

class Questao03Test {

	@Test
	void testEncriptarTexto1() {
		final String texto = "tenha um bom dia";
		final String textoSemEspaco = texto.replaceAll(" ", "");
		
		int quantidadeDeLetras = textoSemEspaco.length();
		int raizQuadrada = (int) Math.ceil(Math.sqrt(quantidadeDeLetras));
	
		final Character[][] matriz = Questao03.criandoMatriz(textoSemEspaco, raizQuadrada);
		final Character[][] matrizInvertida = Questao03.inverterMatriz(matriz, raizQuadrada);
		
		final String textoEncriptado = Questao03.converterMatrizParaString(matrizInvertida, raizQuadrada);
		
		assertEquals("taoa eum nmd hbi", textoEncriptado);
	}
	
	@Test
	void testEncriptarTexto2() {
		final String texto = "ola mundo";
		final String textoSemEspaco = texto.replaceAll(" ", "");
		
		int quantidadeDeLetras = textoSemEspaco.length();
		int raizQuadrada = (int) Math.ceil(Math.sqrt(quantidadeDeLetras));
	
		final Character[][] matriz = Questao03.criandoMatriz(textoSemEspaco, raizQuadrada);
		final Character[][] matrizInvertida = Questao03.inverterMatriz(matriz, raizQuadrada);
		
		final String textoEncriptado = Questao03.converterMatrizParaString(matrizInvertida, raizQuadrada);
		
		assertEquals("omd luo an", textoEncriptado);
	}

}
