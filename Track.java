/**
 * Author Jonathan Falvey
 * ID 19239718
 */
public class Track implements Comparable<Track>{

    //self explanatory variables containing info of track
    private String title;
    private String artist;
    private int year;
    private int duration;

    /**
     * Simple getter method to return track title
     *
     * @return String with title of track
     */
    public String getTitle() {
        return title;
    }

    /**
     * simple setter method to set track title
     *
     * @param title new name of track will be entered here
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * simple getter method to return track artist
     *
     * @return String with artist of track
     */
    public String getArtist() {
        return artist;
    }

    /**
     * simple setter method to set artist of the track
     *
     * @param artist enter the new artist name here
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * simple getter method to return the yar track was released
     *
     * @return int with year track released
     */
    public int getYear() {
        return year;
    }

    /**
     * simple setter method to set the year the track was released
     *
     * @param year enter the new year number here
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * simple getter method to return the duration of the track in seconds
     *
     * @return int with duration in seconds
     */
    public int getDuration() {
        return duration;
    }

    /**
     * simple setter method to set the duration of the track in seconds
     *
     * @param duration enter the total duration of the track in seconds
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * first constructor for new tracks. user specifies the title and artist,
     * year and duration are initially set to 0
     *
     * @param title enter the title of the track here
     * @param artist enter the artist of the track here
     */
    public Track(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.year = 0;
        this.duration = 0;
    }

    /**
     * second constructor for new tracks.
     *
     * @param title enter title of track here
     * @param artist enter artist of track here
     * @param year enter year the track was released
     * @param duration enter the duration of the track in seconds
     */
    public Track(String title, String artist, int year, int duration) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.duration = duration;
    }

    /**
     * Simple method that takes the details of the track and displays them appropriately in a single line
     *
     * @return String with details of the track
     */
    public String toString() {
        return "Title: " + this.title + "    Artist: " + this.artist
         + "    Released: " + this.year + "    Duration: " + toMinutes();

    }

    /**
     * method from Comparable class. used to compare the titles of tracks.
     *
     * @param track enter the name of the track whose title you want to compare to
     * @return integer that can be used to compare the titles alphabetically
     */
    @Override
    public int compareTo(Track track) {
        return this.getTitle().compareTo(track.getTitle());
    }

    /**
     * helper method to convert the duration from seconds to minutes and seconds
     *
     * @return String representation of the track duration
     */
    public String toMinutes() {
        int minutes = this.duration / 60;
        int seconds = this.duration % 60;

        if (seconds >= 10) {
            return minutes + ":" + seconds; //display normally as 4:20, etc
        }

        return minutes + ":0" + seconds; //prevents 3 minutes and 7 seconds from being displayed as 3:7, etc
    }
}
