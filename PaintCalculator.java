/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Azucena
 */
public class PaintCalculator {

    static double ancho;
    static double longitud;
    static double alto;

    public static double areaPared() {
        double area;
        area = ((alto * longitud) * 2) + ((alto * ancho) * 2);
        return area;
    }

    public static double galonesNecesarios(double area) {
        double galones;
        galones = area / 350;
        System.out.println("La cantidad de galones de pintura necesarios son: " + galones);
        return galones;
    }

    public static double precio(double galones) {
        double precio;
        double galonesEnteros;
        galonesEnteros = Math.ceil(galones);
        precio = galonesEnteros * 32;
        System.out.println("El costo de pintar una habitación de " + longitud + " de longitud con " + ancho + " de ancho y " + alto + " de alto es $"+precio);
        return precio;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la longitud(pies) de la habitación: ");
        longitud = scanner.nextInt();

        System.out.println("Ingresa el ancho(pies)  de la habitacion: ");
        ancho = scanner.nextInt();

        System.out.println("Ingresa el alto(pies) de la habitacion: ");
        alto = scanner.nextInt();

        double area;
        double galones;
        double precio;
        area = areaPared();
        galones = galonesNecesarios(area);
        precio = precio(galones);
    }

}
