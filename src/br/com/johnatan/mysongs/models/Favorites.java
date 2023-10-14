package br.com.johnatan.mysongs.models;

import java.util.ArrayList;
import java.util.List;

public class Favorites{
    public final List<Audio> favoriteAudios = new ArrayList<>();
    public void addFavorites(Song song) {
        if (!favoriteAudios.contains(song)) {
            favoriteAudios.add(song);
            System.out.println("Music add to favorites.");
        } else {
            System.out.println("The song is already in the favorites.");
        }
    }

    public void removeFavorites(Song song) {
        if (favoriteAudios.contains(song)) {
            favoriteAudios.remove(song);
            System.out.println("Music removed from favorites.");
        } else {
            System.out.println("Music isn't in favorites.");
        }
    }

    public List<Audio> getFavoriteSongs() {
        return favoriteAudios;
    }
}
