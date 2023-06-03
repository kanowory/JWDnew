package zjazd10.collections.lab18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class MonteChristo {
    public static void main(String[] args) {
        MonteChristo mc = new MonteChristo();
        List<String> allLines = mc.loadTextFile("src/crsto10.txt");
        mc.showAllLines(allLines);

        System.out.println("Wczytywany plik zawiera: " + mc.countLines(allLines) + " linii.");

        mc.showEvery100Line(allLines);
        mc.showTheLongestVerse(allLines);

    }
     List<String> loadTextFile(String textFileName){
         try {
             return Files.readAllLines(Paths.get(textFileName));
         } catch (IOException e) {
             System.out.println("Coś poszło nie tak przy wczytywaniu pliku: " + e.getMessage());
         }
         return null;
     }

     public void showAllLines(List<String> allLines){
        for (String line : allLines) {
            System.out.println(line);
        }
     }

    public int countLines(List<String> allLines) {
        return allLines.size();
    }

    public void showEvery100Line(List<String> allLines) {
        System.out.println();

        for (int i = 0; i < allLines.size(); i++) {
            if (i % 100 == 0) {
                System.out.println(i + ": " + allLines.get(i));
            }
        }
    }

    void showTheLongestVerse(List<String> allLines){
            String longestLine = "";
            for(String line : allLines){
                if(line.length() > longestLine.length()){
                    longestLine = line;
                }
            }
            System.out.println("\nNajdłuższy wiersz w książce zawiera " +  longestLine.length() + " znaki/znaków - " + longestLine.toUpperCase());
        }
    }


