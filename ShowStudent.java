/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio3;

import com.mycompany.ejercicio3.Student;
import java.util.Scanner;

/**
 *
 * @author Azucena
 */

/////---inciso B---/////
public class ShowStudent {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Ingrese el numero de id del estudiante: ");
        student.setId(scanner.nextInt());
        System.out.println("Ingrese las horas de credito obtenidas: ");
        student.setHoras(scanner.nextInt());

        student.setPuntos(student.puntosObtenidos());
        student.setPromedio(student.promedio());
        System.out.println("El id del estudiantes es: " + student.getId());
        System.out.println("Las horas de credito del estudiante es: " + student.getHoras());
        System.out.println("Los puntos obtenidos por el estudiante es: " + student.getPuntos());
        System.out.println("El promedio del estudiante es: " + student.getPromedio());

    }

}
