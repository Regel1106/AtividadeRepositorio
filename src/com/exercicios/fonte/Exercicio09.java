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
public class Exercicio09 {
    
    //declaraçao de um public void main
    public static void main(String[] args) {
        
        //criaçao de uma variavel long para receber numeros grandes, variavel 1 vai recber 0 e variavel 2 vai receber 1
        long var1 = 0,var2 = 1,result,repet,repetcont;
        
        //criaçao de uma variavel de scanner
        Scanner s =new Scanner(System.in);
        
        //um print vai pedir a quantidade de repetiçoes do ciclo
        System.out.println("Digite a quantidade de repeticoes: ");
        
        //scanner vai ler a resposta e guardar na variavel repet
        repet = s.nextInt();
        
        //criaçao de um for para repetir quantas vezes o usuario digitar
        for (int i = 0; i < repet; i++){
            
            //troca de posiçoes de variavel
            //variavel resultado vai receber a soma da variavel 1 + varivel 2
                    result = var1+var2;
                    
                    //print vai escrever o numero das variaveis e o resultado
                    System.out.println(var1 + " + " + var2 + " = " + result);
                    
                    //o numero da variavel 1 vai para a variavel 2
                    var1 = var2;
                    
                    //o numero da variavel 2 vai para result
                    var2 = result;

        }//fechamento for
    }//fechamento do public void main
}//fechamento do arquivo
