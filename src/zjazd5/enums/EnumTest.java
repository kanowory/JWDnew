package zjazd5.enums;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println(Types.ONE);
        System.out.println(Types.valueOf("THREE"));
        System.out.println(Types.TWO.name());

        System.out.println();

        for (Types type: Types.values()) {
            System.out.println(type.ordinal() + " - " + type);
        }
    }
}
