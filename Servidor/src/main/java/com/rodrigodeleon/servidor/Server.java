/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rodrigodeleon.servidor;

import com.rodrigodeleon.common.IControllerAccion;
import com.rodrigodeleon.common.IControllerJuego;
import com.rodrigodeleon.common.IControllerJugada;
import com.rodrigodeleon.common.IServer;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rodrigo
 */
public class Server implements IServer {

    private List<Jugador> jugadores;
    private ControllerJuego controllerJuego;

    @SuppressWarnings("deprecation")
    public Server() throws RemoteException {
        System.setProperty("java.security.policy", "file://Users/Rodrigo/NetBeansProjects/dda/rmiObligatorio/java.policy");

        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        }

        this.jugadores = new ArrayList<Jugador>();
        controllerJuego = ControllerJuego.getInstance();
    }

    public String sayHello() throws RemoteException {
        return "hola remoto";
    }

    public void addObserver(Jugador jugador) throws RemoteException {
        this.jugadores.add(jugador);
    }

    public IControllerAccion getControllerAccion() throws RemoteException {

        return ControllerAccion.getinstance();
    }

    public IControllerJugada getControllerJugada() throws RemoteException {

        return ControllerJugada.getInstance();
    }

    public IControllerJuego getControllerJuego() {
        return ControllerJuego.getInstance();
    }
    
    
    
    
    
    
}
/*
	public void sendMessage(String message) throws RemoteException {
		
		for(Jugador j : this.jugadores) {
			j.notificar(message);
		}

	}
	
	public LoginController getLoginController() throws RemoteException
	{
		return LoginControllerImpl.getInstance();
	}
	
	
	public DadoController getDadoController() throws RemoteException
	{
		return DadoControllerImp.getInstance();
	}
	

	public PartidaController getPartidaController() throws RemoteException {
		return pc;
	}

	public List<Observer> getObservers() throws RemoteException {
		return observers;
	}

	public void setJugador(JugadorDTO jugador) throws RemoteException {
		for(Observer o : this.observers) {
			o.setJugador(jugador);
		}
		
	}

	public void pagarMulta(JugadorDTO dueño, int cantidad) throws RemoteException {
		for(Observer o : this.observers) {
			o.pagarMulta(dueño, cantidad);
		}
	}
	
}*/
