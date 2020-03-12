import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JulgamentoPrisioneiroTest {

	@Test
	void testCalculaPenaMutua() {

		JulgamentoPrisioneiro julgamento = new JulgamentoPrisioneiro();
		int resultadoEsperado = 5;
		int resultadoReal = julgamento.calculaPena("sim", "sim");
		assertEquals(resultadoEsperado, resultadoReal);

	}

	@Test
	void testCalculaPenaIndividual() {

		JulgamentoPrisioneiro julgamento = new JulgamentoPrisioneiro();
		int resultadoEsperado = 10;
		int resultadoReal = julgamento.calculaPena("sim", "nao");
		assertEquals(resultadoEsperado, resultadoReal);

	}

	@Test
	void testCalculaPenaCumplices() {

		JulgamentoPrisioneiro julgamento = new JulgamentoPrisioneiro();
		int resultadoEsperado = 1;
		int resultadoReal = julgamento.calculaPena("nao", "sim");
		assertEquals(resultadoEsperado, resultadoReal);

	}

	@Test
	void testCalculaPenaInocente() {

		JulgamentoPrisioneiro julgamento = new JulgamentoPrisioneiro();
		int resultadoEsperado = 0;
		int resultadoReal = julgamento.calculaPena("nao", "nao");
		assertEquals(resultadoEsperado, resultadoReal);

	}

}
