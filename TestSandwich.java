/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio3;

import com.mycompany.ejercicio3.Sandwich;
import java.util.Scanner;

/**
 *
 * @author Azucena
 */

/////---inciso B---//////
public class TestSandwich {

    public static void main(String[] args) {

        Sandwich sandwich = new Sandwich();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el ingradiente principal: ");
        sandwich.setIngrediente(scanner.nextLine());
        System.out.println("Ingrese el tipo de pan: ");
        sandwich.setPan(scanner.nextLine());
        System.out.println("Ingrese el precio: ");
        sandwich.setPrecio(scanner.nextDouble());
        System.out.println("El ingradiente principal del sandwich es: "+sandwich.getIngrediente());
        System.out.println("El tipo de pan del sandwich es: "+sandwich.getPan());
        System.out.println("El precio del sandwich es: $"+sandwich.getPrecio());
        
    }

}
