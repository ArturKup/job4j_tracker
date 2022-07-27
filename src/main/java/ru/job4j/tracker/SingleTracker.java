package ru.job4j.tracker;

public final class SingleTracker {

    private static SingleTracker singleTracker;
    private Tracker tracker = new Tracker();

    private SingleTracker() {

    }

    public static SingleTracker getSingleTracker() {
        if (singleTracker == null) {
            return new SingleTracker();
        }
        return singleTracker;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item findById(int id) {
        return null;
    }

    public Item[] findAll() {
        return tracker.findAll();
    }

    public Item[] findByName(String key) {
        return tracker.findByName(key);
    }

    public boolean replace(int id, Item item) {
        return tracker.replace(id, item);
    }

    public boolean delete(int id) {
        return tracker.delete(id);
    }
}