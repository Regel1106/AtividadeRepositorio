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

//criação de arquivo
public class Exercicio03 {
    
    //declaração public void main
    public static void main(String[] args) {
        
        //criaçao deu 2 variaveis tipo float
        float a, result;
        
        //criação de uma variavel de scanner
        Scanner s =new Scanner (System.in);
        
        //print vai pedir um numero
        System.out.println("Informe o Primeiro numero: ");
        
        //variavel a vai receber o numero escrito
            a = s.nextFloat();
            
            //variavel resultado vai receber a sobra da divisão da variavel a dividido por 2
        result = a %2;
        
        //if para verificar se sobra 1, caso sobre vai escrever impar
        if (result == 1 ) {
            System.out.println("Impar");
            
            //else para indentificar se é par
        }else{
            System.out.println("Par");
        }//fecha else
    }//fecha public void main
}//fecha arquivo
