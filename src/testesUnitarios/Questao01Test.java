package testesUnitarios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import desafios.Questao01;

class Questao01Test {

	@Test
	void testMedianaComVetorImpar() {
		final int[] array = {9, 2, 1, 4, 6};
	
		int[] arrayOrdenado = Questao01.ordenarVetorCrescente(array, array.length);
		float mediana = Questao01.mediana(arrayOrdenado);
		
		assertEquals(4.000, mediana, 0.0001);
	}

	@Test
	void testMedianaComVetorPar() {
		final int[] array = {1, 2, 3, 4};
	
		int[] arrayOrdenado = Questao01.ordenarVetorCrescente(array, array.length);
		float mediana = Questao01.mediana(arrayOrdenado);
		
		assertEquals(2.5000, mediana, 0.0001);
	}
	
	@Test
	void testMedianaComUmValorNoVetor() {
		final int[] array = {2};
	
		int[] arrayOrdenado = Questao01.ordenarVetorCrescente(array, array.length);
		float mediana = Questao01.mediana(arrayOrdenado);
		
		assertEquals(2.000, mediana, 0.0001);
	}
}
