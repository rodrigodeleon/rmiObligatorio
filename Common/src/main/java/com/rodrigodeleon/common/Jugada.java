/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rodrigodeleon.common;

import com.rodrigodeleon.servidor.Jugador;
import com.rodrigodeleon.servidor.*;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Rodrigo
 */
public class Jugada implements Serializable{
    
    private Accion accionRealizada;
    private Jugador jugadorAnterior;
    
    private Jugador siguienteJugador;
    private List<Accion> accionesDisponibles;

    public Jugada() {
    }

    public Accion getAccionRealizada() {
        return accionRealizada;
    }

    public void setAccionRealizada(Accion accionRealizada) {
        this.accionRealizada = accionRealizada;
    }

    public Jugador getJugadorAnterior() {
        return jugadorAnterior;
    }

    public void setJugadorAnterior(Jugador jugadorAnterior) {
        this.jugadorAnterior = jugadorAnterior;
    }

    public Jugador getSiguienteJugador() {
        return siguienteJugador;
    }

    public void setSiguienteJugador(Jugador siguienteJugador) {
        this.siguienteJugador = siguienteJugador;
    }

    public List<Accion> getAccionesDisponibles() {
        return accionesDisponibles;
    }

    public void setAccionesDisponibles(List<Accion> accionesDisponibles) {
        this.accionesDisponibles = accionesDisponibles;
    }
    
    
  
    
}


