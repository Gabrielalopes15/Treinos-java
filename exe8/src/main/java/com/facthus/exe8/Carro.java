/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.facthus.exe8;

/**
 *nome, marca, ano de fabricação, velocidade atual, velocidade mínima e velocidade máxima.
 * @author user
 */
public class Carro {
    String nome, marca;
    int anoFabricacao;
    double velAtual, velMinima, velMaxima, velocidade;
    
    
    //Um carro também deve frear e acelerar, sendo permitido determinar a quantidade de velocidade que será acelerada
    //ou reduzida da velocidade atual.
    //Caso a velocidade reduzida seja inferior a zero ou a velocidade mínima, deve ser apresentado uma mensagem de alerta
    //e a velocidade atual não será alterada.
    
    void frear(){
        if (velocidade < 0 || velocidade < velMinima){
            System.out.println("Não foi possivel reduzir a velocidade....");
            System.out.println("Velocidade atual:  " + velAtual);
            System.out.println("Velocidade minima:  " + velMinima);
        
        }else{
            velAtual = velocidade - velAtual;
            System.out.println("FREANDO...");
            System.out.println("Velocidade atual:  " + velAtual);
        }
        
    }
    
    
    //Caso a velocidade acrescida seja superior a velocidade máxima, deve ser apresentado uma mensagem de alerta, 
    //mas a velocidade deverá ser acrescida.
    
        void acelerar(){
            if (velocidade > velMaxima) {
                System.out.println("Nao foi possivel acelerar");
                System.out.println("Velocidade atual:  " + velAtual);
                System.out.println("Velocidade maxima:  " + velMaxima);
            
            }else{
                velAtual = velocidade + velAtual;
                System.out.println("ACELERANDO....");
                System.out.println("Velocidade atual:  " + velAtual);
            }
    }
}
