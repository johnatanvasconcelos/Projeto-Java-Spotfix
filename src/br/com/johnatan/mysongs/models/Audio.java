package br.com.johnatan.mysongs.models;
public class Audio {
    private String title;
    private double duration;
    private int totalPlays;
//    private int likes;
//    private int classification;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public int getTotalPlays() {
        return totalPlays;
    }

//    public int getLikes() {
//        return likes;
//    }
//
//    public int getClassification() {
//        return classification;
//    }

    public void play() {
        System.out.println("You started this song: " + this.getTitle());
        this.totalPlays++;
    }

    public void pause() {
        System.out.println( getTitle() + " is paused");
    }

    public void stop() {
        System.out.println("You stopped the reproduction");
    }

}
