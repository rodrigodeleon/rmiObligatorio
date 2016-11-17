/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rodrigodeleon.servidor;

/**
 *
 * @author Rodrigo
 */
class Terreno extends Casillero {
    
    private int casas;
    private Barrio barrio;
    private Jugador jugador;
    private int alquiler;

    public Terreno() {
    }

    public Terreno(int casas, Barrio barrio, Jugador jugador, int alquiler) {
        this.casas = casas;
        this.barrio = barrio;
        this.jugador = jugador;
        this.alquiler = alquiler;
    }

    public Terreno(int casas, Barrio barrio, Jugador jugador, int alquiler, int id, Casillero next) {
        super(id, next);
        this.casas = casas;
        this.barrio = barrio;
        this.jugador = jugador;
        this.alquiler = alquiler;
    }

    public int getCasas() {
        return casas;
    }

    public void setCasas(int casas) {
        this.casas = casas;
    }

    public Barrio getBarrio() {
        return barrio;
    }

    public void setBarrio(Barrio barrio) {
        this.barrio = barrio;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public int getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(int alquiler) {
        this.alquiler = alquiler;
    }
    
    
    
}
