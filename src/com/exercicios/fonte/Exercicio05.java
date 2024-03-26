/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exercicios.fonte;

import java.util.Scanner;

/**
 *
 * @author regel.7967
 */

//criaçao de um arquivo
public class Exercicio05 {
    
    //declaraçao do public void main
    public static void main(String[] args) {
        
        //criaçao de uma variavel inteira chamada num
        int num;
        
        //criaçao de uma variavel de scanner
        Scanner s = new Scanner(System.in);
        
        //criaçao de uma variavel boolean(verdadeiro ou falso) com o nome de contagem
        boolean contagem = true;
        
        //um print para pedir o numero que ira começar a contagem regreciva
        System.out.println("Numero de inicio da contagem Regreciva: ");
        
        //scanner vai receber a resposta e guardar em num
        num = s.nextInt();
        
        //criação de um while para repetir o if e o else
        while (contagem){
            
            //if para caso o numero seje maior que 1 vai diminuir 1 a cada ciclo
            if (num >= 1){
                num =  num - 1;
                
                //um print para digitar o numero do ciclo
                System.out.println(num);
                
            }else{//fechamento do if e criaçao do else
                
                //caso chegue em 1 contagem vai receber falso para parar o while
                contagem = false;
                
            }//fechamento else
        }//fechamento while
    }//fechamento public void main
}//fechamento do arquivo

