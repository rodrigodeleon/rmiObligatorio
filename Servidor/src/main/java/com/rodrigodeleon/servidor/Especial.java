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
public class Especial extends Casillero {
    
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Especial() {
    }

    public Especial(String tipo, int id, Casillero next) {
        super(id, next, ESPECIAL);
        this.tipo = tipo;
    }
    
    public Especial( int id ,String tipo) {
        super(id);
        this.tipo = tipo;
    }

    public Especial(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
