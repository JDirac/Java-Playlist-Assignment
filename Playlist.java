import java.util.Collections;
import java.util.LinkedList;

/**
 * Author Jonathan Falvey
 * ID 19239718
 */
public class Playlist {

    private String name; //name of the playlist
    private LinkedList<Track> tracks; // list of tracks contained in the playlist

    /**
     * constructor for new playlists. initialises the tracks list and sets the name
     * of the playlist to "Playlist" by default
     */
    public Playlist() {
        this.tracks = new LinkedList<>();

        this.name = "Playlist";
    }

    /**
     * This method returns a string containing all the tracks in the playlist in the order they were added
     *
     * @return String containing the details of every track in the playlist
     */
    public String toString() {
        String temp = "";

        for(Track track : tracks) {
            temp = temp + track.toString() + System.lineSeparator();
        }

        return temp;
    }

    /**
     * simple getter method that returns the name of the playlist
     *
     * @return String with name of the playlist
     */
    public String getName() { return name; }

    /**
     * simple setter method that changes the name of the playlist
     *
     * @param name new name of the playlist
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * first add method. adds a new track to the playlist with
     * the title and artist specified by the user
     *
     * @param title title of the track
     * @param artist name of the artist of the track
     */
    public void add(String title, String artist) {
        tracks.addLast(new Track(title, artist));
    }

    /**
     * second add method. adds a new track to the playlist with the title,
     * artist, year and duration in seconds specified by the user
     *
     * @param title name of the track
     * @param artist name of the artist of the track
     * @param year year the track was released
     * @param duration duration of the track in seconds
     */
    public void add(String title, String artist, int year, int duration) {
        tracks.addLast(new Track(title, artist, year, duration));
    }

    /**
     * third add method. adds an already existing track to the playlist
     * @param track Track already created elsewhere
     */
    public void add(Track track) {
        tracks.addLast(track);
    }

    /**
     * this method will remove the first instance of a track with the title specified by the user.
     * it first ensures the playlist is not empty before continuing. it then searches through the list
     * for a track with the desired title, and removes it if found. the search is case insensitive
     *
     * @param title the title of the specific track to be removed
     * @return boolean that indicates if the remove was successful. tue if yes, false if no
     */
    public boolean remove(String title) {
        if(tracks.size() > 0) { // check if the playlist is not empty

            for(Track track : tracks) {
                if(title.equalsIgnoreCase(track.getTitle())) { //case insensitive comparison of the titles of tracks
                    tracks.remove(track);
                    return true; //return true if successful
                }
            }
        }
        return false; //return false if playlist is empty or no track was removed
    }

    /**
     * This method will print the names and artists of each track in the playlist, but only if the playlist is not empty
     */
    public void showList() {
        if (tracks.size() > 0) {
            for(Track track : tracks) {
                System.out.println(track.getTitle() + " - " + track.getArtist());
            }
        } else {
            System.out.println("The list is empty."); //print this if the playlist is empty
        }
    }

    /**
     * This method will "play" all of the tracks in the playlist.
     * (It wil display the details of every track)
     *
     * @param random if true, it will shuffle the playlist and then play all the tracks
     *               if false, it will play all the tracks in their current order
     */
    public void playAll(boolean random) {
        if(random) { // create a copy of the list of tracks and shuffle it. then play all the tracks
            LinkedList<Track> shuffleTracks = (LinkedList) tracks.clone(); //our copy to be shuffled
            Collections.shuffle(shuffleTracks);

            for(Track track : shuffleTracks) { //play all the now shuffled tracks
                System.out.println(track.toString());
            }
        } else { // play all tracks in the list in the order they were added
            for(Track track : tracks) {
                System.out.println(track.toString());
            }
        }
    }

    /**
     * This method will play all tracks in the playlist by a specific artist
     * the name entered can be case insensitive
     *
     * @param artist name of the artist
     */
    public void playOnly(String artist) {
        for(Track track : tracks) {
           if(artist.equalsIgnoreCase(track.getArtist())) { //case insensitive comparison
               System.out.println(track.toString());
           }
        }
    }

    /**
     * this method will play all the tracks in the playlist that were released
     * in a certain year
     *
     * @param year the year the tracks were released
     */
    public void playOnly(int year) {
        for (Track track : tracks) {
            if (year == track.getYear()) {
                System.out.println(track.toString());
            }
        }
    }

    /**
     * Alternate constructor that allows the user to immediately specify the name of the playlist
     *
     * @param name
     */
    public Playlist(String name) {
        this.tracks = new LinkedList<>();

        this.name = name;
    }

}
