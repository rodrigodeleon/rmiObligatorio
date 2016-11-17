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

    public void getCasilleros(Casillero start, List<Barrio> barrios) {
        //construir tablero

        Barrio barrioA = new Barrio(1, 50);
        Barrio barrioB = new Barrio(2, 60);
        Barrio barrioC = new Barrio(3, 65);
        Barrio barrioD = new Barrio(4, 75);
        Barrio barrioE = new Barrio(5, 40);
        Barrio barrioF = new Barrio(6, 55);
        Barrio barrioG = new Barrio(7, 80);
        Barrio barrioH = new Barrio(8, 45);
        Barrio ferrocarriles = new Barrio(5, 200);
        Barrio servicios = new Barrio(6, 150);

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

                barrios.add(barrioA);

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
                barrios.add(barrioB);

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

                barrios.add(barrioC);

                i += 4;
            }
            if (i >= 16 && i <= 20) {

                Especial e = new Especial(16, "Destino");
                anterior.setNext(e);
                anterior = e;

                Terreno t = new Terreno(17, barrioD, null, 350);
                barrioD.getListPropiedades().add(t);
                anterior.setNext(t);
                anterior = t;

                e.setId(18);
                e.setTipo("Luxury Tax");
                anterior.setNext(e);
                anterior = e;

                t.setId(19);
                t.setAlquiler(400);
                barrioD.getListPropiedades().add(t);
                anterior.setNext(t);
                anterior = t;

                e.setId(20);
                e.setTipo("Go");
                anterior.setNext(e);
                anterior = e;

                barrios.add(barrioD);

                i += 4;
            }

            if (i >= 21 && i <= 25) {
                Terreno t = new Terreno(1, barrioE, null, 60);
                barrioE.getListPropiedades().add(t);
                anterior.setNext(t);
                anterior = t;

                Especial e = new Especial(22, "Community");
                anterior.setNext(e);
                anterior = e;

                t.setId(23);
                t.setAlquiler(60);
                barrioE.getListPropiedades().add(t);
                anterior.setNext(t);
                anterior = t;

                e.setId(24);
                e.setTipo("Income Tax");
                anterior.setNext(e);
                anterior = e;

                t.setId(25);
                t.setAlquiler(200);
                t.setBarrio(ferrocarriles);
                ferrocarriles.getListPropiedades().add(t);
                anterior.setNext(t);
                anterior = t;

                barrios.add(barrioE);

                i += 4;

            }
            if (i >= 26 && i <= 30) {
                Terreno t = new Terreno(26, barrioF, null, 100);
                barrioF.getListPropiedades().add(t);
                anterior.setNext(t);
                anterior = t;

                Especial e = new Especial(27, "Destino");
                anterior.setNext(e);
                anterior = e;

                t.setId(28);
                t.setAlquiler(100);
                barrioF.getListPropiedades().add(t);
                anterior.setNext(t);
                anterior = t;

                t.setId(29);
                t.setAlquiler(120);
                barrioF.getListPropiedades().add(t);
                anterior.setNext(t);
                anterior = t;

                e.setId(30);
                e.setTipo("Carcel Visita");
                anterior.setNext(e);
                anterior = t;

                barrios.add(barrioF);

                i += 4;

            }

            if (i >= 31 && i <= 35) {
                Terreno t = new Terreno(31, barrioG, null, 140);
                barrioG.getListPropiedades().add(t);
                anterior.setNext(t);
                anterior = t;

                t.setId(32);
                t.setAlquiler(140);
                t.setBarrio(servicios);
                servicios.getListPropiedades().add(t);
                anterior.setNext(t);
                anterior = t;

                t.setId(33);
                t.setAlquiler(150);
                t.setBarrio(barrioG);
                barrioG.getListPropiedades().add(t);
                anterior.setNext(t);
                anterior = t;

                t.setId(34);
                t.setAlquiler(160);
                barrioG.getListPropiedades().add(t);
                anterior.setNext(t);
                anterior = t;

                t.setId(35);
                t.setAlquiler(200);
                t.setBarrio(ferrocarriles);
                ferrocarriles.getListPropiedades().add(t);
                anterior.setNext(t);
                anterior = t;

                barrios.add(barrioG);

                i += 4;

            }

            if (i >= 36 && i <= 40) {

                Terreno t = new Terreno(36, barrioH, null, 140);
                barrioH.getListPropiedades().add(t);
                anterior.setNext(t);
                anterior = t;

                Especial e = new Especial(37, "Community");
                anterior.setNext(e);
                anterior = e;

                t.setId(38);
                t.setAlquiler(150);
                barrioH.getListPropiedades().add(t);
                anterior.setNext(t);
                anterior = t;

                t.setId(39);
                t.setAlquiler(160);
                barrioH.getListPropiedades().add(t);
                anterior.setNext(t);
                anterior = t;

                anterior.setNext(start);
                barrios.add(barrioH);

                i += 4;

            }
        }
        
        barrios.add(ferrocarriles);
        barrios.add(servicios);

    }

}
