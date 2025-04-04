 //9	- Crie uma classe chamada Pessoa que tenha nome (String), idade (int), sexo (String), peso (double) e altura (double).
//Crie um método para calcular a descrição do sexo (utilize if).
package com.facthus.exe9;


public class Pessoa {
    String nome, sexo, estadoCivil, classIMC;
    int idade;
    double peso, altura, IMC;

    void sexo(){
        if (sexo == "FM"){
            sexo = "FEMININO";
        }else{
            sexo = "MASCULINO";
        }
    }
    
    //Crie um método para calcular o IMC. Este método deve retornar o valor de IMC calculado. (IMC = peso/(altura x altura))
    
    void calcularIMC(){
        IMC = peso / (altura * altura);
    }
    
    /*Crie um método para calcular a classificação do IMC (utiliza if-else if-else).
        18.50 – 24.99: Peso Normal.
        25.00 – 29.99: Pré-Obesidade.
        30.00 – 34.99: Obesidade Grau I.
        35.00 – 39.99: Obesidade Grau II.
        ≥40.00: Obesidade Grau III.
    */
    
    void classificarIMC(){
        if (IMC > 18.50 || IMC < 24.99){
            classIMC = "Peso normal.";
           
        }else if (IMC > 25.00 || IMC < 29.99){
            classIMC = "Pre- obesidade.";
           
        }else if (IMC > 30.00 || IMC < 34.99){
            classIMC = "Obesidade Grau I.";
            
        }else if (IMC > 35.00 || IMC < 39.99){
            classIMC = "Obesidade Grau II.";
            
        }else if (IMC >= 40.00){
            classIMC = "Obesidade Grau III.";
        }
    }
    
    void ficha(){
        System.out.println("--------------------");
        System.out.println("Pessoa:  " + nome);
        System.out.println("--------------------");
        System.out.println("Idade:  " + idade);
        System.out.println("Sexo:  " + sexo);
        System.out.println("Estado Civil:  " + estadoCivil);
        System.out.println("Peso:  " + peso);
        System.out.println("Altura:  " + altura);
        System.out.println("IMC:  " + IMC + " - " + classIMC);
        
    }

}
