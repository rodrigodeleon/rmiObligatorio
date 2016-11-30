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
public class ControllerAccion {

    private static ControllerAccion instancia;

    private ControllerAccion() {

    }

    public static ControllerAccion getinstance() {
        if (instancia == null) {
            instancia = new ControllerAccion();
        }
        return instancia;
    }

    public void comprar() {

        try {

            Jugador miJugador = Juego.getInstance().getJugadorEnTurno();
            Terreno miTerreno = (Terreno) miJugador.getPosicion();
            if (miJugador.getDinero() - miTerreno.getCosto() >= 0) {
                miJugador.getPropiedades().add(miTerreno);
                miTerreno.setJugador(miJugador);
                miJugador.setDinero(miJugador.getDinero() - miTerreno.getCosto());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void vender() {
    }

    public void alquilar() {

        try {

            Jugador miJugador = Juego.getInstance().getJugadorEnTurno();
            Terreno miTerreno = (Terreno) miJugador.getPosicion();
            if (miJugador.getDinero() - miTerreno.getAlquiler() >= 0) {

                miJugador.setDinero(miJugador.getDinero() - miTerreno.getAlquiler());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void tirarDado() {

    }

    public void construir() {

        try {

            Jugador miJugador = Juego.getInstance().getJugadorEnTurno();
            Terreno miTerreno = (Terreno) miJugador.getPosicion();
            if (miJugador.getDinero() - miTerreno.getBarrio().getValorCasa() >= 0) {
                if (miTerreno.getCasas() <= 4) {
                    miTerreno.setCasas(miTerreno.getCasas() + 1);
                    miJugador.setDinero(miJugador.getDinero() - miTerreno.getBarrio().getValorCasa());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
