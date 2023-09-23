package desafio.primeiro.domain;

public class ResultadoEleicao {
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
        return (votosValidos * 100.0) / totalEleitores;
    }

    public double calcularPercentualVotosBrancos() {
        return (votosBrancos * 100.0) / totalEleitores;
    }

    public double calcularPercentualVotosNulos() {
        return (votosNulos * 100.0) / totalEleitores;
    }
}
