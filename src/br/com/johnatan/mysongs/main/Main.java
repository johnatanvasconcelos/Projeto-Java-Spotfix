package br.com.johnatan.mysongs.main;

import br.com.johnatan.mysongs.models.Audio;
import br.com.johnatan.mysongs.models.Song;
import br.com.johnatan.mysongs.models.Favorites;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Song song1 = new Song();
        song1.setTitle("Do I Wanna Know");
        song1.setAlbum("AM");
        song1.setArtist("Arctic Monkeys");
        song1.setGenre("Indie Rock");
        song1.setDuration(4.24);

        Favorites listFav = new Favorites();

        List<Audio> favoriteSongs = listFav.getFavoriteSongs();

        boolean isRunning = true;

        while (isRunning){
            System.out.println("\n------Menu de opções------");
            System.out.println("1. Play");
            System.out.println("2.Pause");
            System.out.println("3.Stop");
            System.out.println("4. Add to favorites");
            System.out.println("5. Remove from favorites");
            System.out.println("6. Show list of favorites");
            System.out.println("7. Show the music info");
            System.out.println("8. Exit");

            System.out.println("Choose an option:");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    song1.play();
                    break;
                case 2:
                    song1.pause();
                    break;
                case 3:
                    song1.stop();
                    break;
                case 4:
                    listFav.addFavorites(song1);
                    break;
                case 5:
                    listFav.removeFavorites(song1);
                    break;
                case 6:
                    for (Audio audio : favoriteSongs) {
                        System.out.println("Favorite List: \n" + "- " + audio.getTitle());
                    }
                    break;
                case 7:
                    song1.musicInfo();
                    break;
                case 8:
                    System.out.println("See ya!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}