/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rodrigodeleon.servidor;

import com.rodrigodeleon.common.IControllerAccion;
import com.rodrigodeleon.common.IControllerJuego;
import com.rodrigodeleon.common.IControllerJugada;
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
public class ServerTest {
    
    public ServerTest() {
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
     * Test of sayHello method, of class Server.
     */
    @Test
    public void testSayHello() throws Exception {
        System.out.println("sayHello");
        Server instance = new Server();
        String expResult = "";
        String result = instance.sayHello();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addObserver method, of class Server.
     */
    @Test
    public void testAddObserver() throws Exception {
        System.out.println("addObserver");
        Jugador jugador = null;
        Server instance = new Server();
        instance.addObserver(jugador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getControllerAccion method, of class Server.
     */
    @Test
    public void testGetControllerAccion() throws Exception {
        System.out.println("getControllerAccion");
        Server instance = new Server();
        IControllerAccion expResult = null;
        IControllerAccion result = instance.getControllerAccion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getControllerJugada method, of class Server.
     */
    @Test
    public void testGetControllerJugada() throws Exception {
        System.out.println("getControllerJugada");
        Server instance = new Server();
        IControllerJugada expResult = null;
        IControllerJugada result = instance.getControllerJugada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getControllerJuego method, of class Server.
     */
    @Test
    public void testGetControllerJuego() throws Exception{
        System.out.println("getControllerJuego");
        Server instance = new Server();
        IControllerJuego expResult = null;
        IControllerJuego result = instance.getControllerJuego();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
