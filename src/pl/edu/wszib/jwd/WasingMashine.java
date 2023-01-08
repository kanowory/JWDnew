package pl.edu.wszib.jwd;

public class WasingMashine {
    private int temperature;
    private int spinning;

    public void modeForSesitiveClothes() {
        temperature = 30;
        spinning = 800;
    }

    public void modeForTowelsAndBedLinen () {
        temperature = 90;
        spinning = 1200;
    }

    @Override
    public String toString() {
        return "WasingMashine{" +
                "temperature=" + temperature +
                ", spinning=" + spinning +
                '}';
    }
}
