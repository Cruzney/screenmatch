package br.com.alura.screenmatch.calcs;

import br.com.alura.screenmatch.modelos.Title;

public class CalcTime {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

//    public void input(Movie m) {
//        totalTime += m.getDurationTime();
//    }
//
//    public void input(Series s) {
//        totalTime += s.getDurationTime();
//    }

    public void input(Title title) {
        this.totalTime += title.getDurationTime();
    }
}
