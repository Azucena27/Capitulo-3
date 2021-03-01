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
public class Programa1 {

    static int v = 4;
    static int w = 6;
    static double x = 2.2;

    public static void calculate(int x, double y) {

    }

    public static void main(String[] args) {
        calculate(v, w);    //correcto
        calculate(v, x);    //correcto
        calculate(x, y);    //incorrecto
        calculate(18, x);   //correcto
        calculate(1.1, 2.2); //incorrecto
        calculate(5, 7);     //incorrecto
    }
}
