package com.cvaleriano.cuso.methodStatic;

/**
 * @author cvaleriano
 *
 */
public class CallStaticMethod {

	public static void main(String[] args) {
		imprimirArea(2, 2);
	}
	
	/** Podemos llamar a la clase rectangulo sin necesidad de crear
	* una instancia de ella gracias a que es staticy desde el inicio 
	* se reserva memoria y se crea una instancia para esa clase
	*/
	public static void imprimirArea(int lado1, int lado2) {
		System.out.println(Rectangulo.area(lado1, lado2));
	}

}
