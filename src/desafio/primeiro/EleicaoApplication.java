package desafio.primeiro;

import desafio.primeiro.domain.ResultadoEleicao;

public class EleicaoApplication {

    public static void main(String[] args) {
        ResultadoEleicao resultadoEleicao = new ResultadoEleicao(1000, 800, 150, 50);
        System.out.println("Percentual de Votos Válidos: " + resultadoEleicao.calcularPercentualVotosValidos() + "%");
        System.out.println("Percentual de Votos em Branco: " + resultadoEleicao.calcularPercentualVotosBrancos() + "%");
        System.out.println("Percentual de Votos Nulos: " + resultadoEleicao.calcularPercentualVotosNulos() + "%");
    }
}