package br.com.johnatan.mysongs.models;

public class Song extends Audio{
    private String album;
    private String artist;
    private String genre;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void musicInfo() {
        String text = "Song title: " + this.getTitle() +
                " \nThis song is from the album " + getAlbum() + " by " + getArtist() +
                " \nThe genre is " + getGenre() +
                " \nThe total of playings is: " + this.getTotalPlays() +
                " \nThe duration of this song is: " + getDuration() + " minutes";
        System.out.println(text);
    }
    }
