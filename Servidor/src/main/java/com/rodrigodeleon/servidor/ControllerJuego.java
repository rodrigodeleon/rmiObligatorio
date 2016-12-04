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
public class ControllerJuego {
    
    public Jugada ejecutarAccion(Accion miAccion)
    {
        return miAccion.ejecutar();
        
    }
}

