package com.mycompany.tap_u1p6_b.pojos;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Link
 */
public class Materia implements Serializable {
    private String nombreMateria;
    private String objectivoMateria;
    private ArrayList<Tema> temas;

    public Materia() {
    }

    public Materia(String nombreMateria, String objectivoMateria, ArrayList<Tema> temas) {
        this.nombreMateria = nombreMateria;
        this.objectivoMateria = objectivoMateria;
        this.temas = temas;
    }

    public ArrayList<Tema> getTemas() {
        return temas;
    }

    public void setTemas(ArrayList<Tema> temas) {
        this.temas = temas;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getObjectivoMateria() {
        return objectivoMateria;
    }

    public void setObjectivoMateria(String objectivoMateria) {
        this.objectivoMateria = objectivoMateria;
    }

    @Override
    public String toString() {
        return "Materia{" + "nombreMateria=" + nombreMateria + ", objectivoMateria=" + objectivoMateria + ", temas=" + temas + '}';
    }
    
}
