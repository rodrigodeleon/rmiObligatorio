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
public class JugadorTest {
    
    public JugadorTest() {
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
     * Test of getDinero method, of class Jugador.
     */
    @Test
    public void testGetDinero() {
        System.out.println("getDinero");
        Jugador instance = new Jugador();
        int expResult = 0;
        int result = instance.getDinero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDinero method, of class Jugador.
     */
    @Test
    public void testSetDinero() {
        System.out.println("setDinero");
        int dinero = 0;
        Jugador instance = new Jugador();
        instance.setDinero(dinero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPosicion method, of class Jugador.
     */
    @Test
    public void testGetPosicion() {
        System.out.println("getPosicion");
        Jugador instance = new Jugador();
        Casillero expResult = null;
        Casillero result = instance.getPosicion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPosicion method, of class Jugador.
     */
    @Test
    public void testSetPosicion() {
        System.out.println("setPosicion");
        Casillero posicion = null;
        Jugador instance = new Jugador();
        instance.setPosicion(posicion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPropiedades method, of class Jugador.
     */
    @Test
    public void testGetPropiedades() {
        System.out.println("getPropiedades");
        Jugador instance = new Jugador();
        List<Terreno> expResult = null;
        List<Terreno> result = instance.getPropiedades();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPropiedades method, of class Jugador.
     */
    @Test
    public void testSetPropiedades() {
        System.out.println("setPropiedades");
        List<Terreno> propiedades = null;
        Jugador instance = new Jugador();
        instance.setPropiedades(propiedades);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCarcel method, of class Jugador.
     */
    @Test
    public void testIsCarcel() {
        System.out.println("isCarcel");
        Jugador instance = new Jugador();
        boolean expResult = false;
        boolean result = instance.isCarcel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCarcel method, of class Jugador.
     */
    @Test
    public void testSetCarcel() {
        System.out.println("setCarcel");
        boolean carcel = false;
        Jugador instance = new Jugador();
        instance.setCarcel(carcel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
