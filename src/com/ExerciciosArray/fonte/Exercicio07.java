import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Solicita ao usuário o tamanho do primeiro array
        System.out.print("Digite a quantidade de numeros que deseja guardar no primeiro array: ");
        int tamanho1 = s.nextInt();

        // Cria um array com o tamanho especificado
        int[] array1 = new int[tamanho1];

        // Solicita ao usuário para inserir os números no primeiro array
        System.out.println("Digite os numeros que deseja guardar no primeiro array:");
        for (int i = 0; i < tamanho1; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            array1[i] = s.nextInt();
        }

        // Solicita ao usuário o tamanho do segundo array
        System.out.print("Digite a quantidade de numeros que deseja guardar no segundo array: ");
        int tamanho2 = s.nextInt();

        // Cria um array com o tamanho especificado
        int[] array2 = new int[tamanho2];

        // Solicita ao usuário para inserir os números no segundo array
        System.out.println("Digite os numeros que deseja guardar no segundo array:");
        for (int i = 0; i < tamanho2; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            array2[i] = s.nextInt();
        }

        // Chama a função para juntar os arrays
        int[] arrayjunto = arrayjunto(array1, array2);

        // Imprime o array resultante
        System.out.print("Array junto: ");
        for (int num : arrayjunto) {
            System.out.print(num + " ");
        }
    }

    public static int[] arrayjunto(int[] array1, int[] array2) {
        // Cria um novo array com o tamanho total dos dois arrays originais
        int[] arrayjunto = new int[array1.length + array2.length];

        // Copia os elementos do primeiro array para o novo array
        for (int i = 0; i < array1.length; i++) {
            arrayjunto[i] = array1[i];
        }

        // Copia os elementos do segundo array para o novo array
        for (int i = 0; i < array2.length; i++) {
            arrayjunto[array1.length + i] = array2[i];
        }

        // Retorna o array resultante
        return arrayjunto;
    }
}
