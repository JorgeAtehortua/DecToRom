/**
 * 
 */
package test;

import static org.junit.Assert.*;

import org.junit.Test;

import logica.DecToRom;

/**
 * @author Jorge Atehortua
 * @email jorge.atehortua@gmail.com
 */
public class DecToRomTest {

	@Test
	public void pruebaCon_0() {
		DecToRom romano = new DecToRom();
		assertEquals("", romano.convertir(0));
	}
	
	@Test
	public void pruebaCon_1() {
		DecToRom romano = new DecToRom();
		assertEquals("I", romano.convertir(1));
	}
	
	@Test
	public void pruebaCon_11() {
		DecToRom romano = new DecToRom();
		assertEquals("XI", romano.convertir(11));
	}
	
	@Test
	public void pruebaCon_111() {
		DecToRom romano = new DecToRom();
		assertEquals("CXI", romano.convertir(111));
	}
	@Test
	public void pruebaCon_1000() {
		DecToRom romano = new DecToRom();
		assertEquals("M", romano.convertir(1000));
	}
}
