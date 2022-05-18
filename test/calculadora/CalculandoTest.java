/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit3TestClass.java to edit this template
 */
package calculadora;

import junit.framework.TestCase;

/**
 *
 * @author it-ra
 */
public class CalculandoTest extends TestCase {
    
    public CalculandoTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of add method, of class Calculando.
     */
    public void testAdd() {
        System.out.println("add");
        double number1 = 200.002;
        double number2 = 100.001;
        Calculando instance = new Calculando();
        double expResult = 300.003;
        double result = instance.add(number1, number2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of subtract method, of class Calculando.
     */
    public void testSubtract() {
        System.out.println("subtract");
        double number1 = 200.002;
        double number2 = 100.001;
        Calculando instance = new Calculando();
        double expResult = 100.001;
        double result = instance.subtract(number1, number2);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of multiply method, of class Calculando.
     */
    public void testMultiply() {
        System.out.println("multiply");
        double number1 = 100.001;
        double number2 = 200.002;
        Calculando instance = new Calculando();
        double expResult = 20000.4;
        double result = instance.multiply(number1, number2);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of divide method, of class Calculando.
     */
    public void testDivide() {
        System.out.println("divide");
        double number1 = 200.002;
        double number2 = 100.001;
        Calculando instance = new Calculando();
        double expResult = 3.0;
        double result = instance.divide(number1, number2);
        assertEquals(expResult, result, 0.0);
    }
    
}
