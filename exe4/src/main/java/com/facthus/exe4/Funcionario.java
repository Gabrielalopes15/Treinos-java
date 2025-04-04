
package com.facthus.exe4;

/**
- Escreva um programa Java para criar uma classe chamada Funcionario com um nome, cargo e
salário. Crie métodos para atualizar o salário (receber como argumento um novo salário).
 */
public class Funcionario {
    String nome, cargo;
    double salario, salarioAtual;
    
    void atualizarSalario(){
        salario = salarioAtual + salario;
        System.out.println("O novo salario : " + salario);
    
    }
}
