package zjazd10.lambdas;

import java.util.Arrays;
import java.util.Comparator;

public class PlanetsLambda {
    public static void main(String[] args) {
        String[] planets = {"Słońce", "Merkury", "Wenus", "Ziemia", "Mars", "Jowisz", "Staturn", "Uran", "Neptun"};
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));

        /*Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
        Arrays.sort(planets, comparator);
        System.out.println(Arrays.toString(planets));*/

        Arrays.sort(planets, (o1, o2) -> o1.length() - o2.length());
        Arrays.asList(planets).forEach(s -> System.out.println(s));

    }
}
