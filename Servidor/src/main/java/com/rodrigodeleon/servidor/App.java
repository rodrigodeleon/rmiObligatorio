/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rodrigodeleon.servidor;

import com.rodrigodeleon.common.IServer;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import javax.persistence.EntityManager;


public class App {
    
	public static void main(String[] args) {
		EntityManager em = null;
		try {
			System.setProperty("java.security.policy", "file://Users/Rodrigo/NetBeansProjects/dda/rmiObligatorio/java.policy");
			LocateRegistry.createRegistry(1099);
			Server obj = new Server();
			IServer stub = (Server) UnicastRemoteObject.exportObject(obj, 0);
			// Bind the remote object's stub in the registry
			Registry registry = LocateRegistry.getRegistry(1099);
			registry.bind("server", stub);

			System.out.println("Server ready");

		} catch (Exception e) {
			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}
		 //System.exit(0);
	}
}
