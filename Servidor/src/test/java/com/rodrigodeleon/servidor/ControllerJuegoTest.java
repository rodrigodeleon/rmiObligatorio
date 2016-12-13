/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rodrigodeleon.servidor;

import com.rodrigodeleon.common.Accion;
import com.rodrigodeleon.common.Jugada;
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
public class ControllerJuegoTest {
    
    public ControllerJuegoTest() {
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
     * Test of getInstance method, of class ControllerJuego.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        ControllerJuego expResult = null;
        ControllerJuego result = ControllerJuego.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of start method, of class ControllerJuego.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        ControllerJuego instance = null;
        instance.start();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ejecutarAccion method, of class ControllerJuego.
     */
    @Test
    public void testEjecutarAccion() {
        System.out.println("ejecutarAccion");
        Accion a = null;
        ControllerJuego instance = null;
        Jugada expResult = null;
        Jugada result = instance.ejecutarAccion(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarObserver method, of class ControllerJuego.
     */
    @Test
    public void testAgregarObserver() {
        System.out.println("agregarObserver");
        Jugador a = null;
        ControllerJuego instance = null;
        instance.agregarObserver(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJuego method, of class ControllerJuego.
     */
    @Test
    public void testGetJuego() {
        System.out.println("getJuego");
        ControllerJuego instance = null;
        Juego expResult = null;
        Juego result = instance.getJuego();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
