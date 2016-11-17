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
public class Jugador extends Persona{
    
    private int dinero;
    private Casillero posicion;
    private List<Terreno> propiedades;
    private boolean carcel;

    public Jugador() {
    }

    

    public Jugador(int dinero, Casillero posicion, List<Terreno> propiedades, boolean carcel, int id, String nombre, String password) {
        super(id, nombre, password);
        this.dinero = dinero;
        this.posicion = posicion;
        this.propiedades = propiedades;
        this.carcel = carcel;
    }
    

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public Casillero getPosicion() {
        return posicion;
    }

    public void setPosicion(Casillero posicion) {
        this.posicion = posicion;
    }

    public List<Terreno> getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(List<Terreno> propiedades) {
        this.propiedades = propiedades;
    }

    public boolean isCarcel() {
        return carcel;
    }

    public void setCarcel(boolean carcel) {
        this.carcel = carcel;
    }

    public Jugador(int dinero, Casillero posicion, List<Terreno> propiedades, boolean carcel) {
        this.dinero = dinero;
        this.posicion = posicion;
        this.propiedades = propiedades;
        this.carcel = carcel;
    }
    
    
            
    
}
