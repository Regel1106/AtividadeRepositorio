import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Solicita ao usuário o tamanho do array
        System.out.print("Digite a quantidade de numeros que deseja guardar no array: ");
        int tamanho = s.nextInt();

        // Cria um array com o tamanho especificado
        int[] array = new int[tamanho];

        // Solicita ao usuário para inserir os números no array
        System.out.println("Digite os numeros que deseja guardar no array:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            array[i] = s.nextInt();
        }

        // Troca de elementos do array para inverter
        for (int i = 0; i < tamanho / 2; i++) {
            int temp = array[i];
            array[i] = array[tamanho - i - 1];
            array[tamanho - i - 1] = temp;
        }

        // Exibindo o array invertido
        System.out.println("Array invertido:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
