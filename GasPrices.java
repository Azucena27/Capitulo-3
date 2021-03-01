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
public class GasPrices {
    
    public static void RangoPrecios(int pricePerBarrel){
        double precioMenor;
        double precioMayor;
        
        precioMenor=(3.5*pricePerBarrel)/100;
        precioMayor=(4.0*pricePerBarrel)/100;
        System.out.println("El precio del surtidor está entre $"+precioMenor+" y $"+precioMayor);
        
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el precio por barril: ");
        int pricePerBarrel = scanner.nextInt();
        
        RangoPrecios(pricePerBarrel);
        
    }
}
