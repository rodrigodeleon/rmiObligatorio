/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rodrigodeleon.servidor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rodrigo
 */
class Tablero {

    private static Tablero instance;
    private static Casillero start = new Casillero();
    private List<Barrio> barrios = new ArrayList<Barrio>();
    private List<Mazo> mazos;
    
    private void crearTablero() 
    {
        
        FactoryCasillero.getInstance().getCasilleros(barrios);
    }

    private Tablero() {
    }

    
    public static Tablero getInstance() {
        
        if(instance == null)
        {
            instance = new Tablero();
            instance.crearTablero();
        }

      
        return instance;
    }

    public static Casillero getStart() {
        return start;
    }

    public List<Barrio> getBarrios() {
        return barrios;
    }

    public List<Mazo> getMazos() {
        return mazos;
    }

    public static void setStart(Casillero start) {
        Tablero.start = start;
    }
    
    public void listarTablero()
    {
        Casillero aux = Tablero.getStart();
        while(aux.getId()!=39)
        {
            System.out.println(aux.getId());
            aux = aux.getNext();
            
        }
        System.out.println(aux.getId());
        System.out.println(aux.getNext().getId());
    }
    
    

}
