/**
 * My app
 *
 * @author Ananya Cleetus
 * @version 2014.12.07
 */

import java.util.Scanner;
import java.util.ArrayList;


public class TunesApp {

    private MusicPlayer player;
    private MusicOrganizer organizer;
    private Scanner scanner;

    public TunesApp() {
        player = new MusicPlayer();
        organizer = new MusicOrganizer();
        scanner = new Scanner(System.in);

    }


    public void mainMenu() {


        int choice = scanner.nextInt();

        System.out.println("Pick one of these options:");
        System.out.println("-------------------------\n");
        System.out.println("1:Choose song from library");
        System.out.println("2:Choose artist");
        System.out.println("3:Choose genre");
        System.out.println("4:Stop playing");
        System.out.println("5:Quit");

        boolean val = false;
        int i = 0;
        while (val == false) {
            i = input.nextInt();
            if (i <= 5 && i >= 1) {
                val = true;
            }

            else System.out.println("Please enter a valid option");
        }


        if (i == 1) {
            playMenu(organizer.getTracks());
        }

        if (i == 2) {
            artistMenu();
        }

        if (i == 3) {
            genreMenu();
        }

        if (i == 4) {
            player.stop();
            mainMenu();
        }
        if (x == 5) {
            player.stop();
            System.exit(0);
        }

        System.out.println();



    }

    public void playMenu(ArrayList<Track> songs) {

        System.out.println("Select the song you would like to play");

        for (int i = 0; i < songs.size(); i++) {
            System.out.println(i + ":" + songs.get(i).getSongTitle());
        }

        System.out.println(songs.size() + ":Main Menu");

        boolean val = false;
        int i = 0;

        while (val == false) {

            i = input.nextInt();
            if (i <= songs.size() && i >= 0) {
                val = true;
            } else System.out.println("Please enter a valid option");
        }

        if (i == songs.size()) {
            mainMenu();
        } else {
            player.startPlaying("audio/" + songs.get(i).getFileName());
            mainMenu();
        }

    }


    public void artistMenu() {
        ArrayList<String> artists = organizer.returnArtists();
        System.out.println("Select an artist");

        for (int i = 0; i < artists.size(); i++) {
            System.out.println(i + ":" + artists.get(i));
        }
        System.out.println(artists.size() + ":Go Back to Main Menu");

        boolean val = false;
        int i = 0;
        while (val == false) {

            i = input.nextInt();
            if (i <= artists.size() && i >= 0) {
                val = true;
            } else System.out.println("Please enter a valid option");
        }

        if (i == artists.size()) {
            mainMenu();
        } else {
            playMenu(organizer.getTracksByArtist(artists.get(i)));
        }
    }

    public void genreMenu() {
        ArrayList<String> genres = organizer.returnGenres();
        System.out.println("Select an genre");

        for (int i = 0; i < genres.size(); i++) {
            System.out.println(i + ":" + genres.get(i));
        }
        System.out.println(genres.size() + ":Go Back to Main Menu");

        boolean val = false;
        int i = 0;
        while (val == false) {

            i = input.nextInt();
            if (i <= genres.size() && i >= 0) {
                val = true;
            } else System.out.println("Please enter a valid option");
        }

        if (i == genres.size()) {
            mainMenu();
        } else {
            playMenu(organizer.getTracksbyGenre(genres.get(i)));
        }
    }


}