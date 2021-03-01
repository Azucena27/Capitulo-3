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
public class Salary {

    public static void pagoSalario(int pago, int regular, int extra){
     double salario;
     salario = (regular*pago)+(extra*1.5*pago);
     System.out.println("El salario semanal es: "+salario);
        
    }
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la tarifa de pago por hora: ");
        int pago = scanner.nextInt();
        
        System.out.println("Ingrese las horas regulares trabajadas a la semana: ");
        int regular = scanner.nextInt();

        System.out.println("Ingresa las horas extras trabajadas en la semana: ");
        int extra = scanner.nextInt();
        
        pagoSalario(pago, regular, extra);
    }
}
