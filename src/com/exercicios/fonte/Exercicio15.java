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

//criação arquivo
public class Exercicio15 {
    
    //declaração do public void main
        public static void main(String[] args) {
            
            //criação de 4 variaveis do tipo float
        float nota1,nota2,nota3,media;
        
        //criação de uma variavel do tipo scanner
        Scanner s = new Scanner(System.in);
        
        //print vai pedir a primeira nota
        System.out.println("Digite a Primeira nota: ");
        
        //nota1 vai receber a primeira nota
        nota1 = s.nextFloat();
        
        //print vai pedir a segunda nota
        System.out.println("Digite a Segunda nota: ");

        //nota2 vai receber a segunda nota
        nota2 = s.nextFloat();
        
        //print vai pedir a terceira nota
        System.out.println("Digite a Terceira nota: ");
        
        //nota2 vai receber a terceira nota
        nota3 = s.nextFloat();
        
        //variavel media vai receber nota1, nota2 e nota3 e dividir por 3
        media = (nota1+nota2+nota3)/3;
        
        //if e else para verificar se a media é maior ou igual a 7
        //caso seja aprovado digita aprovado caso contrario digita reprovado
        if (media >= 7){
            System.out.println("Aprovado MEDIA: " + media); 
        }else{ 
            System.out.println("Reprovado MEDIA: " + media);
        }//fecha else
    }//fecha public void main
}//fecha arquivo
