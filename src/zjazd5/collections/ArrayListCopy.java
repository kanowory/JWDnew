package zjazd5.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCopy {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(343);
        numbers.add(7);

        Integer[] array = new Integer[numbers.size()];
        array = numbers.toArray(array);

        for (Integer i: array) {
            System.out.println(i);
        }

        List<Integer> list = new ArrayList<>();
        list.addAll(numbers);
        list.addAll(numbers);
        list.addAll(numbers);
        System.out.println(list);

        System.out.println(list.lastIndexOf(343));
        list.set(7, 999);
        System.out.println(list);



    }
}
