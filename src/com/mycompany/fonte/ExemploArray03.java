/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fonte;

import java.util.Scanner;

/**
 *
 * @author regel.7967
 */

//criando arquivo
public class ExemploArray03 {
    
    //declarando public void main
    public static void main(String[] args) {
        
        //criando uma variavel de scanner
        Scanner s = new Scanner(System.in);
        
        //criando um vetor que suporta nomes
        String[] nomes = {
            "Jose",
            "Gabriel",
            "Lucas",
            "Pedro",
            "Henrique"
        };
        //fechando vetor
        
        //print vai pedir o nome do convidado
        System.out.println("nomes: ");
        
        //scanner vai ler o nome do convidado em formato de string
        String convidado = s.nextLine();
        
        //criação de uma variavel auxiliar e dando o valor de inicio 0
        int i = 0;
        
        //criando um laço de repetiçao para verificar se o nome que foi digitado é algum dos que estão na lista
        while(i < nomes.length){
            
            //if para verificar se o nome é igual o que foi escrito
            if (nomes[i].equals(convidado)){
                
                //se o nome estiver na lista o print vai escrever nao é penetra
                System.out.println("O " + nomes[i] + " Não é penetra " + i);
                
                //caso o nome estiver na lista fecha o codigo
                System.exit(0);
            }
            //caso nao for variavel auxiliar (i) vai receber +1 para checar o proximo convidado
            i++;
        }//fecha while
        //caso nao seje nenhum nome da lista o print vai escrever que é penetra
        System.out.println(convidado + " é penetra!");
    }//fecha public
}//fecha arquivo
