package pl.edu.wszib.jwd;

public class Kolokwium2new {

        //Napisz program posiadający metodę o nazwie showMatrix() wyświetlającą na ekranie dowolną dwuwymiarową
        // tablicę liczb całkowitych w postaci macierzy. Zaprezentuj działanie metody.
        //Przykład:
        //1   2   4
        //3   2   5
        //1   1   1
    public static void showMatrix () {
            int[][] matrix = new int[4][4];
            int licznik = 1;


            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = licznik++;
                }
            }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.printf("%3s", matrix[i][j]);
                }
                System.out.println();
            }
        }

    public static void main(String[] args) {
        showMatrix();

    }






}
