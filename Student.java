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

/////---inciso A---/////
public class Student {

    private int id;
    private int horas;
    private int puntos;
    private int promedio;

    Student() {
        id = 9999;
        horas = 3;
        puntos = 12;
        promedio = promedio();
    }

    public int puntosObtenidos() {
        puntos = horas * 4;
        return puntos;
        //return horas*4;
    }

    public int promedio() {
        promedio = puntos / horas;
        return promedio;
        //return puntos/horas;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the horas
     */
    public int getHoras() {
        return horas;
    }

    /**
     * @param horas the horas to set
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }

    /**
     * @return the puntos
     */
    public int getPuntos() {
        return puntos;
    }

    /**
     * @param puntos the puntos to set
     */
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    /**
     * @return the promedio
     */
    public int getPromedio() {
        return promedio;
    }

    /**
     * @param promedio the promedio to set
     */
    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }
}
