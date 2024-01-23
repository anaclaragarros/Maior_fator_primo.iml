public class MaiorFatorPrimo {

    public static void main(String[] args) {
        long numero = 600851475143L;
        long maiorFatorPrimo = encontrarMaiorFatorPrimo(numero);

        System.out.println("O maior fator primo de " + numero + " é: " + maiorFatorPrimo);
    }
    private static long encontrarMaiorFatorPrimo(long numero) {
        long maiorFator = 1;

        for (long fator = 2; fator <= numero; fator++) {
            while (numero % fator == 0 && numero > 1) {
                numero /= fator;
                maiorFator = fator;
            }
        }

        return maiorFator;
    }
}
