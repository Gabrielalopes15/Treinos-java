
package com.facthus.exe5;

/**
Escreva uma classe chamada Java chamada Semaforo com os atributo cor e duração. 
* Crie um método que permita alterar a cor do semáforo e um método que controle 
* o tráfego (se estiver verde imprimir “Siga”, se estiver amarelo imprimir “Atencão” 
* e se estiver vermelho imprimir “Pare”).
 */
public class Exe5 {

    public static void main(String[] args) {
        Semaforo control = new Semaforo ();
        
        control.trafego();
    }
}
