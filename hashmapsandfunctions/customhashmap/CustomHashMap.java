package hashmapsandfunctions.customhashmap;

import java.util.LinkedList;

class CustomHashMap<K, V> {
    private static final int DEFAULT_CAPACITY = 16;  // Default size of hash table
    private static final double LOAD_FACTOR = 0.75;  // When to resize
    private LinkedList<Entry<K, V>>[] buckets;
    private int size;  // Number of key-value pairs

    // Entry class to store key-value pairs
    private static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    // Constructor
    public CustomHashMap() {
        buckets = new LinkedList[DEFAULT_CAPACITY];
        size = 0;
    }

    // Hash function to determine bucket index
    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode() % buckets.length);
    }

    // Insert or update a key-value pair
    public void put(K key, V value) {
        int index = getBucketIndex(key);
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }

        // Check if key already exists, update value if found
        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }

        // If key is new, add it
        buckets[index].add(new Entry<>(key, value));
        size++;

        // Resize if load factor is exceeded
        if ((double) size / buckets.length > LOAD_FACTOR) {
            resize();
        }
    }

    // Retrieve value for a given key
    public V get(K key) {
        int index = getBucketIndex(key);
        if (buckets[index] != null) {
            for (Entry<K, V> entry : buckets[index]) {
                if (entry.key.equals(key)) {
                    return entry.value;
                }
            }
        }
        return null;  // Key not found
    }

    // Remove a key-value pair
    public void remove(K key) {
        int index = getBucketIndex(key);
        if (buckets[index] != null) {
            for (Entry<K, V> entry : buckets[index]) {
                if (entry.key.equals(key)) {
                    buckets[index].remove(entry);
                    size--;
                    return;
                }
            }
        }
    }

    // Resize the hash table when load factor is exceeded
    private void resize() {
        LinkedList<Entry<K, V>>[] oldBuckets = buckets;
        buckets = new LinkedList[oldBuckets.length * 2];
        size = 0;  // Reset size and reinsert all entries

        for (LinkedList<Entry<K, V>> bucket : oldBuckets) {
            if (bucket != null) {
                for (Entry<K, V> entry : bucket) {
                    put(entry.key, entry.value);
                }
            }
        }
    }

    // Display the HashMap
    public void printMap() {
        for (int i = 0; i < buckets.length; i++) {
            System.out.print("Bucket " + i + ": ");
            if (buckets[i] != null) {
                for (Entry<K, V> entry : buckets[i]) {
                    System.out.print("[" + entry.key + " -> " + entry.value + "] ");
                }
            }
            System.out.println();
        }
    }

    // Get the current size of the HashMap
    public int size() {
        return size;
    }
}



