package com.cvaleriano.curso.methodStatic;

/**
 * @author cvaleriano
 *
 */
public class Rectangulo {

	/**
	 * @param lado1 
	 * @param lado2
	 * @return el area de un rectangulo
	 * */
	public static double area(int lado1, int lado2) {
		return lado1 * lado2;
	}

	/**
	 * @param lado1 
	 * @param lado2
	 * @return el perimetro de un rectangulo
	 * */
	public static double perimetro(int lado1, int lado2) {
		return lado1 * 2 + lado2 * 2;
	}
}
