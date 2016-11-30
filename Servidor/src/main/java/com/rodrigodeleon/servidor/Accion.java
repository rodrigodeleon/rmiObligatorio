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
            
           ControllerAccion.getinstance().comprar();

            
        }
        
        if (tipo.equals("construir"))
        {
            
           ControllerAccion.getinstance().construir();

            
        }
        
        if (tipo.equals("alquilar"))
        {
            
           ControllerAccion.getinstance().alquilar();

            
        }
        
        if (tipo.equals("vender"))
        {
            
           ControllerAccion.getinstance().vender();

            
        }
        if (tipo.equals("tirarDado"))
        {
            
           ControllerAccion.getinstance().tirarDado();

            
        }
    }
    
}
