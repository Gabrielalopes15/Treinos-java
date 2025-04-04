/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.facthus.exe8;

/**
 *
 * @author user
 */
public class Exe8 {

    public static void main(String[] args) {
        Carro car1 = new Carro();
        
        car1.nome = "Palio";
        car1.marca = "Fiat";
        car1.anoFabricacao = 2010;
        car1.velMaxima = 150;
        car1.velMinima = 40;
        car1.velAtual = 20;
        car1.velocidade = 20;
        
       
        car1.frear();
    }
}
