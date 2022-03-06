package testesUnitarios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;

import desafios.Questao02;

class Questao02Test {

	@Test
	void testNumeroDeElementosParesComVetorImpar() {
		final int[] array = {1, 5, 3, 4, 2};
	
		final Map<Integer, Integer> map = Questao02.construirHashMap(array);
		int maiorValor = Questao02.getMaiorValorDoHashMap(map);
		
		assertEquals(3, maiorValor);
	}
	
	@Test
	void testNumeroDeElementosParesComVetorPar() {
		final int[] array = {1, 2, 3, 4};
	
		final Map<Integer, Integer> map = Questao02.construirHashMap(array);
		int maiorValor = Questao02.getMaiorValorDoHashMap(map);
		
		assertEquals(2, maiorValor);
	}


}
