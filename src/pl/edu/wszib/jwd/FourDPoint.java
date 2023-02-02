package pl.edu.wszib.jwd;

import java.awt.*;

public class FourDPoint extends Point {

        int z;
        int t;
        static FourDPoint create ( int x, int y, int z, int t){
            FourDPoint fourDPoint = new FourDPoint();
            fourDPoint.x = x;//dziedziczone
            fourDPoint.y = y;//dziedziczone
            fourDPoint.z = z;
            fourDPoint.t = t;
            return fourDPoint;
        }

        void show() {
            System.out.println("Współrzędne = [" + this.x + "][" + this.y + "][" + this.z + "][" + this.t + "]");
        }
    public static void main(String[] args) {
        FourDPoint point1 = create(2,4,6,7);//metoda narzędziowa - statyczna
        point1.show();
    }
    }
