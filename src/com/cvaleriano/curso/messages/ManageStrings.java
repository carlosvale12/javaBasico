package com.cvaleriano.curso.messages;

/**
 * @author cvaleriano
 *
 * Ejemplo del manejo de cadenas en java.
 */
public class ManageStrings {

	/**
	 * El paquete java.lang contiene dos clases de cadenas: 
	 * <b>String y StringBuffer. <b> La clase String se utiliza cuando se 
	 * trabaja con cadenas que no pueden cambiar. Por otro lado, StringBuffer, 
	 * se utiliza cuando se quiere manipular el contenido de una cadena. 
	 * El entorno de desarrollo Java proporciona dos clases para manipular y 
	 * almacenar datos del tipo carácter: String, para cadenas constantes, y 
	 * StringBuffer, para cadenas que pueden cambiar. Como son constantes, 
	 * los Strings son más económicos (utilizan menos memoria) que los 
	 * StringBuffers y pueder ser compartidos. Por eso es importante 
	 * utilizar String siempre que sea apropiado.
	 * */
	public static void main(String[] args) {
		methodString();

		methodStringBuffer();
	}

	/**
	 * Muchos Strings se crean a partir de cadenas literales. 
	 * Cuando el compilador encuentra una serie de caracteres entre 
	 * comillas (" y "), crea un objeto String cuyo valor es el propio texto. 
	 * El esquema general es el siguiente: String nombre="cadena"; 
	 * Cuando el compilador encuentra la siguente cadena, crea un objeto 
	 * String cuyo valor es Hola Mundo.
	 * */
	private static void methodString() {
		System.out.println("/** methodString  **/");
		String hola="Hola mundo";
		System.out.println(hola);

		// charAt 
		// Esta propiedad nos devuelve el caracter de una posición espécifica. 
		char letra = hola.charAt(5);
		System.out.println("Caracter en la posicion 2: " + letra);
		
		// concat
		// concatenar (unir, lo que tenemos en una cadena con lo que tenemos en otra 
		// cadena.)
		String concat1= "Typing ";
		String concat2= " Code";
		System.out.println(concat1.concat(concat2));
		
		// IndexOf
		// Encontrar en que posición de un String se encuentra determinado caracter
		// solo el de la primera coincidencia de no encontrarlo retorna -1.
		String indexof1 = "Typing Code";
		int posicion = indexof1.indexOf('C');
		System.out.println(indexof1 + " posicion de caracter 'C': "+ posicion);
		
		// IndexOf
		// Encontrar en que posición de un String se encuentra otro String
		// solo el de la primera coincidencia de no encontrarlo retorna -1.
		String indexof2 = "Typing Code";
		String buscar = "ping";
		System.out.println("Se encontro la coincidencia ping a partir de la posición "+indexof2.indexOf(buscar));
		
		// replace, replaceAll
		String replace = "Typing Code";
		String nombreCambiado = replace.replace('y','a'); 
		System.out.println(nombreCambiado);
		String cadena = "Guatemala 19 de marzo del 2013";
		String expresionRegular = "[0-9]+";
		String salida = cadena.replaceAll(expresionRegular, "NUM"); 
		System.out.println(salida);
		
		// matches Compara una cadena con una Expresion regular, devuelve true si coincide o false si no coincide.
		//cualquier letra mayuscula o minuscula sin tildes, sin espacios y sin numeros.
		String expReg = "[A-Za-z]+"; 
		String cadValidate = "expresion1";
		if (cadValidate.matches(expReg)){ 
			System.out.println("coincide");
		}
		else {
			System.out.println("No coincide"); 
		}
		
		// split Devuelve un vector (Array), con tantas posiciones como caracteres encuentre del parametro que le enviamos.
		String split = "Nery Estuardo Yucute Castellanos"; 
		String vector[] = split.split(" ");
		System.out.println("Split vector[]: ");
		for (String string : vector) {
			System.out.println("\t\t"+string);
		}
		
		
		// equals Devuelve true si una cadena es igual a la otra y false en caso contrario. 
		// Hace distincion de mayusculas y minusculas
		String string = "compara cadena";
		String stringAcomparar = "Compara cadena";
		System.out.println("equal de cadenas: " + string.contentEquals(stringAcomparar));
		System.out.println("equalIgnoreCase de cadenas: " + string.equalsIgnoreCase(stringAcomparar));
	}

	/**
	 * StringBuffer es una clase gemela de String que proporciona gran parte de la 
	 * funcionalidad de la utilización habitual de las cadenas. 
	 * StringBuffer representa secuencias de caracteres que se pueden ampliar 
	 * y modificar. Java utiliza ambas clases con frecuencia, pero muchos 
	 * programadores sólo tratan con String y permiten que Java manipule 
	 * StringBuffer por su cuenta mediante el operador sobrecargado '+'.
	 * */
	private static void methodStringBuffer() {
		System.out.println("/**  methodStringBuffer **/");
		StringBuffer sb = new StringBuffer("Bebe Caliente!");
		sb.insert(5, "Java ");
		System.out.println(sb.toString());
		System.out.println("reverseIt: "+ reverseIt(sb.toString()));
	}
	private static String reverseIt(String source) {
		int i, len = source.length();
		StringBuffer dest = new StringBuffer(len);
		for (i = (len - 1); i >= 0; i--) {
			dest.append(source.charAt(i));
		}
		return dest.toString();
	}
}
