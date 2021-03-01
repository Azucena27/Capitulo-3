/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio3;

import com.mycompany.ejercicio3.BankAccount;
import java.util.Scanner;

/**
 *
 * @author Azucena
 */
public class TestBankAccount {

    public static void main(String[] args) {
        BankAccount cuenta1 = new BankAccount();
        BankAccount cuenta2 = new BankAccount();
        BankAccount cuenta3 = new BankAccount();
        BankAccount cuenta4 = new BankAccount();
        cuenta1 = getData();
        cuenta2 = getData();
        cuenta3 = getData();
        showValues(cuenta1);
        showValues(cuenta2);
        showValues(cuenta3);
        showValues(cuenta4);
    }

    public static BankAccount getData() {
        Scanner scanner = new Scanner(System.in);
        String nombreUsuario;
        BankAccount cuentaBancaria = new BankAccount();
        System.out.println("Ingrese el número de cuenta: ");
        cuentaBancaria.setNumCuenta(scanner.nextInt());
        System.out.println("Ingrese el nombre del propietario de la cuenta: ");
        //cuentaBancaria.setNombre(scanner.nextLine());
        nombreUsuario = scanner.nextLine();
        cuentaBancaria.setNombre(nombreUsuario);
        System.out.println("Ingrese el saldo de cuenta: ");
        cuentaBancaria.setSaldo(scanner.nextDouble());
        return cuentaBancaria;
    }

    public static void showValues(BankAccount cuenta) {
        System.out.println("El número de cuenta es: " + cuenta.getNumCuenta());
        System.out.println("El nombre del propetario de la cuenta es: " + cuenta.getNombre());
        System.out.println("El saldo de la cuenta es: $" + cuenta.getSaldo());
        cuenta.deductMonthlyFee(cuenta.getSaldo());
        cuenta.explainAccountPolicy();
    }
}
