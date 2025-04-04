/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.facthus.exe5;

/**
Escreva uma classe chamada Java chamada Semaforo com os atributo cor e duração. 
* Crie um método que permita alterar a cor do semáforo e um método que controle 
* o tráfego (se estiver verde imprimir “Siga”, se estiver amarelo imprimir “Atencão” 
* e se estiver vermelho imprimir “Pare”).
 */
public class Semaforo {
    String cor;
    int contador = 0;


    void trafego(){
        while (contador < 20){
            if (contador < 5){
                cor = "amarelo";
                System.out.println("Atencao...");
                
            }else if (contador <10 ){
                cor = "verde";
                System.out.println("Siga...");
                
            }else {
                cor = "vermelho";
                System.out.println("Pare...");
            }  
            
        contador++;
        }

    }
}
