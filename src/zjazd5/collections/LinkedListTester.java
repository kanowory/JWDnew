package zjazd5.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTester {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(3);
        numbers.add(30);
        numbers.add(999);
        numbers.add(4);

        System.out.println(numbers);
        numbers.remove(2);
        System.out.println(numbers);
        numbers.add(0, 997);
        System.out.println(numbers);
    }
}
