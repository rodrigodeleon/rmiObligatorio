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
public class ControllerAccionTest {
    
    public ControllerAccionTest() {
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
     * Test of getinstance method, of class ControllerAccion.
     */
    @Test
    public void testGetinstance() {
        System.out.println("getinstance");
        ControllerAccion expResult = null;
        ControllerAccion result = ControllerAccion.getinstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comprar method, of class ControllerAccion.
     */
    @Test
    public void testComprar() {
        System.out.println("comprar");
        Accion miAccion = null;
        ControllerAccion instance = null;
        Jugada expResult = null;
        Jugada result = instance.comprar(miAccion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of vender method, of class ControllerAccion.
     */
    @Test
    public void testVender() {
        System.out.println("vender");
        Accion miAccion = null;
        ControllerAccion instance = null;
        Jugada expResult = null;
        Jugada result = instance.vender(miAccion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pagarAlquiler method, of class ControllerAccion.
     */
    @Test
    public void testPagarAlquiler() {
        System.out.println("pagarAlquiler");
        Accion miAccion = null;
        ControllerAccion instance = null;
        Jugada expResult = null;
        Jugada result = instance.pagarAlquiler(miAccion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tirarDado method, of class ControllerAccion.
     */
    @Test
    public void testTirarDado() {
        System.out.println("tirarDado");
        Accion miAccion = null;
        ControllerAccion instance = null;
        Jugada expResult = null;
        Jugada result = instance.tirarDado(miAccion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of construir method, of class ControllerAccion.
     */
    @Test
    public void testConstruir() {
        System.out.println("construir");
        Accion miAccion = null;
        ControllerAccion instance = null;
        Jugada expResult = null;
        Jugada result = instance.construir(miAccion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
