package br.com.alura.screenmatch.modelos;

public class Series extends Title {
    private int seasons;
    private boolean activated;
    private int episodForSeasons;
    private int timeForEpisods;

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public int getEpisodForSeasons() {
        return episodForSeasons;
    }

    public void setEpisodForSeasons(int episodForSeasons) {
        this.episodForSeasons = episodForSeasons;
    }

    public int getTimeForEpisods() {
        return timeForEpisods;
    }

    public void setTimeForEpisods(int timeForEpisods) {
        this.timeForEpisods = timeForEpisods;
    }

    @Override
    public int getDurationTime() {
        return seasons * episodForSeasons * timeForEpisods;
    }
}
