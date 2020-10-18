/**
 * Author Jonathan Falvey
 * ID 19239718
 */
public class PlaylistDriver {

    public static void main(String[] args) {

        System.out.println("---TEST TRACK CLASS METHODS---");

        System.out.println();
        System.out.println("CREATE NEW TRACK USING CONSTRUCTOR ONE AND TEST toString() METHOD");
        Track blinding = new Track("Blinding Lights", "The Weeknd");
        System.out.println(blinding.toString());

        System.out.println();
        System.out.println("SET YEAR FOR BLINDING LIGHTS USING setYear() METHOD");
        blinding.setYear(2019);
        System.out.println(blinding.toString());

        System.out.println();
        System.out.println("SET DURATION FOR BLINDING LIGHTS USING setDuration() METHOD");
        blinding.setDuration(200);
        System.out.println(blinding.toString());

        System.out.println();
        System.out.println("CREATE NEW TRACK USING CONSTRUCTOR TWO");
        Track run = new Track("Run", "Joji", 2019, 193);
        System.out.println(run.toString());

        System.out.println();
        System.out.println();
        System.out.println("---TEST PLAYLIST METHODS---");

        System.out.println();
        System.out.println("CREATE NEW EMPTY PLAYLIST USING CONSTRUCTOR AND CALL IT 'My Playlist'");
        Playlist alpha = new Playlist();
        alpha.setName("My Playlist");
        System.out.println("New Playlist Name: " + alpha.getName());
        System.out.println();

        System.out.println("TEST showList METHOD");
        System.out.print("Result of showList(): ");
        alpha.showList();

        System.out.println();
        System.out.println("TEST add(Track) METHOD AND CONFIRM ITS PRESENCE WITH showList()");
        alpha.add(run);
        alpha.showList();

        System.out.println();
        System.out.println("ADD NEW TRACK 'One More Time' by Daft Punk USING add(title, artist) METHOD");
        alpha.add("One More Time", "Daft Punk");
        alpha.showList();

        System.out.println();
        System.out.println("ADD NEW TRACK 'Free Bird' by Lynyrd Skynyrd USING add(title, artist, year, duration) METHOD");
        alpha.add("Free Bird", "Lynyrd Skynyrd", 1973, 543);
        alpha.showList();

        System.out.println();
        System.out.println("ADD ANOTHER INSTANCE OF 'Run'. REMOVE THE FIRST INSTANCE OF 'Run' USING remove() METHOD. ALSO DEMONSTRATE CASE INSENSITIVITY");
        alpha.add(run);
        System.out.println("Remove Successful: " + alpha.remove("RuN"));
        alpha.showList();

        System.out.println();
        System.out.println("CREATE ANOTHER PLAYLIST, NAME IT 'Playlist 2', AND ADD THE SAME SONGS AS 'My Playlist'");
        Playlist beta = new Playlist(" My Playlist 2");
        System.out.println("New Playlist Name: " + beta.getName());
        beta.add("One More Time", "Daft Punk");
        beta.add("Free Bird", "Lynyrd Skynyrd", 1973, 543);
        beta.add(run);
        beta.showList();

        System.out.println();
        System.out.println("ADD NEW TRACKS AND TEST THE PLAY METHODS");
        beta.add("SLOW DANCING IN THE DARK", "Joji", 2018, 210);
        beta.add("I'LL SEE YOU IN 40", "Joji", 2018, 254);
        beta.add("God's Plan", "Drake", 2018, 200);
        beta.add("The Wolf", "SIAMES", 2016, 186);
        beta.add(blinding);
        beta.showList();

        System.out.println();
        System.out.println("TEST playAll() WITH random = false");
        beta.playAll(false);

        System.out.println();
        System.out.println("TEST playAll() WITH random = true");
        beta.playAll(true);

        System.out.println();
        System.out.println("TEST playOnly(artist) USING JOJI AS ARTIST");
        beta.playOnly("JOJi");

        System.out.println();
        System.out.println("TEST playOnly(year) USING 2018 AS YEAR");
        beta.playOnly(2018);

        System.out.println();
        System.out.println("TEST PLAYLIST toString() METHOD");
        System.out.println(beta.toString());
    }
}
