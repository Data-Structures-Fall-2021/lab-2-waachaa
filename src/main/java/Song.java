public class Song {
    public static String collectionName;
	String artist, title;
    int duration;

    public Song(String artist, String title, int duration) {
        this.artist = artist;
        this.title = title;
        this.duration = duration;
    }

    public String getCollectionName() { return collectionName; }
    public String getArtist() { return artist; }
    public String getTitle() { return title; }
    public int getDuration() { return duration; }

    public void setCollectionName(String collectionName) { this.collectionName = collectionName; }
    public void setArtist(String artist) { this.artist = artist; }
    public void setTitle(String title) { this.title = title; }
    public void setDuration(int duration) { this.duration = duration; }

    public String toString() { return title + " (" + artist + ") - " + duration/60 + ":" + duration%60; }
}
