import java.util.Scanner;

public class davi7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;

        do {
            System.out.print("Digite a quantidade de números (máx 100): ");
            n = in.nextInt();
        } while (n <= 0 || n > 100);

        int[] vetor1 = new int[n];
        int[] vetor2 = new int[n];

        int cont1 = 0;
        int cont2 = 0;

        for (int i = 0; i < n; i++) {

            System.out.print("Digite um número: ");
            int num = in.nextInt();


            if (num > 0 && num%2 == 0) {
                vetor1[cont1] = num;
                cont1++;
            } else {

                vetor2[cont2] = num;
                cont2++;
            }
        }

        System.out.println("\nVetor1 (positivos e pares):");
        for (int i = 0; i < cont1; i++) {
            System.out.print(vetor1[i] + " ");
        }

        System.out.println("\nVetor2 (ímpares e/ou negativos):");
        for (int i = 0; i < cont2; i++) {
            System.out.print(vetor2[i] + " ");
        }

        in.close();
    }
}
