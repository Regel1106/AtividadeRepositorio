/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exercicios.fonte;

import java.text.Normalizer;
import java.util.Scanner;

/**
 *
 * @author regel.7967
 */
//criaçao do arquivo
public class Exercicio13 {
    
    //declaraçao public void main
    public static void main(String[] args) {
        
        //criaçao de um scanner
        Scanner s = new Scanner(System.in);
        
        //criçao de um array com o nome de vogais com as variaveis a,e,i,o,u dentro
            char[] vogais = {'a','e','i','o','u'};
            
            //criaçao de uma variavel tipo string com o nome texto recebendo o nome Gabriel Regel dentro
            String texto = "Gabriel Regel";
            
            //a variavel texto vai receber o comando nomralizer (que tira os acentos da palavras e deixa so a letra normal sem acento)
            texto = Normalizer.normalize(texto, Normalizer.Form.NFD);
            
            //declaração de uma variavel tipo inteira com o nome contVogais para indentificar o tanto de vogais tem na palavra, vai receber 0 para começar com 0
            int contVogais = 0;
            
            //For para indentificar o tanto de letras tem na palavra
            for( int i = 0; i < texto.length(); i++){
                
                //for para indentificar o tanto de vogais tem na palavra
                for( int j = 0; j < vogais.length; j++){
                    
                    //if para se tiver uma vogal adicionar +1 a variavel vogais
                    if(texto.toLowerCase().charAt(i) == vogais[j]){
                        contVogais++;
                        
                        //brake para parar o for caso nao tenha mais vogais
                        break;
                    }// fechamento if
                }// fechamento segundo for
            }// fechamento primeiro for
            
            //print para escrever a palavra que digitei
            System.out.println(texto );
            
            //print para escrever o tanto de vogais que tem na palavra
            System.out.println("Total de vogais: " + contVogais );
                
    }    
}
