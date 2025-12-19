package handson;

public class Music {
    String titulo;
    String artista;
    int anoLancamento;
    double somaDasAvaliacoes;
    int numeroDeAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        numeroDeAvaliacoes++;
    }

    double getMedia() {
        return somaDasAvaliacoes / numeroDeAvaliacoes;
    }
}

