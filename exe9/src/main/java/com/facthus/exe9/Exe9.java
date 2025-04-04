 //9	- Crie uma classe chamada Pessoa que tenha nome (String), idade (int), sexo (String), peso (double) e altura (double).
//Crie um método para calcular a descrição do sexo (utilize if).


package com.facthus.exe9;


public class Exe9 {

    public static void main(String[] args) {
        Pessoa cad1 = new Pessoa ();
        cad1.nome = "Gabriela";
        cad1.idade = 24;
        cad1.altura = 1.70;
        cad1.peso = 77;
        cad1.sexo = "FM";
        
        
        cad1.sexo();
        cad1.calcularIMC();
        cad1.classificarIMC();
        cad1.ficha();
        
    }
}
