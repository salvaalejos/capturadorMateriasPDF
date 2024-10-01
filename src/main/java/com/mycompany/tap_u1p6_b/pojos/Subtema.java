package com.mycompany.tap_u1p6_b.pojos;

import java.io.Serializable;

/**
 *
 * @author Link
 */
public class Subtema implements Serializable {
    private int numSubtema;
    private String tituloSubtema;

    public Subtema() {
    }

    public Subtema(int numSubtema, String tituloSubtema) {
        this.numSubtema = numSubtema;
        this.tituloSubtema = tituloSubtema;
    }

    public String getTituloSubtema() {
        return tituloSubtema;
    }

    public void setTituloSubtema(String tituloSubtema) {
        this.tituloSubtema = tituloSubtema;
    }

    public int getNumSubtema() {
        return numSubtema;
    }

    public void setNumSubtema(int numSubtema) {
        this.numSubtema = numSubtema;
    }

    @Override
    public String toString() {
        return "Subtema{" + "numSubtema=" + numSubtema + ", tituloSubtema=" + tituloSubtema + '}';
    }
    
}
