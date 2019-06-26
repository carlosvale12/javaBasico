package com.cvaleriano.curso.interfas.impl;

import com.cvaleriano.curso.interfas.CalculadoraBasica;

/**
 * @author cvaleriano
 *
 */
public class CallCalculadora {
	
	private CalculadoraBasica calculadora;
	
	public static void main(String[] args) {
		CallCalculadora cal = new CallCalculadora();
		cal.funcionesBasicas();
	}
	
	private void funcionesBasicas() {
		calculadora = new CalculadoraBasicaImpl();
		Float[] elements = {1f,2f,3f,4f,5f};
		System.out.print("ELEMENTOS: ");
		for (Float float1 : elements)
			System.out.print(float1+", ");
		System.out.println("");
		System.out.println("SUMA: "+ calculadora.suma(elements));
		System.out.println("RESTA: "+ calculadora.resta(elements));
		System.out.println("MULTIPLICACION: "+ calculadora.multiplicion(elements));
		System.out.println("DIVICION: "+ calculadora.divicion(elements));
	}

}
