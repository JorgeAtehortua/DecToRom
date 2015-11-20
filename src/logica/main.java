/**
 * 
 */
package logica;

import java.util.Scanner;

/**
 * @author	Jorge Atehortua
 * @email 	jorge.atehortua@gmail.com
 */
public class main {

	/**
	 * Metodo principal para realizar el ingreso de un numero y convertirlo
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Por favor ingrese un numero entre 1 y 1000");
		Scanner in =new Scanner(System.in); 
		int numero = Integer.parseInt(in.next());
		DecToRom convertidor = new DecToRom();
		String romano = convertidor.convertir(numero);
		System.out.println(numero +" = " +romano);

	}

}

