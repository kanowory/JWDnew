package pl.edu.wszib.jwd;

public class PriceFormatter {
    String currency = "zł";
    String formatPrice (int value) {
        return String.format("%d,00 %s", value, currency);
    }

    String formatPrice (double value)  {
        return String.format("%.2f %s", value, currency);
    }

    String formatPrice (String value)  {
        return String.format("%.2f %s", Double.parseDouble(value), currency);
    }

    public static void main(String[] args) {
        PriceFormatter pf = new PriceFormatter();
        System.out.println(pf.formatPrice(100));
        System.out.println(pf.formatPrice(53.56));
        System.out.println(pf.formatPrice("550"));
    }
}
