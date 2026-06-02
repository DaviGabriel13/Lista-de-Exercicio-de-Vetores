import java.util.Scanner;

public class davi13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[10];


        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            vetor[i] = in.nextInt();
        }


        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9 - i; j++) {

                if (vetor[j] > vetor[j + 1]) {

                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }


        System.out.println("\nVetor ordenado em ordem crescente:");

        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }

        in.close();
    }
}
