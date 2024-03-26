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
public class Exercicio02 {

    //declaração public void main
    public static void main(String[] args) {
        
        //criação de 4 variaveis tipo float
        float a, b, c, media;
        
        //criação de uma variavel tipo scanner
        Scanner s = new Scanner(System.in);

        //print vai pedir o primeiro numero
        System.out.println("Informe o Primeiro numero: ");
        
        //variavel a recebe o primeiro numero
        a = s.nextFloat();
        
        //print vai pedir o segundo numero
        System.out.println("Informe o Segundo numero: ");
        
        //variavel b recebe o segundo numero
        b = s.nextFloat();
        
        //print vai pedir o terceiro numero
        System.out.println("Informe o Terceiro numero: ");
        
        //variavel c recebe o terceiro numero
        c = s.nextFloat();
        
        //media vai receber variavel a + b + c e dividir por 3
        media = (a + b + c) / 3;
        
        //print vai escrever a media
        System.out.println("MEDIA: " + media);
    }//fecha public void main
}//fecha arquivo
