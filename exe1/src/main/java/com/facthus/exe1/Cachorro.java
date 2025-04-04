
package com.facthus.exe1;

/**
 *nome, raça, cor de pelo e sexo
 * Crie métodos para andar, comer, dormir e latir.
 * Nestes métodos dê mensagem da execução da ação
 *(exemplo: andar -> andando...). 
 */


public class Cachorro {
    String nome, corPelo, sexo, raca;
    
    void andar(){
        System.out.println("andando...");
    }
    
    void comer(){
        System.out.println("comendo...");
    }
    
    void dormir(){
        System.out.println("dormindo...");
    }
    
    void latir(){
        System.out.println("latindo...");
    }
    
    void propriedade(){
        System.out.println("Cachorro: " + nome + "\nRaca: "+ raca + "\nPelo cor: " + corPelo + "\nSexo: " + sexo);
    }
    
}
