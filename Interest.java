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
public class Interest {

    public static double dineroInvertido(int inicial){
        double dinero;
        dinero = inicial*1.05;
        return dinero;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor inicial de la inversion: ");
        int inicial = scanner.nextInt();
        
        double resultado;
        resultado = dineroInvertido(inicial);
        System.out.println("La cantidad de dinero invertido al 5% de interes durante un año es: $"+resultado);
    }
}
