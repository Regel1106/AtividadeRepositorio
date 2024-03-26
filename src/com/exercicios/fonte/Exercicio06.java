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
public class Exercicio06 {

    //declaraçao do public
    public static void main(String[] args) {

        //criaçao de 3 variavei do tipo inteiro, variavel aux vai receber 0
        int num, result, aux = 0;

        //craiaçao de uma variavel de scanner
        Scanner s = new Scanner(System.in);

        //criaçao de um bolean(verdadeiro ou facil) vai receber verdadeiro
        boolean contagem = true;

        //print vai pedir o numero que deseja ver a tabuada
        System.out.println("Digite o numero que deseja ver a tabudada:");

        //scanner vai guardar a resposta na variavel num
        num = s.nextInt();

        
        //criação deu um while para fazer 10 vezes o ciclo do if else
        while (contagem) {
            
            //um if para limitar a repetçao em 10 vezes
            if (aux == 10) {
                
                //se repetir 10 vezes a variavel boolean vai receber falso
                contagem = false;
                
                //else caso nao atingir o limite de 10 vezes
            } else {
                
                //variavel aux vai receber ela mesmo +1
                aux = aux + 1;
                
                //resultado vai receber o numero vezes a variavel aux
                result = num * aux;
                
                //print para escrever o resultado
                System.out.println(num + " x " + aux + " = " + result);
                
            }//fechamento do else
        }//fechamento do while
    }//fechamento do public void main
}//fechamento do arquivo
