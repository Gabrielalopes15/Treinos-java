/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.facthus.exe7;

/**
 *
 * @author user
 */
public class Exe7 {

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria ();
        conta1.titular = "Gabriela";
        conta1.deposito = 1000;
        conta1.saldoAtual = 10;
        conta1.saldo = 20;
        conta1.saque = 50;
        
        conta1.depositar();
        conta1.sacar();
        conta1.exibirSaldo();
    }
}
