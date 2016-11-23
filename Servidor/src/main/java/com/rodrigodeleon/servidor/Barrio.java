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
public class Barrio {

    private int id;
    private int valorCasa;
    private List<Terreno> listPropiedades;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValorCasa() {
        return valorCasa;
    }

    public void setValorCasa(int valorCasa) {
        this.valorCasa = valorCasa;
    }

    public List<Terreno> getListPropiedades() {
        return listPropiedades;
    }

    public void setListPropiedades(List<Terreno> listPropiedades) {
        this.listPropiedades = listPropiedades;
    }

    public Barrio(int id, int valorCasa) {
        this.id = id;
        this.valorCasa = valorCasa;
        listPropiedades = new ArrayList<>();

    }

    public Barrio() {
        listPropiedades = new ArrayList<>();
    }

}
