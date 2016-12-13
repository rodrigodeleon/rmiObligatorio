/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rodrigodeleon.servidor;

import com.rodrigodeleon.common.Accion;
import com.rodrigodeleon.common.Jugada;
import com.rodrigodeleon.common.IControllerJuego;

/**
 *
 * @author Rodrigo
 */
public class ControllerJuego implements IControllerJuego{
    
    
    private static ControllerJuego instancia;
    private ControllerJuego(){}
    public static ControllerJuego getInstance()
    {
        if(instancia == null)
            instancia = new ControllerJuego();
        
        return instancia;
    }
    
    public void start()
    {
        Juego.getInstance();
    }
    
    public Jugada ejecutarAccion(Accion a)
    {
        
        return a.ejecutar();
        
    }
    
    public void agregarObserver(Jugador a )
    {
        Juego.getJugadores().add(a);
    }
}

