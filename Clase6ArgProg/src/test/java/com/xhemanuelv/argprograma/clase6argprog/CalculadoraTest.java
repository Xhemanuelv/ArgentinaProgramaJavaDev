package com.xhemanuelv.argprograma.clase6argprog;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author xhema
 */
public class CalculadoraTest {

    public CalculadoraTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of sumar method, of class Calculadora.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        double unNumero = 20.0;
        double otroNumero = 8.0;
        Calculadora instance = new Calculadora();
        double expResult = 28.0;
        double result = instance.sumar(unNumero, otroNumero);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of multiplicar method, of class Calculadora. generado
     * automaticamente con netbeans y modificado para Ej. 1
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        double unNumero = 80.0;
        double otroNumero = 3.0;
        Calculadora instance = new Calculadora();
        double expResult = 240.0;
        double result = instance.multiplicar(unNumero, otroNumero);
        assertEquals(expResult, result, 0);
    }

    /**
     * Ej. 2
     */
    @Test
    public void testSumarYDividir() {
        Calculadora calculadora = new Calculadora();
        assertEquals(110, calculadora.dividir(calculadora.sumar(150, 180), 3), 0.0);
    }

    /**
     * Ej. 3
     */
    @Test
    public void testRestarYMultiplicar() {
        Calculadora calculadora = new Calculadora();
        assertNotEquals(605, calculadora.multiplicar(calculadora.restar(90, 50), 15), 0.0);
    }

    /**
     * Ej. 4
     */
    @Test
    public void testSumarYMultiplicar() {
        Calculadora calculadora = new Calculadora();
        assertNotEquals(2700, calculadora.multiplicar(calculadora.sumar(70, 40), 25), 0.0);
    }

    /**
     * Test of restar method, of class Calculadora.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        double unNumero = 20.0;
        double otroNumero = 8.0;
        Calculadora instance = new Calculadora();
        double expResult = 12.0;
        double result = instance.restar(unNumero, otroNumero);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of dividir method, of class Calculadora.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        double unNumero = 20.0;
        double otroNumero = 8.0;
        Calculadora instance = new Calculadora();
        double expResult = 2.5;
        double result = instance.dividir(unNumero, otroNumero);
        assertEquals(expResult, result, 0);
    }

}
