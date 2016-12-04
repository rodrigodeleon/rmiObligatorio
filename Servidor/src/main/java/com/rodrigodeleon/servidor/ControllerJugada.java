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
public class ControllerJugada {

    
    private static ControllerJugada instancia;
    
    private ControllerJugada(){}
    
    public static ControllerJugada getInstance()
    {
        if(instancia == null)
        {
            instancia = new ControllerJugada();
            
        }
        
        return instancia;
    }
            
    
    public static Jugada construirJugada(Accion accionRealizada)
    {
        Jugada miJugada = new Jugada();
        
        miJugada.setJugadorAnterior(Juego.getInstance().getJugadorEnTurno());
        miJugada.setAccionRealizada(accionRealizada);
        
        if (accionRealizada.getTipo().equals("tirarDado") &&
                Juego.getInstance().getJugadorEnTurno().getPosicion().getTipoCasillero() == Casillero.TERRENO )
        {
            miJugada.setAccionesDisponibles(accionesSobreTerreno());
            miJugada.setSiguienteJugador(miJugada.getJugadorAnterior());
        }
        else if(accionRealizada.getTipo().equals("comprar"))
        {
           // miJugada.setSiguienteJugador();  buscar como conseguir el siguiente jugador
            miJugada.setAccionesDisponibles(accionesPrimerTurno());
        }
        
        else if(accionRealizada.getTipo().equals("pagarAlquiler"))
        {
           // miJugada.setSiguienteJugador();  buscar como conseguir el siguiente jugador
            miJugada.setAccionesDisponibles(accionesPrimerTurno());
        }
        
        else if(accionRealizada.getTipo().equals("construir"))
        {
           // miJugada.setSiguienteJugador();  buscar como conseguir el siguiente jugador
            miJugada.setAccionesDisponibles(accionesPrimerTurno());
        }
        
         else if(accionRealizada.getTipo().equals("vender"))
        {
           // miJugada.setSiguienteJugador();  buscar como conseguir el siguiente jugador
            miJugada.setAccionesDisponibles(accionesPrimerTurno());
        }
        
         else if(accionRealizada.getTipo().equals("sacarCartaEspecial"))
        {
           // miJugada.setSiguienteJugador();  buscar como conseguir el siguiente jugador
            miJugada.setAccionesDisponibles(accionesPrimerTurno());
        }
        
        return miJugada;
    }
    
   
    
    private static List<Accion> accionesSobreTerreno()
    {
        List<Accion> retorno = new ArrayList<Accion>();
        
        retorno.add(new Accion("Comprar"));
        retorno.add(new Accion("Pasar"));
        return retorno;
    }
    
    private static List<Accion> accionesPrimerTurno()
    {
        List<Accion> retorno = new ArrayList<Accion>();
        
        retorno.add(new Accion("tirarDado"));
        return retorno;
    }

}
