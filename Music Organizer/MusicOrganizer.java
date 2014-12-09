import java.util.ArrayList;
import java.io.File;
import entagged.audioformats.*;
import entagged.audioformats.exceptions.*;

/**
 * A class to hold details of audio files.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicOrganizer {
    // An ArrayList for storing the file names of music files.
    private ArrayList<Track> files;

    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer() {
        files = new ArrayList<Track>();
        File audioDir = new File("Audio");
        String[] filenames = audioDir.list();

        for (int i = 0; i < filenames.size(); i++) {
            files.add(filenames[i]);
        }
    }

    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addTrack(Track track) {
        files.add(track);
    }

    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberofTracks() {
        return files.size();
    }

    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listTrack(int index) {
        if (validIndex(index) == true) {
            Track track = files.get(index);
            System.out.println("Song Title: " + track.getTitle() + " Artist: " + track.getArtist() + " Genre: " + track.getGenre() + " Year: " + track.getYear() + ".");
        }
    }
    /**
         * Lists all files
         * @param none
         */
    public void listAllTracks() {
        for (int i = 0; i < files.size(); i++) {
            listTrack(i);
        }
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeTrack(int index) {
        if (validIndex(index) == true) {
            files.remove(index);
        }
    }

    /**
     * Checks if index is valid
     * @param index to be checked
     */
    public boolean validIndex(int index) {
        if (index >= 0 && index < files.size()) {
            return true;
        } else {
            return false;
        }
    }

    // /**
    //  * Returns list of tracks with that artist
    //  * @param artist to be searched for
    //  */
    // public ArrayList<Track> getTracksByArtist(String artist){
    //     artistSearch = new ArrayList<Track>;
    //      for (int i = 0; i < files.size(); i++) {
    //         if (file)
    // }


    public static void main(String [ ] args) {

        MusicOrganizer mus = new MusicOrganizer();
        System.out.println(mus.getNumberofTracks());
        mus.listTrack(0);
        mus.listTrack(1);
        mus.listAllTracks();


    }
}
