package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class CuentaTest {
	static Cuenta ctaPrueba;
	static Cuenta ctaPrueba2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ctaPrueba=new Cuenta(50, "amigo1", "12345");
		ctaPrueba2=new Cuenta(0, "amigo2", "67890");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
/*
	@Test
	void testIngresar() {
		ctaPrueba.Ingresar(3000);
		assertEquals(3050,ctaPrueba.getSaldo());
		ctaPrueba.Retirar(3000);
	}
	
	@Test
	void testRetirar() {
		ctaPrueba.Retirar(0);
		assertEquals(50,ctaPrueba.getSaldo());
	}
*/
	//PRUEBAS EN CLASE
	//INTRUCCIONES
	@Test
	void testCuenta12345() {
		//cuenta 12345
		ctaPrueba.Retirar(200);
		ctaPrueba.Ingresar(100);
		ctaPrueba.Retirar(200);
		double o=-250;
		assertEquals(o,ctaPrueba.getSaldo());
	}
	@Test
	void testCuenta67890() {
		//cuenta 67890
		ctaPrueba2.Retirar(350);
		ctaPrueba2.Retirar(200); //esta linea debe trigear un error en la funcion de retirar
		ctaPrueba2.Retirar(150);
		ctaPrueba2.Ingresar(50);
		ctaPrueba2.Retirar(100);
		double o=-450;
		assertEquals(o,ctaPrueba2.getSaldo());
	}

}
