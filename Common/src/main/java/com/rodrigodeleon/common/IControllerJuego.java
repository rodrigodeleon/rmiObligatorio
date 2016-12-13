/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rodrigodeleon.common;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Rodrigo
 */
public interface IControllerJuego extends Remote {
    
       public void start() throws RemoteException;
    
       public Jugada ejecutarAccion(Accion miAccion);

    
}
