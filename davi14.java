import java.util.Scanner;

public class davi14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[] dados = new double[20];

        double soma = 0;
        double media;
        double somaQuadrados = 0;
        double desvioPadrao;


        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            dados[i] = in.nextDouble();
            soma += dados[i];
        }


        media = soma / 20;


        for (int i = 0; i < 20; i++) {
            somaQuadrados += Math.pow(dados[i] - media, 2);
        }

        desvioPadrao = Math.sqrt(somaQuadrados / 19); // n - 1


        System.out.println("\nMédia: " + media);
        System.out.println("Desvio padrão: " + desvioPadrao);


        if (Math.abs(media - 390) > 5 || desvioPadrao > 5) {
            System.out.println("Processo deve ser REVISADO!.");
        } else {
            System.out.println("Processo está dentro do padrão.");
        }

        in.close();
    }
}
