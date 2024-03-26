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
//abertura arquivo
public class Exercicio14 {
    
    //declaraçao do public void main
    public static void main(String[] args) {
        
        //criaçao de uma variavel de scanner
        Scanner s = new Scanner(System.in);
        
        //A variavel do tipo string recebeu arara
        String palavra = "Arara";
        
        //Foi escrito na tela Digite a plavra que quer verificar se e palindromo:
        System.out.println("Digite a plavra que quer verificar se e palindromo:");
        
        //Foi escaniado a palavra que foi escrita
        palavra = s.nextLine();
        
        //A palavra escrita trocara as letras maiusculas por minusculas
        palavra = palavra.toLowerCase();
        
        //Criaçao de uma variavel que vai receber quantas letras tem na palavra
        int lenPalavra = palavra.length();
        
        //criaçao da parte de tras e da frente da palavra para conferir se sao iguais
        char charFrente;
        char charTras;
        
        //criaçai de uma variavel de verdadeiro ou falso 
        boolean palindromo = true;
        
        //inicio for para verificar se a parte da frente é igual a parte de tras da palavra
        for(int i = 0; i < lenPalavra; i++){
            charFrente = palavra.charAt(i);
            charTras = palavra.charAt(lenPalavra - i - 1);
            
            //criaçao de um if para caso seje diferente indentificar o erro
            if(charFrente != charTras){
                
                //palindromo vai receber falso se tiver um erro
                palindromo = false;
                
                //break foi usado para parar o for
                break;
                
            }//fechamento if
       }//fechamento for
        
        //if e else para digitar se a palavra é palindromo ou nao é
        if(palindromo){
            System.err.println("A palavra: " + palavra + " e um palindromo");

            
        }else{//fechamento if e criaçao else
            System.err.println("A palavra: " + palavra + " e nao e um palindromo");

        }//fechamento else
    }//fechamento do public void main
}//fechamento do arquivo
