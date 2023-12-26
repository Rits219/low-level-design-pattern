package HashMap;

public class MyHashMap<K, V> {

    public static final int MIN_CAPACITY = 1 << 4;
    public static final int MAX_CAPACITY = 1 << 30;
    public Entry[] entry;

    public MyHashMap() {
        entry = new Entry[MIN_CAPACITY];
    }

    public MyHashMap(int capacity) {
        int sizeInBytes = getSizeInBytes(capacity);
        entry = new Entry[sizeInBytes];
    }

    public class Entry<K, V> {
        K key;
        V value;
        public Entry nextPointer;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public int getSizeInBytes(int size) {
        size = size - 1;
        size = size | size >>> 1;
        size = size | size >>> 2;
        size = size | size >>> 4;
        size = size | size >>> 8;
        size = size | size >>> 16;

        return (size < 0) ? 1 : (size > MAX_CAPACITY) ? MAX_CAPACITY : size + 1;
    }

    public void put(K key, V value) {
        int index = key.hashCode() % entry.length;
        Entry node = entry[index];
        Entry prevNode = null;
        if (node == null) {
            entry[index] = new Entry(key, value);
        } else {
            while (node != null) {
                if (node.value == value) {
                    return;
                }
                prevNode = node;
                node = node.nextPointer;
            }
            prevNode.nextPointer = new Entry(key, value);
        }

    }

    public V get(K key) {
        int index = key.hashCode() % entry.length;
        Entry node = entry[index];
        while (node != null) {
            if (node.key == key) {
                return (V) node.value;
            }
            node = node.nextPointer;
        }
        return null;
    }


}
