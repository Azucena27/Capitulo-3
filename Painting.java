/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio3;

/**
 *
 * @author Azucena
 */
public class Painting {

    public String titulo;
    public String artista;
    public String medio;
    public double precio;
    private double comision;

    Painting() {
        titulo = "desconocido";
        artista = "desconocido";
        medio = "desconocido";
        precio = 0;
        comision = 0;

    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the artista
     */
    public String getArtista() {
        return artista;
    }

    /**
     * @param artista the artista to set
     */
    public void setArtista(String artista) {
        this.artista = artista;
    }

    /**
     * @return the medio
     */
    public String getMedio() {
        return medio;
    }

    /**
     * @param medio the medio to set
     */
    public void setMedio(String medio) {
        this.medio = medio;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
        this.comision = precio * 0.20;
    }

    /**
     * @return the comision
     */
    /*public double getComision() {
        return comision;
    }*/
    /**
     * @param comision the comision to set
     */
    /*public void setComision(double comision) {
        this.comision = comision;
    }*/
}
