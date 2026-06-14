import java.util.Scanner;

public class davi8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int nota;
        int[] frequencia = new int[11]; // posições de 0 a 10
        double frequenciaRelativa;


        for (int i = 1; i <= 80; i++) {

            do {
                System.out.print("Informe a nota do aluno " + i + " (0 a 10): ");
                nota = in.nextInt();

                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida! Digite novamente.");
                }

            } while (nota < 0 || nota > 10);

            frequencia[nota]++;
        }


        System.out.println("\nNOTA\tFREQ. ABS\tFREQ. REL");

        for (int i = 0; i <= 10; i++) {

            frequenciaRelativa = (double) frequencia[i] / 80;

            System.out.printf("%d\t%d\t\t%.2f%%\n",
                    i+"  ",
                    frequencia[i]+"  ",
                    frequenciaRelativa * 100);
        }

        in.close();
    }
}