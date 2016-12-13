/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rodrigodeleon.servidor;

import com.rodrigodeleon.common.IControllerJuego;
import java.util.List;

/**
 *
 * @author Rodrigo
 */
public class Juego {

    private static Juego instancia;
    private Jugador jugadorEnTurno;
    private static List<Jugador> jugadores;
    private Tablero tablero;

    private Juego() {

        tablero = Tablero.getInstance();

    }

    public static Juego getInstance() {
        if (instancia == null) {
            instancia = new Juego();

        }
        return instancia;
    }

    public Jugador getSiguienteJugador(Jugador miJugador) {

        for (int i = 0; i < jugadores.size() - 1; i++) {
            if (jugadores.get(i).equals(miJugador))
            {
                return jugadores.get(i+1);
            }
        }
        return jugadores.get(0);
        
    }

    public void setJugadorEnTurno(Jugador jugadorEnTurno) {
        this.jugadorEnTurno = jugadorEnTurno;
    }

    public Jugador getJugadorEnTurno() {
        return jugadorEnTurno;
    }

    public static List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Tablero getTablero() {

        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public Juego(Jugador jugadorEnTurno, List<Jugador> jugadores, Tablero tablero) {
        this.jugadorEnTurno = jugadorEnTurno;
        this.jugadores = jugadores;
        this.tablero = tablero;
    }

}
