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

   /////---inciso A---//////      
public class Percentages {
    
    static double x = 2;
    static double y = 5;
    
    public static void computePercent(double x, double y) {
        
        double porcentaje;
        porcentaje = (x*100)/y;

         System.out.println(x+" is "+porcentaje+"% of "+y);       
    }
    
    public static void main(String[] args) {
    
    computePercent(x,y);
    computePercent(y,x);
    
    }
}


