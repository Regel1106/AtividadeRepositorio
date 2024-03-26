//Pasta onde esta salvo
package com.mycompany.fonte;

//biblioteca do scanner
import java.util.Scanner;

//Inicio do codigo
public class Exemplo05 {
    public static void main(String[] args) {
        
//Declaração de variaveis(scanner conta como variavel)
        int opcao;
        float num1,num2,result;
        
        Scanner s = new Scanner(System.in);
        
        boolean continuar = true;
        
        
        while (continuar){
    //Escrita de opções
            System.out.println("Selecione a operacao: \n\n" +
                "1 - Soma\n" + 
                "2 - Subtracao\n" + 
                "3 - Divisao\n" + 
                "4 - Multiplicacao\n");

    //Indentificaçao da escolha usando scanner
            opcao = s.nextInt();

    //Codigo para fechar o codigo caso esteje uma opção que não existe
            if(opcao > 4|| opcao <=0){
                System.err.println("Opcao inexistente!\n\n\n\n\n");
                System.exit(0);

            }

    //Escrita pedindo o primeiro e segundo numero, e indentificando a escolha
            System.out.println("Informe o Primeiro numero: ");
            num1 = s.nextFloat();

            System.out.println("Informe o Segundo numero: ");
            num2 = s.nextFloat();

    //Codigo para selecionar a opção desejada
            if(opcao == 1){
                result = num1 + num2;
            }else if(opcao == 2){
                result = num1 - num2;
            }else if(opcao == 3){
                result = num1 / num2;
            }else{
                result = num1 * num2;
            }

    //Exebição dos resultados
            System.out.println("Resultado: " + result);
            
            System.err.println("Deseja realizar mais alguma operacao? (sim = 1 / nao = 0)");
            opcao = s.nextInt();
            
            if(opcao == 0){
                continuar = false;
                System.err.println("\n" + "CODIGO ENCERRADO.");

            }
        }
    }
    
}
//Fim de codigo