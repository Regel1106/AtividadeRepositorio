/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ExerciciosArray.fonte;

import java.util.Scanner;

/*
 * @author regel.7967
 */
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Solicita ao usuário o tamanho do array
        System.out.print("Digite a quantidade de numeros que deseja somar ");
        int tamanho = s.nextInt();

        // Cria um array com o tamanho especificado
        int[] array = new int[tamanho];

        // Solicita ao usuário para inserir os números no array
        System.out.println("Digite o numero que deseja somar:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            array[i] = s.nextInt();
        }
        int soma = 0;        
        
            for(int i = 0; i < array.length; i++){
                soma += array[i];
            }
            System.err.println("A soma dos numeros do array =  " + soma);
    }
}
