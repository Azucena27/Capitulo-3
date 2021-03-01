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
public class Percentages2 {

    public static void computePercent(double x, double y) {
        double porcentaje;
        porcentaje = (x*100)/y;
        System.out.println(x+" is "+porcentaje+"% of "+y);       
    }
    
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingresa el primer valor ");
    int x = scanner.nextInt();

    System.out.println("Ingresa el segundo valor ");
    int y = scanner.nextInt();
    System.out.println("El resultado es:");
    
    computePercent(x,y);
    computePercent(y,x);
    }
}
