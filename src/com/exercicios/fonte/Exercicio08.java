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
public class Exercicio08 {
    
    //declaraçao do public void main
    public static void main(String[] args) {
        
        //criaçao de 3 variavei tipo float
        float a, num, num2;
        
        //criaçao de um scanner
        Scanner s =new Scanner (System.in);
        
        //print vai pedir um numero
        System.out.println("Informe o Numero: ");
        
        //scanner vai guardar o numero na variavel a
            a = s.nextFloat();
            
            //a variavel a vai ser dividida por 2 e num vai receber o resto
        num = a %2;
        
            //a variavel a vai ser dividida por 3 e num2 vai receber o resto
        num2 = a %3;
        
        //um if para caso o numero seje 2 falar que o numero é primo (2 é o unico numero par primo)
        if (a == 2) {
            System.out.println("E um Numero Primo");
            
            //fechamento do if e inicio do else if para indentificar se o numero é par, caso seja vai ser escrito que nao é um numero primo
        }else if (num == 0 || num2 == 0){
            System.out.println("Nao e Primo");
            
            //fechamento do else if e inicio do if caso o numero seja impar escrever que é primo
                }else{
            System.out.println("E um Numero Primo");
            }//fechamento do else
        }//fechamento do public void main
    }//fechamento do arquivo

