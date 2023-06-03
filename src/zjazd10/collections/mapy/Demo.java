package zjazd10.collections.mapy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {

        Map<String, String> phones = new HashMap<>();
        phones.put("Tomek", "123-456-789");
        phones.put("Alicja", "343-565-787");
        phones.put("Tomek", "555-666-777");
        phones.put("Barbara", "555-666-777");

        //System.out.println(phones);

        Set<String> keys = phones.keySet();
        System.out.println(keys);

        System.out.println(phones.containsKey("Alicja"));
        System.out.println(phones.get("Alicja"));
        System.out.println(phones.get("Karol"));//null

        System.out.println("--------------");

        for (String key: phones.keySet()) {
            System.out.println(key + " -> " + phones.get(key));
        }

        System.out.println();

        for (String value: phones.values()) {
            System.out.println(value);
        }

        System.out.println();

        for (Map.Entry entry : phones.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
            entry.setValue("0");
        }

        System.out.println();
        System.out.println(phones);
    }
}
