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
public interface IServer extends Remote {
    
        public String sayHello() throws RemoteException;

        public IControllerJuego getControllerJuego() throws RemoteException;
	
	public IControllerJugada getControllerJugada() throws RemoteException;
	
	public IControllerAccion getControllerAccion() throws RemoteException;
	
//	public void sendMessage(String message) throws RemoteException;

	//public void addObserver(IJugador jugador) throws RemoteException;
	
	/*public List<Observer> getObservers() throws RemoteException;
	
	
	public void setJugador(JugadorDTO jugador) throws RemoteException;
	
	public void pagarMulta(JugadorDTO dueño, int cantidad) throws RemoteException;*/

}
