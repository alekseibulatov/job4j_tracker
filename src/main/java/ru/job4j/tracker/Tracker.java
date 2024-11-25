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
        Item[] resultAll = new Item[items.length];
        int newSize = 0;
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
            if (item != null) {
                resultAll[newSize] = item;
                newSize++;
            }
        }
        return Arrays.copyOf(resultAll, newSize);
    }

    public Item[] findByName(String key) {
        Item[] resultFindByName = new Item[items.length];
        int n = 0;
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
            if (item != null && key.equals(item.getName())) {
                resultFindByName[n] = item;
                n++;
            }
        }
        return Arrays.copyOf(resultFindByName, n);
    }
}