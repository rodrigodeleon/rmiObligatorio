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
public class BarrioTest {
    
    public BarrioTest() {
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
     * Test of getId method, of class Barrio.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Barrio instance = new Barrio();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Barrio.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Barrio instance = new Barrio();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValorCasa method, of class Barrio.
     */
    @Test
    public void testGetValorCasa() {
        System.out.println("getValorCasa");
        Barrio instance = new Barrio();
        int expResult = 0;
        int result = instance.getValorCasa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValorCasa method, of class Barrio.
     */
    @Test
    public void testSetValorCasa() {
        System.out.println("setValorCasa");
        int valorCasa = 0;
        Barrio instance = new Barrio();
        instance.setValorCasa(valorCasa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListPropiedades method, of class Barrio.
     */
    @Test
    public void testGetListPropiedades() {
        System.out.println("getListPropiedades");
        Barrio instance = new Barrio();
        List<Terreno> expResult = null;
        List<Terreno> result = instance.getListPropiedades();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListPropiedades method, of class Barrio.
     */
    @Test
    public void testSetListPropiedades() {
        System.out.println("setListPropiedades");
        List<Terreno> listPropiedades = null;
        Barrio instance = new Barrio();
        instance.setListPropiedades(listPropiedades);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
