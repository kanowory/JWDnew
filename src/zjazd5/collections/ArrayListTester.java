package zjazd5.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTester {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(123);
        numbers.add(4);

        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println(numbers.get(0));

        numbers.remove((Integer)1);
        System.out.println(numbers);

        numbers.clear();
        System.out.println(numbers);

        List<String> names = new ArrayList<>();
        names.add("Ania");
        names.add("Staszek");
        names.add("Kasia");
        names.add("Marta");

        System.out.println(names);

        for (int i = 0; i < names.size(); i++) {
            System.out.println(i + " - " + names.get(i));
        }

        names.remove("Staszek");
        System.out.println();
        for (int i = 0; i < names.size(); i++) {
            System.out.println(i + " - " + names.get(i));
        }
        System.out.println();

        List list = new ArrayList<>();
        list.add(1);
        list.add("siedem");
        list.add(new Object());
        System.out.println(list);
        System.out.println((int)list.get(0) + (String)list.get(1));
        System.out.println();

        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(2);
        numbers1.add(33);
        numbers1.add(20);
        numbers1.add(6);
        numbers1.add(123);
        numbers1.add(99);
        numbers1.add(200);

        for (int i = 0; i < numbers1.size(); i++) {
            System.out.println("Liczba: " + numbers1.get(i));
        }
        System.out.println();

        for (Integer number:numbers1) {
            System.out.println("Liczba: " + number);
        }
        System.out.println();

        Iterator<Integer> iterator = numbers1.iterator();
        while (iterator.hasNext()) {
            System.out.println("Liczba: " + iterator.next());
        }
        System.out.println();

        ListIterator<Integer> listIterator = numbers1.listIterator();
        while (listIterator.hasNext()) {
            System.out.println("Liczba: " + listIterator.next());
        }
        System.out.println();
        while (listIterator.hasPrevious()) {
            Integer index = listIterator.previousIndex();
            System.out.println(index + "  liczba: " + listIterator.previous());
        }

        System.out.println();
        System.out.println(numbers1);

        /*for (Integer n: numbers1) {
        if (n % 2 != 0) {
            numbers1.remove(n);
            }
        }*/

       /* for (int i = 0; i < numbers1.size(); i++) {
            if (numbers1.get(i) % 2 != 0) {
                numbers1.remove(i);
            }
        }
        System.out.println(numbers1);*///nie można usuwać elementów iterując po liście!

        Iterator<Integer> iterator1 = numbers1.iterator();
        while (iterator1.hasNext()) {
            Integer number = iterator1.next();
            if (number % 2 != 0 ) {
                iterator1.remove();
            }
        }
        System.out.println(numbers1);

    }
}
