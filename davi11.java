public class davi11 {
    public static void main(String[] args) {
        int limite = 200;

        int[] primosTrad = new int[10];
        int[] primosCrivo = new int[10];

        long inicioTrad, fimTrad;
        long inicioCrivo, fimCrivo;

        int contador;


        // 1. MÉTODO TRADICIONAL

        inicioTrad = System.nanoTime();

        int numero = 100;
        contador = 0;

        while (contador < 10) {

            boolean primo = true;

            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo && numero > 1) {
                primosTrad[contador] = numero;
                contador++;
            }

            numero++;
        }

        fimTrad = System.nanoTime();


        // 2. CRIVO DE ERATÓSTENES

        inicioCrivo = System.nanoTime();

        boolean[] primo = new boolean[limite + 1];

        for (int i = 2; i <= limite; i++) {
            primo[i] = true;
        }

        for (int i = 2; i * i <= limite; i++) {

            if (primo[i]) {
                for (int j = i * i; j <= limite; j += i) {
                    primo[j] = false;
                }
            }
        }

        contador = 0;

        for (int i = 100; i <= limite && contador < 10; i++) {
            if (primo[i]) {
                primosCrivo[contador] = i;
                contador++;
            }
        }

        fimCrivo = System.nanoTime();


        // 3. RESULTADOS


        System.out.println("=== MÉTODO TRADICIONAL ===");
        for (int i = 0; i < primosTrad.length; i++) {
            System.out.print(primosTrad[i] + " ");
        }

        System.out.println("\nTempo: " + (fimTrad - inicioTrad) + " ns");

        System.out.println("\n\n=== CRIVO DE ERATÓSTENES ===");
        for (int i = 0; i < primosCrivo.length; i++) {
            System.out.print(primosCrivo[i] + " ");
        }

        System.out.println("\nTempo: " + (fimCrivo - inicioCrivo) + " ns");

    }
}
