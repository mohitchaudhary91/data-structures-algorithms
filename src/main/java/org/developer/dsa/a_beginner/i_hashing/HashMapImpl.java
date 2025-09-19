package org.developer.dsa.a_beginner.i_hashing;

class Entry<K, V> {
    K key;
    V value;
    Entry<K, V> next;

    public Entry(K k, V v) {
        this.key = k;
        this.value = v;
    }
}

public class HashMapImpl<K, V> {

    private static final int INITIAL_CAPACITY = 1 << 4;
    private static final int MAXIMUM_CAPACITY = 1 << 30;

    private Entry[] table;

    public HashMapImpl() {
        this.table = new Entry[INITIAL_CAPACITY];
    }

    public HashMapImpl(int capacity) {
        int size = tableSizeFor(capacity);
        this.table = new Entry[size];
    }

    private int tableSizeFor(int capacity) {
        int n = capacity - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 8;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : (n + 1);
    }

    public void put(K key, V value) {
        int hashCode = key.hashCode() % table.length;
        Entry node = table[hashCode];

        if (node == null) {
            Entry newNode = new Entry(key, value);
            table[hashCode] = newNode;
        } else {
            Entry curr = node;
            while (curr != null) {
                if (curr.key == key) {
                    curr.value = value;
                    return;
                }
                curr = curr.next;
            }
            Entry newNode = new Entry(key, value);
            newNode.next = node.next;
            node.next = newNode;
        }
    }

    public V get(K key) {
        int hashCode = key.hashCode() % table.length;
        Entry node = table[hashCode];

        Entry curr = node;
        while (curr != null) {
            if (curr.key == key) {
                return (V) curr.value;
            }
            curr = curr.next;
        }
        return null;
    }

    public static void main(String[] args) {
        HashMapImpl<Integer, String> map = new HashMapImpl<>();
        map.put(1, "MOHIT");
        map.put(2, "ROHIT");
        map.put(3, "NISHA");
        map.put(4, "SHLOK");

        System.out.println(map.get(4));

        map.put(4, "YASHPAL");

        System.out.println(map.get(4));

    }

}
