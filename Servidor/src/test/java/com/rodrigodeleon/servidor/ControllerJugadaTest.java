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
public class ControllerJugadaTest {
    
    public ControllerJugadaTest() {
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
     * Test of getInstance method, of class ControllerJugada.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        ControllerJugada expResult = null;
        ControllerJugada result = ControllerJugada.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of construirJugada method, of class ControllerJugada.
     */
    @Test
    public void testConstruirJugada() {
        System.out.println("construirJugada");
        Accion accionRealizada = null;
        Jugada expResult = null;
        Jugada result = ControllerJugada.construirJugada(accionRealizada);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
