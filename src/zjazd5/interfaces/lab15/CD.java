package zjazd5.interfaces.lab15;

public class CD extends MusicPlayer {


    public CD(Song[] library) {
        super(library);
    }

    public void play() {
        System.out.println("cd odtwarzanie: " + getCurrentSong());
    }

    @Override
    public void pause() {
        System.out.println("cd pauza " + getCurrentSong());
    }

    public void stop () {
        System.out.println("cd stop");
    }

}
