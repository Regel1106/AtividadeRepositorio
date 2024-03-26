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
//criaçao arquivo
public class Exercicio12 {
    
    //declaração public void main
    public static void main(String[] args) {
        
        // declaraçoes de 3 variaveis tipo inteiro
        int a,b,aux;
        
        // criaçaio de um scanner
        Scanner s = new Scanner(System.in);
        
        //um print para pedir o numero para primeira variavel
        System.out.println("Digite Um numero para variavel 1: ");
        
        //scanner vai indentificar o numero e guardar na variavel a
        a = s.nextInt();

        //um print para pedir o numero para segunda variavel
        System.out.println("Digite Um numero para variavel 2: ");
        
        //scanner vai indentificar o numero e guardar na variavel b
        b = s.nextInt();
        
        //um print que vai falar a posiçao original da variavel
        System.out.println("\n\nAntes: " + "variavel 1: " + a + " variavel 2: " + b);

        //troca de posiçao
        
        //valor da variavel a vai para variavel aux
        aux = a;
        
        //valor da variavel b vai para variavel a
        a = b;
        
        //valor da variavel aux vai para variavel b
        b = aux;
        
        //um print para mostrar como ficou depois da troca
        System.out.println("\nDepois: " + "variavel 1: " + a + " variavel 2: " + b);

    }//fechamento do public void main
}//fechamento do arquivo
