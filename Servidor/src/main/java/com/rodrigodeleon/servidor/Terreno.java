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
    private int costo;

    public Terreno() {
    }

    public Terreno(int casas, Barrio barrio, Jugador jugador, int costo) {
        this.casas = casas;
        this.barrio = barrio;
        this.jugador = jugador;
        this.costo = costo;
    }

    public Terreno(int casas, Barrio barrio, Jugador jugador, int costo, int id, Casillero next) {
        super(id, next);
        this.casas = casas;
        this.barrio = barrio;
        this.jugador = jugador;
        this.costo = costo;
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

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
    public int getAlquiler()
    
    {
        return (costo * casas) / 20;
    }
    
    
    
}
