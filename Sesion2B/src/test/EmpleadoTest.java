package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Empleado;
import pkg.Empleado.tipo;

class EmpleadoTest {
	
	private tipo v=tipo.Vendedor;
	private tipo e=tipo.Encargado;
	
	private tipo otro=tipo.Otro;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("set up...");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("after each...");
	}
	
/*
 * 
 * CASOS DE PRUEBA POSITIVOS
 * 
 * */
	@Test
	void testCalculoNominalBruto() {
		float ventas=1100;
		float extra=4;
		float actual=Empleado.CalculoNominalBruto(v,ventas,extra);
		float esperado=2220;
		assertEquals(esperado, actual);
	}

	@Test
	void testCalculoNominaNeta() {
		float bruta=2220;
		float actual=Empleado.CalculoNominaNeta(bruta);
		float esperado=1887;
		assertEquals(esperado, actual);
	}
	
/*
 * 
 * CASOS DE PRUEBA NEGATIVOS
 * 
 * */

	@Test
	void testCalculoNominalBrutoNegativo() {
		float ventas=1100;
		float extra=-400;
		float actual=Empleado.CalculoNominalBruto(v,ventas,extra);
		float esperado=-9900;
		assertEquals(esperado, actual);
	}
	@Test
	void testCalculoNominaNetaNegativo() {
		float bruta=-200;
		float actual=Empleado.CalculoNominaNeta(bruta);
		float esperado=-200;
		assertEquals(esperado, actual);
	}
/*
* 
* CASOS DE PRUEBA PARA TIPO DE EMPLEADO
* 
*   
*/
	
	@Test
	void testCalculoNominalBrutoEncargado() {
		float ventas=1100;
		float extra=4;
		float actual=Empleado.CalculoNominalBruto(e,ventas,extra);
		float esperado=3720;
		assertEquals(esperado, actual);
	}

	@Test
	void testCalculoNominalBrutoVendedor() {
		float ventas=1100;
		float extra=4;
		float actual=Empleado.CalculoNominalBruto(v,ventas,extra);
		float esperado=2220;
		assertEquals(esperado, actual);
	}
	
	@Test
	void testCalculoNominalBrutoOtros() {
		float ventas=1100;
		float extra=4;
		float actual=Empleado.CalculoNominalBruto(otro,ventas,extra);
		float esperado=220;
		assertEquals(esperado, actual);
	}

/*
 * 
 * CASOS DE PRUEBA PARA RANGOS DE VENTAS
 *  
 * */
	@Test
	void testCalculoNominalBrutorPrima100() {
		float ventas=1100;
		float extra=4;
		float actual=Empleado.CalculoNominalBruto(v,ventas,extra);
		float esperado=2220;
		assertEquals(esperado, actual);
	}
	@Test
	void testCalculoNominalBrutorPrima200() {
		float ventas=2000;
		float extra=4;
		float actual=Empleado.CalculoNominalBruto(v,ventas,extra);
		float esperado=2320;
		assertEquals(esperado, actual);
	}
	@Test
	void testCalculoNominalBrutorPrima0() {
		float ventas=200;
		float extra=4;
		float actual=Empleado.CalculoNominalBruto(v,ventas,extra);
		float esperado=2120;
		assertEquals(esperado, actual);
	}
	
/*
 * 
 * CASOS DE PRUEBA PARA CALCULO NOMINAL NETO
 * 
 * */
	
	@Test
	void testCalculoNominaNetaRentencion0() {
		float bruta=1000;
		float actual=Empleado.CalculoNominaNeta(bruta);
		float esperado=bruta;
		assertEquals(esperado, actual);
	}
	
	@Test
	void testCalculoNominaNetaRentencion15() {
		float bruta=2220;
		float actual=Empleado.CalculoNominaNeta(bruta);
		float esperado=1887;
		assertEquals(esperado, actual);
	}
	
	@Test
	void testCalculoNominaNetaRentencion18() {
		float bruta=3000;
		float actual=Empleado.CalculoNominaNeta(bruta);
		float esperado=2460;
		assertEquals(esperado, actual);
	}
}
