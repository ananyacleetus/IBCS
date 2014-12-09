import java.util.ArrayList;
/**
 * A class to hold details of audio files.
 *
 * @author Ananya Cleetus
 * @version 2014.12.07
 */
public class Track {
    private String filename;
    private String title;
    private String artist;
    private String genre;
    private String year;



    /**
         * Create a Track
         */
    public Track(String file) {
        try {
            AudioFile audioFile = AudioFileIO.read(new File(file)); //Reads the given file.
        }

        catch (CannotReadException e) {
            e.printStackTrace();
        }

        Tag mp3Tag = audioFile.getTag();

        filename = file;
        title = mp3Tag.getFirstTitle();
        artist = mp3Tag.getFirstArtist();
        genre = mp3Tag.getFirstGenre();
        year = mp3Tag.getFirstYear();
    }

    /**
         * Return filename
         * @param none
         */
    public String getName() {
        return filename;
    }


    /**
         * Return title
         * @param none
         */
    public String getTitle() {
        return title;
    }

    /**
         * Return artist
         * @param none
         */
    public String getArtist() {
        return artist;
    }

    /**
         * Return genre
         * @param none
         */
    public String getGenre() {
        return genre;
    }

    /**
         * Return year
         * @param none
         */
    public String getYear() {
        return year;
    }




}