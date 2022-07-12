package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {

    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        Item[] it = new Item[size];
        int s = 0;
        for (int i = 0; i < size; i++) {
            Item name = items[i];
            if (name.getName() != null) {
                it[s] = name;
                s++;
            }
        }
        return Arrays.copyOf(it, s);
    }

    public Item[] findByName(String key) {
        int s = 0;
        Item[] it = new Item[size];
        for (int i = 0; i < size; i++) {
            Item name = items[i];
            if (key.equals(name.getName())) {
                it[s] = items[i];
                s++;
            }
        }
        return Arrays.copyOf(it, s);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean result = false;
        if (index != -1) {
            items[index] = item;
            item.setId(id);
            result = true;
        }
        return result;
    }
}