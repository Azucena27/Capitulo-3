/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio3;

import com.mycompany.ejercicio3.Student;

/**
 *
 * @author Azucena
 */

/////---inciso C---//////
public class ShowStudent2 {

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("El id del estudiantes es: " + student.getId());
        System.out.println("Las horas de credito del estudiante es: " + student.getHoras());
        System.out.println("Los puntos obtenidos por el estudiante es: " + student.getPuntos());
        System.out.println("El promedio del estudiante es: " + student.getPromedio());
    }

}
