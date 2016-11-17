/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rodrigodeleon.servidor;

import java.util.List;

/**
 *
 * @author Rodrigo
 */
public class FactoryCasillero {
    
    private static FactoryCasillero Instance;
    
    private FactoryCasillero(){}
    
    public static FactoryCasillero getInstance()
    {
        if(Instance == null)
        {
            Instance = new FactoryCasillero();
                   
        }
        return Instance;
    }
    
    public Casillero getCasilleros()
    {
        Casillero start = new Casillero();
        
        //construir tablero
        
        return start;
    }
    
}
