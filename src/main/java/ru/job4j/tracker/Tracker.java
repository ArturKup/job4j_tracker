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
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
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
}