import java.util.ArrayList;
/**
 * A class to hold details of audio files.
 * 
 * @author Ananya Cleetus
 * @version 2014.12.07
 */
public class Track
{
	private String filename;
	private String title;
	private String artist;
	private String genre;
	private String year;



/**
     * Create a Track
     */
public Track(String file){

		filename = file;
		title ="";
		artist ="";
		genre = "";
		year = "";

}

/**
     * Return filename
     * @param none
     */
public String getName(){
	return filename;
}


/**
     * Return title
     * @param none
     */
public String getTitle(){
	return title;
}

/**
     * Return artist
     * @param none
     */
public String getArtist(){
	return artist;
}

/**
     * Return genre
     * @param none
     */
public String getGenre(){
	return genre;
}

/**
     * Return year
     * @param none
     */
public String getYear(){
	return year;
}




}