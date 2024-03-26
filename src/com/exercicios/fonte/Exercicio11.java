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

//criação do arquivo
public class Exercicio11 {
    
    //declaraçao do public void main
    public static void main(String[] args) {
        
        //declaraçao de 2 variaveis A e B
        int a,b;
        
        //criaçao de uma variavel de scanner
        Scanner s = new Scanner(System.in);
        
        //um print pedindo para digitar o primeiro numero
        System.out.println("Digite o Primeiro numero: ");
        
        //scanner vai ler o numero digitado e colocar na variavel a
        a = s.nextInt();
        
        //um print pedindo par digitar o segundo numero
        System.out.println("Digite o Segundo numero: ");
        
        //scanner vai ler o numero digitado e colocar na variavel b
        b = s.nextInt();
        
        //if e else if para indentificar qual é maior e qual é menor
        if(a < b){
            System.out.println(a + ": Menor e " + b + ": Maior");
        }else if(b < a){
            System.out.println(b + ": Menor e " + a + " : Maior");
            
            //um else para indentificar se os numeros sao iguais
        }else{
            System.out.println("Os numeros sao Iguais");

        }//fechamento do else
        
        
    }//fechamento do public void main
}//fechamento do arquivo
