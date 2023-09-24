package desafio.terceiro.domain;
public class CalculadoraFatorial {

    public static long calcularFatorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Número não pode ser negativo.");
        }

        long resultado = 1;

        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }

        return resultado;
    }

}
