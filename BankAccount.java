/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio3;

/**
 *
 * @author Azucena
 */
public class BankAccount {

    private int numCuenta;
    private String nombre;
    private double saldo;

    BankAccount() {
        numCuenta = 0;
        nombre = "";
        saldo = 0;
    }

    public void deductMonthlyFee(double saldo) {
        double saldoFinal;
        saldoFinal = saldo - 4;
        System.out.println("El saldo actual es: $" + saldoFinal);
    }

    public void explainAccountPolicy() {
        System.out.println("La tarifa de servicio es de $4, la cual se descontará cada mes al saldo de la cuenta del propetario. ");
    }

    /**
     * @return the numCuenta
     */
    public int getNumCuenta() {
        return numCuenta;
    }

    /**
     * @param numCuenta the numCuenta to set
     */
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
