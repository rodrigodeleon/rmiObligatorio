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
public class Accion {
    
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Accion() {
    }
    
    
    public void ejecutar()
    {
        if (tipo.equals("comprar"))
        {
            //llamar a metodo del controller que llame a metodo del tablero que lo modifique
            
        }
    }
    
}
