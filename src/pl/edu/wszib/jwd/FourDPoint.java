package pl.edu.wszib.jwd;

import java.awt.*;

public class FourDPoint extends Point {
    public static void main(String[] args) {
        FourDPoint point1 = create(2,4,6,7);
        point1.show();
    }
        int z;
        int t;
        static FourDPoint create ( int x, int y, int z, int t){
            FourDPoint fourDPoint = new FourDPoint();
            fourDPoint.x = x;
            fourDPoint.y = y;
            fourDPoint.z = z;
            fourDPoint.t = t;
            return fourDPoint;
        }

        void show() {
            System.out.println("Współrzędne = [" + this.x + "][" + this.y + "][" + this.z + "][" + this.t + "]");
        }
    }
