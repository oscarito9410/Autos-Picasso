package com.oscar.autos;

import java.io.Serializable;

/**
 * Created by oemy9 on 26/11/2017.
 */

public class Auto implements Serializable {
    private String titulo;
    private String urlImagen;
    private String fuente;

    public Auto(){
    }

    public Auto(String titulo, String urlImagen, String fuente) {
        this.titulo = titulo;
        this.urlImagen = urlImagen;
        this.fuente = fuente;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }
}
