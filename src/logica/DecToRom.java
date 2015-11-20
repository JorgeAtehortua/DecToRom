/**
 * 
 */
package logica;

/**
 * @author Jorge Atehortua
 * @email jorge.atehortua@gmail.com
 */
public class DecToRom {

	/*
	 * Varibles a utilizar
	 */
	String Miles[] = { "", "M" };
	String Centenas[] = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
	String Decenas[] = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
	String Unidades[] = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IV" };

	/**
	 * Metodo encargado de realizar la conversion de los numeros ingresados
	 * 
	 * @param i
	 *            sera el numero a convertir
	 * @return String el cual contendra el numero romano
	 */
	public String convertir(int i) {
		String numRom = "";

		int u;
		int d;
		int c;
		int m;

		String u_Aux, d_Aux, c_Aux, m_Aux;

		/*
		 * Extraccion de las unidades, decenas, centenas y unidades de mil
		 */
		m = i / 1000;  
		c = (i % 1000) / 100;
		d = (((i % 1000) % 100) / 10);
		u = (((i % 1000) % 100) % 10);

		m_Aux = Miles[m];
		c_Aux = Centenas[c];
		d_Aux = Decenas[d];
		u_Aux = Unidades[u];

		numRom = m_Aux + c_Aux + d_Aux + u_Aux;

		return numRom;
	}
}
