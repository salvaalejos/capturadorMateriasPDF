package com.mycompany.tap_u1p6_b.pojos;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Link
 */
public class Tema implements Serializable {
    private int numTema;
    private String tituloTema;
    private ArrayList<Subtema> subtemas;

    public Tema() {
    }

    public Tema(int numTema, String tituloTema, ArrayList<Subtema> subtemas) {
        this.numTema = numTema;
        this.tituloTema = tituloTema;
        this.subtemas = subtemas;
    }

    public ArrayList<Subtema> getSubtemas() {
        return subtemas;
    }

    public void setSubtemas(ArrayList<Subtema> subtemas) {
        this.subtemas = subtemas;
    }

    public int getNumTema() {
        return numTema;
    }

    public void setNumTema(int numTema) {
        this.numTema = numTema;
    }

    public String getTituloTema() {
        return tituloTema;
    }

    public void setTituloTema(String tituloTema) {
        this.tituloTema = tituloTema;
    }

    @Override
    public String toString() {
        return "Tema{" + "numTema=" + numTema + ", tituloTema=" + tituloTema + ", subtemas=" + subtemas + '}';
    }
    
}
