import java.util.Scanner;

public class davi10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetor3 = new int[20];

        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = in.nextInt();
        }

        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = in.nextInt();
        }

        int pos = 0;

        for (int i = 0; i < 10; i++) {
            vetor3[pos] = vetor1[i];
            pos++;

            vetor3[pos] = vetor2[i];
            pos++;
        }

        System.out.println("Vetor intercalado:");

        for (int i = 0; i < vetor3.length; i++) {
            System.out.print(vetor3[i] + " ");
        }
    }
}
