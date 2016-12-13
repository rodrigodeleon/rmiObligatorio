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
public class TableroTest {
    
    public TableroTest() {
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
     * Test of getInstance method, of class Tablero.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        Tablero expResult = null;
        Tablero result = Tablero.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStart method, of class Tablero.
     */
    @Test
    public void testGetStart() {
        System.out.println("getStart");
        Casillero expResult = null;
        Casillero result = Tablero.getStart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBarrios method, of class Tablero.
     */
    @Test
    public void testGetBarrios() {
        System.out.println("getBarrios");
        Tablero instance = null;
        List<Barrio> expResult = null;
        List<Barrio> result = instance.getBarrios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMazos method, of class Tablero.
     */
    @Test
    public void testGetMazos() {
        System.out.println("getMazos");
        Tablero instance = null;
        List<Mazo> expResult = null;
        List<Mazo> result = instance.getMazos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStart method, of class Tablero.
     */
    @Test
    public void testSetStart() {
        System.out.println("setStart");
        Casillero start = null;
        Tablero.setStart(start);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarTablero method, of class Tablero.
     */
    @Test
    public void testListarTablero() {
        System.out.println("listarTablero");
        Tablero instance = null;
        instance.listarTablero();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
