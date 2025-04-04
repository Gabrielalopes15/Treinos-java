
package com.facthus.exe2;

/**
 Crie uma classe chamada Retângulo. Esta classe terá as propriedades de largura e altura, ambas
double. Crie dois métodos para a classe, sendo um para calcular a área (largura * altura) e outro para
calcular o perímetro (2*(largura + altura)).
 */
public class Exe2 {

    public static void main(String[] args) {
        
        Retangulo calcular1 = new Retangulo ();
        calcular1.altura = 10.00;
        calcular1.largura = 3.00;
        
        calcular1.exibirResultados();
        
    }
}
