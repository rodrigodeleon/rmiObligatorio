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
public class JuegoTest {
    
    public JuegoTest() {
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
     * Test of getInstance method, of class Juego.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        Juego expResult = null;
        Juego result = Juego.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSiguienteJugador method, of class Juego.
     */
    @Test
    public void testGetSiguienteJugador() {
        System.out.println("getSiguienteJugador");
        Jugador miJugador = null;
        Juego instance = null;
        Jugador expResult = null;
        Jugador result = instance.getSiguienteJugador(miJugador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJugadorEnTurno method, of class Juego.
     */
    @Test
    public void testSetJugadorEnTurno() {
        System.out.println("setJugadorEnTurno");
        Jugador jugadorEnTurno = null;
        Juego instance = null;
        instance.setJugadorEnTurno(jugadorEnTurno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJugadorEnTurno method, of class Juego.
     */
    @Test
    public void testGetJugadorEnTurno() {
        System.out.println("getJugadorEnTurno");
        Juego instance = null;
        Jugador expResult = null;
        Jugador result = instance.getJugadorEnTurno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJugadores method, of class Juego.
     */
    @Test
    public void testGetJugadores() {
        System.out.println("getJugadores");
        List<Jugador> expResult = null;
        List<Jugador> result = Juego.getJugadores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJugadores method, of class Juego.
     */
    @Test
    public void testSetJugadores() {
        System.out.println("setJugadores");
        List<Jugador> jugadores = null;
        Juego instance = null;
        instance.setJugadores(jugadores);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTablero method, of class Juego.
     */
    @Test
    public void testGetTablero() {
        System.out.println("getTablero");
        Juego instance = null;
        Tablero expResult = null;
        Tablero result = instance.getTablero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTablero method, of class Juego.
     */
    @Test
    public void testSetTablero() {
        System.out.println("setTablero");
        Tablero tablero = null;
        Juego instance = null;
        instance.setTablero(tablero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
