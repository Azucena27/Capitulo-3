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
public class Insurance {

    public static void prima(int actual, int añoNacimiento){
        
        int decada;
        int resultado;
        int total;
        decada = (actual - añoNacimiento)/10;
        resultado = decada-(decada%1);
        total = (resultado+15)*20;
        
        System.out.println("La Prima anual de la poliza es: $"+total);
    }
      
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el año actual: ");
        int actual = scanner.nextInt();

        System.out.println("Ingresa tu año de nacimiento: ");
        int añoNacimiento = scanner.nextInt();
        
        prima(actual,añoNacimiento);
    }
    
}
