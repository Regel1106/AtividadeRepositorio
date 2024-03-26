
package com.mycompany.fonte;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num1, num2;
        System.out.println("Informe o primeiro numero: \n");
        num1 = scanner.nextInt();

        System.out.println("Informe o segundo numero: \n");
        num2 = scanner.nextInt();

                System.out.println("Resultado da soma: " + (num1+num2));
    }
}
