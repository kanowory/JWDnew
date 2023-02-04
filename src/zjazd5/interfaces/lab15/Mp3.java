package zjazd5.interfaces.lab15;

public class Mp3 extends MusicPlayer{

    public Mp3(Song[] library) {
        super(library);
    }

    public void play() {
        System.out.println("mp3 odtwarzanie: " + getCurrentSong());
    }

    @Override
    public void pause() {
        System.out.println("mp3 pauza " + getCurrentSong());
    }

    public void stop () {
        System.out.println("mp3 stop");
    }

}
