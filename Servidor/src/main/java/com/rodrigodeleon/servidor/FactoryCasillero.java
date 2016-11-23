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
                Terreno t = new Terreno(20, barrioA, null, 220, 1, null);
                anterior.setNext(t);
                barrioA.getListPropiedades().add(t);

                anterior = t;

                Especial e = new Especial(2, "Destino");
                anterior.setNext(e);
                anterior = e;

                Terreno t1 = new Terreno(30, barrioA, null, 220, 3, null);
                barrioA.getListPropiedades().add(t1);
                anterior.setNext(t1);
                anterior = t1;

                Terreno t2 = new Terreno(44, barrioA, null, 240, 4, null);
                barrioA.getListPropiedades().add(t2);
                anterior.setNext(t2);
                anterior = t2;

                Terreno t3 = new Terreno(45, ferrocarriles, null, 200, 5, null);
                ferrocarriles.getListPropiedades().add(t3);
                anterior.setNext(t3);
                anterior = t3;

                barrios.add(barrioA);

                i += 4;

            }
            if (i >= 6 && i <= 10) {
                Terreno t = new Terreno(62, barrioB, null, 260, 6, null);
                barrioB.getListPropiedades().add(t);
                anterior.setNext(t);
                anterior = t;

                Terreno t1 = new Terreno(52, barrioB, null, 260, 7, null);
                barrioB.getListPropiedades().add(t1);
                anterior.setNext(t1);
                anterior = t1;

                Terreno t2 = new Terreno(62, servicios, null, 150, 8, null);
                servicios.getListPropiedades().add(t2);
                anterior.setNext(t2);
                anterior = t2;

                Terreno t3 = new Terreno(65, barrioB, null, 280, 9, null);
                barrioB.getListPropiedades().add(t3);
                anterior.setNext(t3);
                anterior = t3;

                Especial e = new Especial(10, "Carcel");
                anterior.setNext(e);
                anterior = e;
                barrios.add(barrioB);

                i += 4;
            }

            if (i >= 11 && i <= 15) {
                Terreno t = new Terreno(87, barrioC, null, 300, 11, null);
                barrioC.getListPropiedades().add(t);
                anterior.setNext(t);
                anterior = t;

                Terreno t1 = new Terreno(76, barrioC, null, 300, 12, null);
                barrioC.getListPropiedades().add(t1);
                anterior.setNext(t1);
                anterior = t1;

                Especial e = new Especial(13, "Community");
                anterior.setNext(e);
                anterior = e;

                Terreno t2 = new Terreno(66, barrioC, null, 320, 14, null);
                barrioC.getListPropiedades().add(t2);
                anterior.setNext(t2);
                anterior = t2;

                Terreno t3 = new Terreno(66, ferrocarriles, null, 200, 15, null);
                ferrocarriles.getListPropiedades().add(t3);
                anterior.setNext(t3);
                anterior = t3;

                barrios.add(barrioC);

                i += 4;
            }
            if (i >= 16 && i <= 20) {

                Especial e = new Especial(16, "Destino");
                anterior.setNext(e);
                anterior = e;

                Terreno t = new Terreno(75, barrioD, null, 350, 17, null);
                barrioD.getListPropiedades().add(t);
                anterior.setNext(t);
                anterior = t;

                Especial e1 = new Especial(18, "Luxury Tax");
                anterior.setNext(e1);
                anterior = e1;

                Terreno t1 = new Terreno(70, barrioD, null, 400, 19, null);
                barrioD.getListPropiedades().add(t1);
                anterior.setNext(t1);
                anterior = t1;

                Especial e2 = new Especial(20, "Go");
                anterior.setNext(e2);
                anterior = e2;

                barrios.add(barrioD);

                i += 4;
            }

            if (i >= 21 && i <= 25) {
                Terreno t = new Terreno(11, barrioE, null, 60, 21, null);
                barrioE.getListPropiedades().add(t);
                anterior.setNext(t);
                anterior = t;

                Especial e = new Especial(22, "Community");
                anterior.setNext(e);
                anterior = e;

                Terreno t1 = new Terreno(12, barrioE, null, 60, 23, null);
                barrioE.getListPropiedades().add(t1);
                anterior.setNext(t1);
                anterior = t1;

                Especial e1 = new Especial(24, "Income Tax");
                anterior.setNext(e1);
                anterior = e1;

                Terreno t3 = new Terreno(45, ferrocarriles, null, 200, 25, null);
                ferrocarriles.getListPropiedades().add(t3);
                anterior.setNext(t3);
                anterior = t3;

                barrios.add(barrioE);

                i += 4;

            }
            if (i >= 26 && i <= 30) {
                Terreno t = new Terreno(45, barrioF, null, 100, 26, null);
                barrioF.getListPropiedades().add(t);
                anterior.setNext(t);
                anterior = t;

                Especial e = new Especial(27, "Destino");
                anterior.setNext(e);
                anterior = e;

                Terreno t1 = new Terreno(46, barrioF, null, 100, 28, null);
                barrioF.getListPropiedades().add(t1);
                anterior.setNext(t1);
                anterior = t1;

                Terreno t2 = new Terreno(46, barrioF, null, 120, 29, null);
                barrioF.getListPropiedades().add(t2);
                anterior.setNext(t2);
                anterior = t2;

                Especial e1 = new Especial(30, "Carcel Visita");
                anterior.setNext(e1);
                anterior = e1;

                barrios.add(barrioF);

                i += 4;

            }

            if (i >= 31 && i <= 35) {
                Terreno t = new Terreno(31, barrioG, null, 140, 31, null);
                barrioG.getListPropiedades().add(t);
                anterior.setNext(t);
                anterior = t;

                Terreno t1 = new Terreno(31, servicios, null, 150, 32, null);
                servicios.getListPropiedades().add(t1);
                anterior.setNext(t1);
                anterior = t1;

                Terreno t2 = new Terreno(31, barrioG, null, 140, 33, null);
                barrioG.getListPropiedades().add(t2);
                anterior.setNext(t2);
                anterior = t2;

                Terreno t3 = new Terreno(31, barrioG, null, 160, 34, null);
                barrioG.getListPropiedades().add(t3);
                anterior.setNext(t3);
                anterior = t3;

                Terreno t4 = new Terreno(31, ferrocarriles, null, 200, 35, null);
                ferrocarriles.getListPropiedades().add(t4);
                anterior.setNext(t4);
                anterior = t4;

                barrios.add(barrioG);

                i += 4;

            }

            if (i >= 36 && i <= 40) {

                Terreno t = new Terreno(36, barrioH, null, 140, 36,null);
                barrioH.getListPropiedades().add(t);
                anterior.setNext(t);
                anterior = t;

                Especial e = new Especial(37, "Community");
                anterior.setNext(e);
                anterior = e;

                Terreno t1 = new Terreno(38, barrioH, null, 150, 38,null);
                barrioH.getListPropiedades().add(t1);
                anterior.setNext(t1);
                anterior = t1;
                
               Terreno t2 = new Terreno(36, barrioH, null, 160, 39, null);
                barrioH.getListPropiedades().add(t2);
                anterior.setNext(t2);
                anterior = t2;

               

                anterior.setNext(start);
                barrios.add(barrioH);

                i += 4;

            }
        }

        barrios.add(ferrocarriles);
        barrios.add(servicios);

        for (Barrio b : barrios) {
            System.out.println("inicio barrio");

            for (Terreno t : b.getListPropiedades()) {
                System.out.println(t.getId());

            }

            System.out.println("fin barrio");
        }

    }

}
