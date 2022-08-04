package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("parsentev@yandex.ru", "Petr Arsentev");
        map.put("parsentev@mail.ru", "Petr Arsentev");
        map.put("par@yandex.ru", "Petr Arsentev");
        map.put("parsentev@ya.ru", "Petr Arsentev");
        for (String str : map.keySet()) {
            String value = map.get(str);
            System.out.println(str + " = " + value);
        }

        System.out.println();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }
}
