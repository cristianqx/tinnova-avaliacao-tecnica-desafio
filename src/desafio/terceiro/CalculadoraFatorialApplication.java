package desafio.terceiro;

import desafio.terceiro.domain.CalculadoraFatorial;

public class CalculadoraFatorialApplication {

    public static void main(String[] args) {
        int numero = 0;
        long resultado = CalculadoraFatorial.calcularFatorial(numero);
        System.out.println(numero + "!" + " = " + resultado);
    }
}
