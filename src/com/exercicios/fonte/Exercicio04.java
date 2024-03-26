package com.exercicios.fonte;

import java.util.Scanner;


//criaçao de um arquivo
public class Exercicio04 {
    
    //declaraçao de um public void main
    public static void main(String[] args) {
        
        //criaçao de 1 variavel do tipo inteira e 3 do tipo float
        int opcao;
        float num1,num2,result;
        
        
        //criaçao de uma variavel de scanner
        Scanner s = new Scanner(System.in);
        
        
        //um print para escrever o numero que precisa apertar para cada operaçao escolhida
            System.out.println("Selecione a operacao: \n\n" +
                "1 - Soma\n" + 
                "2 - Subtracao\n" + 
                "3 - Divisao\n" + 
                "4 - Multiplicacao\n");

            //scanner vai receber resposta e guardar em opção
            opcao = s.nextInt();

            //um if para verificar se é uma opçao valida
            if(opcao > 4|| opcao <=0){
                System.err.println("Opcao inexistente!\n\n\n\n\n");
                System.exit(0);

            }//fechamento if
            
            //um print para pedir o primeiro numero
            System.out.println("Informe o Primeiro numero: ");
            
            //scanner vai guardar resposta na variavel num1
            num1 = s.nextFloat();

            //um print para pedir o segundo numero           
            System.out.println("Informe o Segundo numero: ");
            
            //scanner vai guardar resposta na variavel num1
            num2 = s.nextFloat();

            //um if para ver qual opeção é e fazer o calculo expecifico de cada uma
            if(opcao == 1){
                result = num1 + num2;
            }else if(opcao == 2){
                result = num1 - num2;
            }else if(opcao == 3){
                result = num1 / num2;
            }else{
                result = num1 * num2;
            }

            //um print pra mostrar o resultado
            System.out.println("Resultado: " + result);
            
            
        
    }//fechamento do public void main
    
}//fechamento do arquivo
