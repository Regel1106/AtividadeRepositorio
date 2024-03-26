package com.ExerciciosArray.fonte;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Solicita ao usuário o tamanho do array
        System.out.print("Digite a quantidade de numeros que deseja guardar em um vetor ");
        int tamanho = s.nextInt();

        // Cria um array com o tamanho especificado
        int[] vetor = new int[tamanho];

        // Solicita ao usuário para inserir os números no array
        System.out.println("Digite o numero que deseja guardar:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            vetor[i] = s.nextInt();
        }
        

        // Ordena o vetor
        bubbleSort(vetor);

        // Exibe o vetor após a ordenação
        System.out.println("Menor numero do vetor " + vetor[0] +"\nMaior numero do vetor "+ vetor[tamanho - 1]);
        imprimirVetor(vetor);
    }

    // Implementação do Bubble Sort
    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (vetor[j] > vetor[j+1]) {
                    // Troca os elementos
                    int temp = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = temp;
                }
            }
        }
    }

    // Função auxiliar para imprimir o vetor
    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
        }
        System.out.println();
    }
}
