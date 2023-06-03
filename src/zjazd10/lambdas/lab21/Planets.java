package zjazd10.lambdas.lab21;

import java.util.Arrays;

public class Planets {
    public static void main(String[] args) {
        String[] planets = {"Słońce", "Merkury", "Wenus", "Ziemia", "Mars", "Jowisz", "Staturn", "Uran", "Neptun"};

        //System.out.println("mata".charAt("mata".length()-1) - "rower".charAt("rower".length()-1));

        Arrays.sort(planets, (o1, o2) -> o1.charAt(o1.length()-1) - o2.charAt(o2.length()-1));
        Arrays.asList(planets).forEach(s -> System.out.println(s));

    }
}
