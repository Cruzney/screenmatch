import br.com.alura.screenmatch.calcs.CalcTime;
import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Series;

public class MainMovie {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("O Poderoso Chefão");
        myMovie.setLounchYear(1970);
        myMovie.setDurationTime(180);
        myMovie.showTecnic();
        myMovie.avaliable(8);
        myMovie.avaliable(5);
        myMovie.avaliable(10);

        System.out.println("Duration in minuts:" + myMovie.getDurationTime());
        System.out.println("Soma de Avaliações: "+ myMovie.getSumAvaliables());
        System.out.println("Total de Avaliações: "+myMovie.getTotalAvaliables());
        System.out.println("Media Avaliações:" + myMovie.getMedia());

        Series lost = new Series();
        lost.setName("Lost");
        lost.setLounchYear(2015);
        lost.setSeasons(11);
        lost.setEpisodForSeasons(11);
        lost.setDurationTime(50);
        lost.setTimeForEpisods(45);

        lost.showTecnic();
        lost.avaliable(10);
        lost.avaliable(7);
        lost.avaliable(10);

        System.out.println("Duration for Marathon " + lost.getName() + " - " + lost.getDurationTime());
        System.out.println("Soma de Avaliações: "+ lost.getSumAvaliables());
        System.out.println("Total de Avaliações: "+lost.getTotalAvaliables());
        System.out.println("Média avaliações:" + lost.getMedia());

        Movie outerMovie = new Movie();
        outerMovie.setName("Avatar");
        outerMovie.setLounchYear(2023);
        outerMovie.setDurationTime(200);

        CalcTime calc = new CalcTime();
        calc.input(myMovie);
        calc.input(outerMovie);
        calc.input(lost);
        System.out.println(calc.getTotalTime());

    }
}