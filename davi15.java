import java.util.Scanner;

public class davi15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] codigos = new int[10];
        double[] saldos = new double[10];

        int codigo;
        double valor;
        int opcao;
        int posicao;

        // Cadastro das contas
        for (int i = 0; i < 10; i++) {

            boolean repetido;

            do {

                repetido = false;

                System.out.print("Código da conta: ");
                codigo = in.nextInt();

                for (int j = 0; j < i; j++) {
                    if (codigos[j] == codigo) {
                        repetido = true;
                        System.out.println("Código já cadastrado!");
                    }
                }

            } while (repetido);

            codigos[i] = codigo;

            System.out.print("Saldo inicial: ");
            saldos[i] = in.nextDouble();
        }

        do {

            System.out.println("\nMENU");
            System.out.println("1 - Efetuar depósito");
            System.out.println("2 - Efetuar saque");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - Finalizar");
            System.out.print("Opção: ");

            opcao = in.nextInt();

            switch (opcao) {

                case 1:

                    System.out.print("Código da conta: ");
                    codigo = in.nextInt();

                    posicao = -1;

                    for (int i = 0; i < 10; i++) {
                        if (codigos[i] == codigo) {
                            posicao = i;
                            break;
                        }
                    }

                    if (posicao == -1) {
                        System.out.println("Conta não encontrada!");
                    } else {

                        System.out.print("Valor do depósito: ");
                        valor = in.nextDouble();

                        saldos[posicao] += valor;

                        System.out.println("Depósito realizado!");
                    }

                    break;

                case 2:

                    System.out.print("Código da conta: ");
                    codigo = in.nextInt();

                    posicao = -1;

                    for (int i = 0; i < 10; i++) {
                        if (codigos[i] == codigo) {
                            posicao = i;
                            break;
                        }
                    }

                    if (posicao == -1) {

                        System.out.println("Conta não encontrada!");

                    } else {

                        System.out.print("Valor do saque: ");
                        valor = in.nextDouble();

                        if (saldos[posicao] >= valor) {

                            saldos[posicao] -= valor;

                            System.out.println("Saque realizado!");

                        } else {

                            System.out.println("Saldo insuficiente!");
                        }
                    }

                    break;

                case 3:

                    System.out.print("Código da conta: ");
                    codigo = in.nextInt();

                    posicao = -1;

                    for (int i = 0; i < 10; i++) {
                        if (codigos[i] == codigo) {
                            posicao = i;
                            break;
                        }
                    }

                    if (posicao == -1) {

                        System.out.println("Conta não encontrada!");

                    } else {

                        System.out.println("Conta: " + codigos[posicao]);
                        System.out.println("Saldo: R$ " + saldos[posicao]);
                    }

                    break;

                case 4:

                    System.out.println("Programa encerrado.");

                    break;

                default:

                    System.out.println("Opção inválida.");
            }

        } while (opcao != 4);

        in.close();
    }
}
