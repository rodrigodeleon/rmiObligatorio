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
    
    private int id;
    private Casillero next;

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

    public Casillero(int id, Casillero next) {
        this.id = id;
        this.next = next;
    }
    
   
    
    
}
