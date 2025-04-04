

package com.facthus.exe03;

/**
- Escreva um programa Java para criar uma classe chamada Circulo com um atributo raio. Crie um
método que calcule a área e a circunferência do círculo. (área = PI x raio x raio) (circunferência = 2 x PI
x raio).
 */
public class Exe03 {

    public static void main(String[] args) {
        Circulo medida = new Circulo ();
        medida.raio = 5.0;
        
        medida.calcular();
    }
}
