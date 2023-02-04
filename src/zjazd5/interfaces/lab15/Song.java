package zjazd5.interfaces.lab15;

public class Song {
    //zaprojektuj hermetyczną klasę Song przechowującą takie informacje jak nazwa artysty, tytuł utworu, nazwa albumu,
    private String artistName;
    private String title;
    private String album;

    public Song(String artistName, String title, String album) {
        this.artistName = artistName;
        this.title = title;
        this.album = album;
    }

    @Override
    public String toString() {
        return "Song{" +
                "artistName='" + artistName + '\'' +
                ", title='" + title + '\'' +
                ", album='" + album + '\'' +
                '}';
    }
}
