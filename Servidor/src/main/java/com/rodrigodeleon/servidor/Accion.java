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

    public Accion(String tipo) {
        this.tipo = tipo;
    }
    
    
    
    public Jugada ejecutar()
    {
        if (tipo.equals("comprar"))
        {
            
           return ControllerAccion.getinstance().comprar(this);

            
        }
        
        if (tipo.equals("construir"))
        {
            
           return ControllerAccion.getinstance().construir(this);

            
        }
        
        if (tipo.equals("pagarAlquiler"))
        {
            
           return ControllerAccion.getinstance().pagarAlquiler(this);

            
        }
        
        if (tipo.equals("vender"))
        {
            
           return ControllerAccion.getinstance().vender(this);

            
        }
        if (tipo.equals("tirarDado"))
        {
            
           return ControllerAccion.getinstance().tirarDado(this);

            
        }
        
        return null;
    }
    
}
