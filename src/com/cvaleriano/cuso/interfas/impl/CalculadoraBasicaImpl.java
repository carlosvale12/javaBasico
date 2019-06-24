package com.cvaleriano.cuso.interfas.impl;

import com.cvaleriano.cuso.interfas.CalculadoraBasica;

/**
 * @author cvaleriano
 *
 */
public class CalculadoraBasicaImpl implements CalculadoraBasica {

	@Override
	public Float suma(Float[] elements) {
		Float result = 0f;
		for (Float float1 : elements) {
			result+=float1;
		}
		return result;
	}

	@Override
	public Float resta(Float[] elements) {
		Float result = 0f;
		for (Float float1 : elements) {
			result-=float1;
		}
		return result;
	}

	@Override
	public Float multiplicion(Float[] elements) {
		Float result = 1f;
		for (Float float1 : elements) {
			result*=float1;
		}
		return result;
	}

	@Override
	public Float divicion(Float[] elements) {
		Float result = 1f;
		for (Float float1 : elements) {
			result/=float1;
		}
		return result;
	}

}
