/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rodrigodeleon.servidor;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rodrigo
 */
public class FactoryCasilleroTest {
    
    public FactoryCasilleroTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getInstance method, of class FactoryCasillero.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        FactoryCasillero expResult = null;
        FactoryCasillero result = FactoryCasillero.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCasilleros method, of class FactoryCasillero.
     */
    @Test
    public void testGetCasilleros() {
        System.out.println("getCasilleros");
        List<Barrio> barrios = null;
        FactoryCasillero instance = null;
        instance.getCasilleros(barrios);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
