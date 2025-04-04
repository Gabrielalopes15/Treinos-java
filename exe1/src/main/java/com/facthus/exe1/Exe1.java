/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.facthus.exe1;

/**
 *– Crie uma classe chamada Cachorro. Este cachorro deve possuir nome, raça, cor de pelo e sexo.
 * Crie um método para exibir informações que deverá trazer os dados
 *de propriedades do cachorro (exemplo: “Cachorro XXXXX da raça XXXX e do pelo cor XXXX é macho”).
 * @author user
 */
public class Exe1 {

    public static void main(String[] args) {
        Cachorro dog1 = new Cachorro ();
        dog1.nome = "Rex";
        dog1.corPelo = "Marrom";
        dog1.raca = "Pastor";
        dog1.sexo = "Macho\n\n";
        dog1.propriedade();
        
        Cachorro dog2 = new Cachorro ();
        dog2.nome = "Pipoca";
        dog2.corPelo = "Branco";
        dog2.raca = "Pug";
        dog2.sexo = "Femea\n\n";
        dog2.propriedade();
    }
    
    
    
}
