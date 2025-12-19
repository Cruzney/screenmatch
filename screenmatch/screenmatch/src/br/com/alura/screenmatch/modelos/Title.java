package br.com.alura.screenmatch.modelos;

public class Title {
    private String name;
    private int lounchYear;
    private boolean inPlane;
    private double sumAvaliables;
    private int totalAvaliables;
    private int durationTime;

    public double getSumAvaliables(){

        return sumAvaliables;
    }
    public int getTotalAvaliables(){

        return totalAvaliables;
    }

    public String getName() {
        return name;
    }

    public int getLounchYear() {
        return lounchYear;
    }

    public boolean isInPlane() {
        return inPlane;
    }

    public int getDurationTime() {
        return durationTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLounchYear(int lounchYear) {
        this.lounchYear = lounchYear;
    }

    public void setInPlane(boolean inPlane) {
        this.inPlane = inPlane;
    }

    public void setDurationTime(int durationTime) {
        this.durationTime = durationTime;
    }


    public void showTecnic(){
        System.out.println("br.com.alura.screenmatch.modelos.Movie name: " + name + " -  Year Lunch: " + lounchYear + " -  Time duration: " + durationTime);
    }

    public void avaliable(double note){
        sumAvaliables += note;
        totalAvaliables++;
    }

    public double getMedia(){
        return sumAvaliables / totalAvaliables;
    }
}
