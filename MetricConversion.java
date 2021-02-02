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
public class MetricConversion {

    public static void pulgadasCentimetros(int cantidad){
        
        double centimetros = cantidad*2.54; 
        System.out.println(cantidad+" pulgada(s) es igual a "+centimetros+" centimetros");
    }
    
    public static void galonesLitros(int cantidad){
        
        double litros = cantidad* 3.7854; 
        System.out.println(cantidad+" galon(es) es igual a "+litros+" litros");
        
    }
   
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una cantidad(pulgadas/galones): ");
        int cantidad = scanner.nextInt();
        
        pulgadasCentimetros(cantidad);
        galonesLitros(cantidad);
    }
    
}
