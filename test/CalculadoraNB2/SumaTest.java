/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraNB2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author raistlin
 */
public class SumaTest {
    
    public SumaTest() {
    }

    @Test
    public void testGetSuma() {
        System.out.println("getSuma");
        double a = 1.0;
        double b = 1.0;
        Suma instance = new Suma();
        double expResult = 2.0;
        double result = instance.getSuma(a, b);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testIncrementa() {
        System.out.println("incrementa");
        double a = 1.0;
        Suma instance = new Suma();
        double expResult = 2.0;
        double result = instance.incrementa(a);
        assertEquals(expResult, result, 0);
    }
}
