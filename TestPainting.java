/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio3;

import com.mycompany.ejercicio3.Painting;
import java.util.Scanner;

/**
 *
 * @author Azucena
 */
public class TestPainting {

    public static void main(String[] args) {

        Painting pintura1 = new Painting();
        Painting pintura2 = new Painting();
        Painting pintura3 = new Painting();

        pintura1 = getData();
        pintura2 = getData();
        pintura3 = getData();
        showValues(pintura1);
        showValues(pintura2);
        showValues(pintura3);
        System.out.println("La tasa de comisión de la galeria es dada por el 20% del precio. ");

    }

    public static Painting getData() {
        Scanner scanner = new Scanner(System.in);
        Painting pintura = new Painting();
        System.out.println("Ingrese el título de la pintura: ");
        pintura.setTitulo(scanner.nextLine());
        System.out.println("Ingrese el nombre del artista de la pintura: ");
        pintura.setArtista(scanner.nextLine());
        System.out.println("Ingrese el medio de la pintura: ");
        pintura.setMedio(scanner.nextLine());
        System.out.println("Ingrese el precio de la pintura: ");
        pintura.setPrecio(scanner.nextDouble());
        return pintura;
    }

    public static void showValues(Painting pintura) {
        System.out.println("El título de la pintura es: " + pintura.getTitulo());
        System.out.println("El nombre del artista de la pintura es: " + pintura.getArtista());
        System.out.println("El medio de la pintura es: $" + pintura.getMedio());
        System.out.println("El precio de la pintura es: $" + pintura.getPrecio());
    }
    
}
