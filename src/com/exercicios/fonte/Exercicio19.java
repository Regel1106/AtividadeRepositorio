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
public class Exercicio19 {
    public static void main(String[] args) {
        float nota1,nota2,nota3;
        float peso1,peso2,peso3;
        float mediaponderada;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a Primeira Nota: ");
        nota1 = s.nextInt();
        System.out.println("Digite o Primeiro Peso: ");
        peso1 = s.nextInt();
                System.out.println("Digite a Segunda Nota: ");
        nota2 = s.nextInt();
                System.out.println("Digite o Segundo Peso: ");
        peso2 = s.nextInt();
                System.out.println("Digite a Terceira Nota: ");
        nota3 = s.nextInt();
                System.out.println("Digite Terceiro Peso: ");
        peso3 = s.nextInt();
        mediaponderada= ((nota1*peso1)+(nota2*peso2)+(nota3*peso3))/(peso1+peso2+peso3);
        System.err.println("Media Ponderada: " + mediaponderada);

    }
}