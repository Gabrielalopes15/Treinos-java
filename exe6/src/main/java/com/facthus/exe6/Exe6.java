/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.facthus.exe6;

/**
 *
 * @author user
 */
public class Exe6 {

    public static void main(String[] args) {
        Produto prod1 = new Produto ();
        
        prod1.nome = "ARROZ";
        prod1.precoCusto = 20;
        prod1.quantidade = 15;
        prod1.quantidadeAtual = 10;
        prod1.lucro = 50;
        
        prod1.calcularPrecoVenda();
        prod1.adicionarProduto();
    }
    
    
    
    
}
