
package com.facthus.exe4;

/**
- Escreva um programa Java para criar uma classe chamada Funcionario com um nome, cargo e
salário. Crie métodos para atualizar o salário (receber como argumento um novo salário).
 */
public class Exe4 {

    public static void main(String[] args) {
        Funcionario cad1 = new Funcionario ();
        cad1.nome = "Gabriela";
        cad1.cargo = "Tecnico";
        cad1.salarioAtual = 2000;
        cad1.salario = 600 ;
        
        cad1.atualizarSalario();
    }
}
