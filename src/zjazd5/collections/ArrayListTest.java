package zjazd5.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(120);
        for (int i = 1; i <= 100 ; i++) {
            numbers.add(i);
        }

        for (Integer number: numbers) {
            System.out.print(number + " ");
        }

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer n = iterator.next();
            if (n % 3 == 0) {
                iterator.remove();
            }
        }
        System.out.println();
        for (Integer number: numbers) {
            System.out.print(number + " ");
        }


    }
}
