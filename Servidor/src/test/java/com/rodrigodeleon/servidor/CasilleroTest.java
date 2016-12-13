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
public class CasilleroTest {
    
    public CasilleroTest() {
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
     * Test of getTipoCasillero method, of class Casillero.
     */
    @Test
    public void testGetTipoCasillero() {
        System.out.println("getTipoCasillero");
        Casillero instance = new Casillero();
        int expResult = 0;
        int result = instance.getTipoCasillero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Casillero.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Casillero instance = new Casillero();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Casillero.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Casillero instance = new Casillero();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNext method, of class Casillero.
     */
    @Test
    public void testGetNext() {
        System.out.println("getNext");
        Casillero instance = new Casillero();
        Casillero expResult = null;
        Casillero result = instance.getNext();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNext method, of class Casillero.
     */
    @Test
    public void testSetNext() {
        System.out.println("setNext");
        Casillero next = null;
        Casillero instance = new Casillero();
        instance.setNext(next);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
