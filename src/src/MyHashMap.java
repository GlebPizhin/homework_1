

import java.util.Objects;


public  class MyHashMap<K, V>{

    // Класс для хранения пары ключ-значение
    static class Entry<K, V> {
        final K key;
        V value;
        Entry<K, V> next;

        Entry(K key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }


        public K getKey() {
            return key;
        }


        public V getValue() {
            return value;
        }


        public V setValue(V newValue) {
            V oldValue = value;
            value = newValue;
            return oldValue;
        }

        @Override
        public String toString() {
            return key + "=" + value;
        }

    }

    // Массив корзин (buckets)
    private Entry<K, V>[] table;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 16;
    // Можно добавить коэффициент загрузки (load factor) и логику изменения размера (resizing)

    public MyHashMap() {
        this.table = new Entry[DEFAULT_CAPACITY];
    }

    // Вспомогательный метод для получения индекса корзины
    private int getBucketIndex(Object key) {
        // Используем хеш-код ключа и операцию по модулю (или битовый AND для степени двойки)
        return (key == null) ? 0 : (key.hashCode() % table.length);
    }


    public V put(K key, V value) {
        int index = getBucketIndex(key);
        Entry<K, V> current = table[index];

        // Проверяем, есть ли уже такой ключ в списке
        while (current != null) {
            if (Objects.equals(current.key, key)) {
                V oldValue = current.value;
                current.value = value;
                return oldValue;
            }
            current = current.next;
        }
        // Если ключа нет, добавляем новый элемент в начало списка корзины
        Entry<K, V> newEntry = new Entry<>(key, value, table[index]);
        table[index] = newEntry;
        size++;
        // В реальной реализации здесь нужно проверить size и, возможно, увеличить размер table
        return null;
    }


    public V get(Object key) {
        int index = getBucketIndex(key);
        Entry<K, V> current = table[index];

        while (current != null) {
            if (Objects.equals(current.key, key)) {
                return current.value;
            }
            current = current.next;
        }

        return null;
    }

    public V remove(Object key) {
        int index = getBucketIndex(key);
        Entry<K, V> current = table[index];
        Entry<K, V> previous = null;

        while (current != null) {
            if (Objects.equals(current.key, key)) {
                if (previous == null) {
                    table[index] = current.next; // Удаляем голову списка
                } else {
                    previous.next = current.next; // Удаляем из середины/хвоста
                }
                size--;
                return current.value;
            }
            previous = current;
            current = current.next;
        }

        return null; // Ключ не найден
    }



}