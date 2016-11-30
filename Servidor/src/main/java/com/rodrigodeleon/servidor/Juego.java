/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rodrigodeleon.servidor;

import java.util.List;

/**
 *
 * @author Rodrigo
 */
public class Juego {

    private static Juego instancia;
    private Jugador jugadorEnTurno;
    private List<Jugador> jugadores;
    private Tablero tablero;

    private Juego() {

        tablero = Tablero.getInstance();
        
    }
    
    public static Juego getInstance()
    {
        if(instancia ==null)
        {
            instancia = new Juego();
            
        }
        return instancia;
    }

    public void setJugadorEnTurno(Jugador jugadorEnTurno) {
        this.jugadorEnTurno = jugadorEnTurno;
    }

    public Jugador getJugadorEnTurno() {
        return jugadorEnTurno;
    }

    public List<Jugador> getJugadores() {
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
