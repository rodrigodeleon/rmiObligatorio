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

    public Jugada comprar(Accion miAccion) {

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

        return ControllerJugada.construirJugada(miAccion);

    }

    public Jugada vender(Accion miAccion) {
        return ControllerJugada.construirJugada(miAccion);

    }

    public Jugada pagarAlquiler(Accion miAccion) {

        try {

            Jugador miJugador = Juego.getInstance().getJugadorEnTurno();
            Terreno miTerreno = (Terreno) miJugador.getPosicion();
            if (miJugador.getDinero() - miTerreno.getAlquiler() >= 0) {

                miJugador.setDinero(miJugador.getDinero() - miTerreno.getAlquiler());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ControllerJugada.construirJugada(miAccion);

    }

    public Jugada tirarDado(Accion miAccion) {

        try {

            Jugador miJugador = Juego.getInstance().getJugadorEnTurno();

            if (miJugador.getPosicion() instanceof Terreno) {
                if (((Terreno) miJugador.getPosicion()).getJugador() != miJugador) {
                    if (((Terreno) miJugador.getPosicion()).getJugador() != null) {
                        miAccion.setTipo("pagarAlquiler");
                        miAccion.ejecutar();

                    }

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ControllerJugada.construirJugada(miAccion);

    }

    public Jugada construir(Accion miAccion) {

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

        return ControllerJugada.construirJugada(miAccion);

    }

}
