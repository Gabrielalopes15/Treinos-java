/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.facthus.exe6;

/**
 *
 * @author user
 */
public class Produto {
   String nome;
   double precoVenda,precoCusto,quantidadeAtual, lucro, quantidade,quantidadeAtualizada;
   
   
   void calcularPrecoVenda(){
       precoVenda = precoCusto * (lucro/100);
       System.out.println("Preco de venda atualizado: " + precoVenda);
   }
   
   void adicionarProduto(){
       quantidadeAtualizada = quantidade + quantidadeAtual;
       System.out.println("Produto alterado com sucesso!");
       System.out.println("Item: " + nome + "quantidade: " + quantidadeAtualizada);
   }
   
    void subtrairProduto(){
       quantidadeAtual = quantidade - quantidadeAtual;
       System.out.println("Produto alterado com sucesso!");
       System.out.println("Item: " + nome + "/nQuantidade: " + quantidadeAtual);
   }
   
}
