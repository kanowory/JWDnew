package pl.edu.wszib.jwd;

public class WashingMashineTester {
    public static void main(String[] args) {
        WasingMashine wasingMashine = new WasingMashine();
        wasingMashine.modeForSesitiveClothes();
        System.out.println(wasingMashine);

        System.out.println();

        wasingMashine.modeForTowelsAndBedLinen();
        System.out.println(wasingMashine);




    }
}