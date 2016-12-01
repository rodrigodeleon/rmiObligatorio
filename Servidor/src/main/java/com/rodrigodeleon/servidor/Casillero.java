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
 class Casillero {
   
     public static final int TERRENO = 1;
     public static final int ESPECIAL = 2;
     
    private int id;
    private Casillero next;
    protected int tipoCasilllero;

    public int getTipoCasillero() {
        return tipoCasilllero;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Casillero getNext() {
        return next;
    }

    public void setNext(Casillero next) {
        this.next = next;
    }

    public Casillero() {
    }
    public Casillero(int id)
    {
        this.id = id;
    }

    public Casillero(int id, Casillero next, int tipo) {
        this.id = id;
        this.next = next;
        this.tipoCasilllero = tipo;
    }
    
   
    
    
}
