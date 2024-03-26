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
public class Exercicio18 {
    public static void main(String[] args) {
        int janeiro = 31,fevereiro = 28,marco = 31, abril = 30, maio = 31, junho = 30, julho =31, agosto = 31, setembro = 30, outubro = 31, novembro =30, dezembro =31, resposta;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o Numero do Mes que deseja saber:\n1 - Janeiro\n2 - Fevereiro\n3 - Marco\n4 - Abril\n5 - Maio\n6 - Junho\n7 - Julho\n8 - Agosto\n9 - Setembro\n10 - Outubro\n11 - Novembro\n12 - Dezembro");
        resposta = s.nextInt();
        if(resposta == 1){
            System.err.println("Janeiro: " + janeiro);
        }else if(resposta == 2){
            System.err.println("Fevereiro: " + fevereiro);
        }else if(resposta == 3){
            System.err.println("Marco: " + marco);
        }else if(resposta == 4){
            System.err.println("Abril: " + abril);
        }else if(resposta == 5){
            System.err.println("Maio: " + maio);
        }else if(resposta == 6){ 
            System.err.println("Junho: " + junho);
        }else if(resposta == 7){    
            System.err.println("Julho: " + julho);
        }else if(resposta == 8){    
            System.err.println("Agosto: " + agosto);
        }else if(resposta == 9){      
            System.err.println("Setembro: " + setembro);
        }else if(resposta == 10){      
            System.err.println("Outubro: " + outubro);
        }else if(resposta == 11){       
            System.err.println("Novembro: " + novembro);
        }else{
            System.err.println("Dezembro: " + dezembro);

        }    
    }
}

