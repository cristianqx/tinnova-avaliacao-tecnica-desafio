package desafio.quarto.domain;

public class SomaMultiplos {

    private static final int NUMERO_0 = 0;
    private static final int NUMERO_3 = 3;
    private static final int NUMERO_5 = 5;
    public static int calcularSomaMultiplos(final int numeroLimite) {
        if (NUMERO_0 >= numeroLimite) {
            throw new IllegalArgumentException("O número limite deve ser maior que zero.");
        }

        int soma = NUMERO_0;

        for (int i = 1; i < numeroLimite; i++) {
            if (isMultiploDe3(i) || isMultiploDe5(i)) {
                soma += i;
            }
        }

        return soma;
    }

    public static boolean isMultiploDe3(int numero) {
        return numero % NUMERO_3 == NUMERO_0;
    }

    public static boolean isMultiploDe5(int numero) {
        return numero % NUMERO_5 == NUMERO_0;
    }
}
