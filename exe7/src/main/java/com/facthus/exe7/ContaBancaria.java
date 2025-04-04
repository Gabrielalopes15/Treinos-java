/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.facthus.exe7;

/**
 *
 * @author user
 */
public class ContaBancaria {
    String titular;
    double saldo,saldoAtual,deposito,saque;
    
    //•	depositar -> passe como argumento um valor e aumente o saldo da conta
    
    void depositar(){
    saldoAtual = saldo + deposito;
        System.out.println("Voce depositou:  R$" + deposito);
        System.out.println("Saldo atual:  R$" + saldoAtual);
    }
    
    //•	sacar -> passe como argumento um valor e diminua o saldo, desde que haja
    
    void sacar(){
    saldoAtual = saldoAtual - saque;
        System.out.println("Voce sacou:  R$" + saque);
        System.out.println("Saldo atual:  R$" + saldoAtual);
    }
    
    void exibirSaldo(){
        System.out.println("Saldo atual:  R$" + saldoAtual);
    
    }
}
