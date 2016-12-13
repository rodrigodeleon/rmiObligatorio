/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rodrigodeleon.servidor;

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
public class TerrenoTest {
    
    public TerrenoTest() {
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
     * Test of getCasas method, of class Terreno.
     */
    @Test
    public void testGetCasas() {
        System.out.println("getCasas");
        Terreno instance = new Terreno();
        int expResult = 0;
        int result = instance.getCasas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCasas method, of class Terreno.
     */
    @Test
    public void testSetCasas() {
        System.out.println("setCasas");
        int casas = 0;
        Terreno instance = new Terreno();
        instance.setCasas(casas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBarrio method, of class Terreno.
     */
    @Test
    public void testGetBarrio() {
        System.out.println("getBarrio");
        Terreno instance = new Terreno();
        Barrio expResult = null;
        Barrio result = instance.getBarrio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBarrio method, of class Terreno.
     */
    @Test
    public void testSetBarrio() {
        System.out.println("setBarrio");
        Barrio barrio = null;
        Terreno instance = new Terreno();
        instance.setBarrio(barrio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJugador method, of class Terreno.
     */
    @Test
    public void testGetJugador() {
        System.out.println("getJugador");
        Terreno instance = new Terreno();
        Jugador expResult = null;
        Jugador result = instance.getJugador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJugador method, of class Terreno.
     */
    @Test
    public void testSetJugador() {
        System.out.println("setJugador");
        Jugador jugador = null;
        Terreno instance = new Terreno();
        instance.setJugador(jugador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCosto method, of class Terreno.
     */
    @Test
    public void testGetCosto() {
        System.out.println("getCosto");
        Terreno instance = new Terreno();
        int expResult = 0;
        int result = instance.getCosto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCosto method, of class Terreno.
     */
    @Test
    public void testSetCosto() {
        System.out.println("setCosto");
        int costo = 0;
        Terreno instance = new Terreno();
        instance.setCosto(costo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAlquiler method, of class Terreno.
     */
    @Test
    public void testGetAlquiler() {
        System.out.println("getAlquiler");
        Terreno instance = new Terreno();
        int expResult = 0;
        int result = instance.getAlquiler();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
