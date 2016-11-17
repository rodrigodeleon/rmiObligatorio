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
public class Mazo {
    
    private String tipo;
    private List<Carta> cartas;

    public Mazo() {
    }

    public Mazo(String tipo, List<Carta> cartas) {
        this.tipo = tipo;
        this.cartas = cartas;
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public List<Carta> getCartas() {
        return cartas;
    }
    
    
}
