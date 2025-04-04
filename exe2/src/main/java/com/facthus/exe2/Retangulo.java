
package com.facthus.exe2;

/**
 *
 * @author user
 */
public class Retangulo {
    Double altura, largura;
    
    
    double calcularArea (){
    return altura * largura;
    }
    
    double calcularPerimetro(){
         return 2 * (largura + altura);
    }
    
     void exibirResultados() { 
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
        
    }
    
}
