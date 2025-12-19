package handson;

public class MainMusic {
    public static void main(String[] args) {

        Music music = new Music();
        music.titulo = "Imagine";
        music.artista = "John Lennon";
        music.anoLancamento = 1971;

        music.exibeFichaTecnica();

        music.avalia(4.5);
        music.avalia(5.0);
        music.avalia(4.0);

        double media = music.getMedia();
        System.out.println("Média das Avaliações: " + media);
        System.out.println("Soma das Avaliações: " + music.somaDasAvaliacoes);
        System.out.println("Número de Avaliações: " + music.numeroDeAvaliacoes);
    }
}
