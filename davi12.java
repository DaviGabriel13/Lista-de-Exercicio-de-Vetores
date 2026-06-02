import java.util.Scanner;

public class davi12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;

        System.out.print("Digite o tamanho do vetor: ");
        n = in.nextInt();

        int[] vetor = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            vetor[i] = in.nextInt();
        }


        boolean ordenado = true;

        for (int i = 0; i < n - 1; i++) {

            if (vetor[i] > vetor[i + 1]) {
                ordenado = false;
                break;
            }
        }


        if (ordenado) {
            System.out.println("O vetor está em ordem crescente.");
        } else {
            System.out.println("O vetor NÃO está em ordem crescente.");
        }

        in.close();
    }
}
