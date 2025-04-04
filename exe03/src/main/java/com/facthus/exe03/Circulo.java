
package com.facthus.exe03;

/**
- Escreva um programa Java para criar uma classe chamada Circulo com um atributo raio. Crie um
método que calcule a área e a circunferência do círculo. (área = PI x raio x raio) (circunferência = 2 x PI
x raio).
 */
public class Circulo {
    double raio, area , circuferencia;
    
    void calcular(){
    
        area = (3.14 * (raio * raio));
        circuferencia = (2 * (3.14 * raio));
        
        System.out.println("o resultado é area = " + area + "  circuferencia = " + circuferencia);
    
    
    }
    
}
