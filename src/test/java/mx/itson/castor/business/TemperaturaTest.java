/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.itson.castor.business;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author icesp
 */
public class TemperaturaTest {
    
    public TemperaturaTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    /**
     * Test of convertirGrados method, of class Temperatura.
     */
    @org.junit.jupiter.api.Test
    public void testConvertirGrados() {
        //Nombre y descripción de caso de prueba
        System.out.println("convertirGrados");
        //Input o datos de entrada
        double centigrados = 25;
        //Resultado esperado
        double expResult = 77;
        
        //Actual result (resultado obtenido)
        double result = Temperatura.convertirGrados(centigrados);
        
        //Ejecución de la prueba
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of calcularAreaTriangulo method, of class Temperatura.
     */
    @Test
    public void testCalcularAreaTriangulo() {
        System.out.println("calcularAreaTriangulo");
        double base = 5;
        double altura = 8;
        double expResult = 20;
        double result = Temperatura.calcularAreaTriangulo(base, altura);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of horasAMinutos method, of class Temperatura.
     */
    @Test
    public void testHorasAMinutos() {
        System.out.println("horasAMinutos");
        int horas = 4;
        int expResult = 240;
        int result = Temperatura.horasAMinutos(horas);
        assertEquals(expResult, result);
    }
    
}
