package zjazd5.interfaces.lab15;

public class StereoSystem {
    public static void main(String[] args) {
    Song[] library = { new Song("Michael Jackson", "Beat It", "Thriller"),
            new Song("Pearl Jam", "Even Flow", "Ten"),
            new Song("Portishead", "Over", "NYC Live")};


        Player[] players = {new CD(library), new Mp3(library)};
        players[0].play();
        players[0].pause();
        players[0].play();
        players[0].stop();

        System.out.println();

        players[1].play();
        players[1].pause();
        players[1].next();
        players[1].play();
        players[1].previous();
        players[1].play();
        players[1].stop();

    }
}
