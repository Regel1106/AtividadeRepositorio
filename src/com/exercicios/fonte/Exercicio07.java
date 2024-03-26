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
public class Exercicio07 {
    
    //declaraçao do public void main
    public static void main(String[] args) {
        
        //criaçao de uma variavel do tipo scanner
        Scanner s = new Scanner(System.in);
        
        //criaçao de 3 variaveis do tipo inteiro
        int num, numfix, fatorial;
        
        //um print para pedir o numero que deseja fatoriar
        System.out.println("Informe o Numero que deseja fatoriar: ");
        
        //o scanner vai guardar a resposta na variavel num
        num = s.nextInt();
        
        
        //variavel fatorial e variavel numfix vai receber a variavel num
       fatorial =  num;
       numfix = num;
       
       
       //criaçao de um while para fatroriar o numero 
        while (num > 1) {
            System.out.println(fatorial + " x " + (num - 1) + " = " +  ( fatorial * (num - 1)));
            
            
            //fatorial vai receber ela mesmo (fatorial) vezes -1
            fatorial *=(num -1);
            
            
            //numero vai diminuir 1 a cada ciclo que se repetir
            num--;
                    
        }//fechamento do while
        
        //um print para falar o fatorial do numero que foi escrito
        System.out.println("O fatorial de " + numfix + " = " + fatorial);
    }//fechamento do public void main
}//fechamento do arquivo
