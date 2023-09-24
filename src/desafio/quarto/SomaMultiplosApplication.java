package desafio.quarto;

import desafio.quarto.domain.SomaMultiplos;

public class SomaMultiplosApplication {

    public static void main(String[] args) {
        int numeroLimite = 10;
        int soma = SomaMultiplos.calcularSomaMultiplos(numeroLimite);
        System.out.println("A soma de todos os múltiplos de 3 ou 5 abaixo de " + numeroLimite + " é: " + soma);
    }
}
