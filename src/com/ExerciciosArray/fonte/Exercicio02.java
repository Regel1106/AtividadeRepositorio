package com.ExerciciosArray.fonte;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Solicita ao usuário o tamanho do array
        System.out.print("Digite a quantidade de notas que deseja fazer a media ");
        int tamanho = s.nextInt();

        // Cria um array com o tamanho especificado
        int[] notas = new int[tamanho];

        // Solicita ao usuário para inserir os números no array
        System.out.println("Digite as notas que deseja fazer a media");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = s.nextInt();
        }
         float media = 0 ;
         for(int i = 0; i < notas.length; i++){
            media = media + notas[i]; 
         }
         media = media / notas.length;
         System.out.println("A media das notas e : " + media);
    }
}
                 
    

