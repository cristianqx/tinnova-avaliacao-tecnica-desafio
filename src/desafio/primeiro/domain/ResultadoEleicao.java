package desafio.primeiro.domain;

public class ResultadoEleicao {

    private static final double PERCENTUAL_TOTAL = 100.0;
    private int totalEleitores;
    private int votosValidos;
    private int votosBrancos;
    private int votosNulos;

    public ResultadoEleicao(final int totalEleitores,
                            final int votosValidos,
                            final int votosBrancos,
                            final int votosNulos) {

        if (totalEleitores == 0) {
            throw new IllegalArgumentException("O total de eleitores deve ser maior que zero.");
        }

        this.totalEleitores = totalEleitores;
        this.votosValidos = votosValidos;
        this.votosBrancos = votosBrancos;
        this.votosNulos = votosNulos;
    }
    public double calcularPercentualVotosValidos() {
        return (votosValidos * PERCENTUAL_TOTAL) / totalEleitores;
    }

    public double calcularPercentualVotosBrancos() {
        return (votosBrancos * PERCENTUAL_TOTAL) / totalEleitores;
    }

    public double calcularPercentualVotosNulos() {
        return (votosNulos * PERCENTUAL_TOTAL) / totalEleitores;
    }
}
