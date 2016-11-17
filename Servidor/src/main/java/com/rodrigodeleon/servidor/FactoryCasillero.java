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

    private FactoryCasillero() {
    }

    public static FactoryCasillero getInstance() {
        if (Instance == null) {
            Instance = new FactoryCasillero();

        }
        return Instance;
    }

    public Casillero getCasilleros() {
        //construir tablero

        Barrio barrioA = new Barrio(1, 50);
        Barrio barrioB = new Barrio(2, 60);
        Barrio barrioC = new Barrio(3, 65);
        Barrio barrioD = new Barrio(4, 75);
        Barrio ferrocarriles = new Barrio(5, 200);
        Barrio servicios = new Barrio(6, 150);

        Casillero start = null;
        Casillero anterior = null;

        for (int i = 0; i < 40; i++) {
            if (i == 0) {
                start = new Especial(i, "Start");
                anterior = start;
            }
            if (i >= 1 && i <= 5) {
                Terreno t = new Terreno(1, barrioA, null, 220);
                barrioA.getListPropiedades().add(t);
                anterior.setNext(t);
                anterior = t;

                Especial e = new Especial(2, "Destino");
                anterior.setNext(e);
                anterior = e;

                t.setId(3);
                t.setAlquiler(220);
                barrioA.getListPropiedades().add(t);
                anterior.setNext(t);
                anterior = t;

                t.setId(4);
                t.setAlquiler(240);
                barrioA.getListPropiedades().add(t);
                anterior.setNext(t);
                anterior = t;

                t.setId(5);
                t.setAlquiler(200);
                t.setBarrio(ferrocarriles);
                ferrocarriles.getListPropiedades().add(t);
                anterior.setNext(t);
                anterior = t;

                i += 4;

            }
            if (i >= 6 && i <= 10) {
                Terreno t = new Terreno(6, barrioB, null, 260);
                barrioB.getListPropiedades().add(t);
                anterior.setNext(t);
                anterior = t;

                t.setId(7);
                t.setAlquiler(260);
                barrioB.getListPropiedades().add(t);
                anterior.setNext(t);
                anterior = t;

                t.setId(8);
                t.setAlquiler(150);
                t.setBarrio(servicios);
                servicios.getListPropiedades().add(t);             
                anterior.setNext(t);
                anterior = t;

                t.setId(9);
                t.setAlquiler(280);
                t.setBarrio(barrioB);
                barrioB.getListPropiedades().add(t);
                anterior.setNext(t);
                anterior = t;

                Especial e = new Especial(10, "Carcel");
                anterior.setNext(e);
                anterior = e;

                i += 4;
            }
            
            if (i >= 11 && i <= 15) {
               Terreno t = new Terreno(11, barrioC, null, 300);
                barrioC.getListPropiedades().add(t);
                anterior.setNext(t);
                anterior = t;
               
                t.setId(12);
                t.setAlquiler(300);
                barrioC.getListPropiedades().add(t);
                anterior.setNext(t);
                anterior = t;

                Especial e = new Especial(13, "Community");
                anterior.setNext(e);
                anterior = e;

                t.setId(14);
                t.setAlquiler(320);
                barrioC.getListPropiedades().add(t);
                anterior.setNext(t);
                anterior = t;

                t.setId(15);
                t.setAlquiler(200);
                t.setBarrio(ferrocarriles);
                ferrocarriles.getListPropiedades().add(t);
                anterior.setNext(t);
                anterior = t;

                i += 4;
            }

        }

        return start;
    }

}
