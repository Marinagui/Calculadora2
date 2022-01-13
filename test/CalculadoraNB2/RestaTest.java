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
public class RestaTest {
    
    public RestaTest() {
    }

    @Test
    public void testGetResta() {
        System.out.println("getResta");
        double a = 3.0;
        double b = 2.0;
        Resta instance = new Resta();
        double expResult = 1.0;
        double result = instance.getResta(a, b);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testDecrementa() {
        System.out.println("decrementa");
        double a = 3.0;
        Resta instance = new Resta();
        double expResult = 2.0;
        double result = instance.decrementa(a);
        assertEquals(expResult, result, 0.0);
    }
    
}
