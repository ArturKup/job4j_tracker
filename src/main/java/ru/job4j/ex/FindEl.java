package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("message");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] str = {"один", "два", "три", "четыре"};
        try {
            indexOf(str, "пять");
        } catch (ElementNotFoundException e) {
            System.out.println("Элемент в массиве не найден");
        }

    }
}