/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicios;

import com.mycompany.ejercicios.ClassA;

/**
 *
 * @author Azucena
 */
public class ClassB {

    public static void main(String[] args) {
        
        ClassA obA = new ClassA();
        
        obA.b = 12;   //incorrecto
        obA.c = 5;    //correcto
        obA.d = 23;   //correcto
        ClassA.b = 4;  //incorrecto
        ClassA.c = 33;  //incorrecto
        ClassA.d = 99;  //correcto
    }

}
