package io.github.olivmnd.servicos;

import io.github.olivmnd.exceptions.DivisaoPorZeroException;

public class Calculadora {

	public int somar(int a, int b) {
		return a + b;
	}

	public int subtrair(int a, int b) {

		return a-b;
	}

	public int dividir(int a, int b) throws DivisaoPorZeroException {
		if(b == 0) {
			throw new DivisaoPorZeroException();
		}
		return a/b;
	}

}
