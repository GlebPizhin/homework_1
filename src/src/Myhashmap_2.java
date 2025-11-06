import java.util.*;

public class Myhashmap_2<K, V> implements Map<K, V> {


    private final List<AbstractMap.SimpleEntry<K, V>> entries = new ArrayList<>();


    @Override
    public int size() {
        return entries.size();
    }

    @Override
    public boolean isEmpty() {
        return entries.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        for (AbstractMap.SimpleEntry<K, V> entry : entries) {

            if (entry.getKey() == null ? key == null : entry.getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        for (AbstractMap.SimpleEntry<K, V> entry : entries) {

            if (entry.getValue() == null ? value == null : entry.getValue().equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public V get(Object key) {
        for (AbstractMap.SimpleEntry<K, V> entry : entries) {
            if (entry.getKey() == null ? key == null : entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public V put(K key, V value) {

        for (AbstractMap.SimpleEntry<K, V> entry : entries) {
            if (entry.getKey() == null ? key == null : entry.getKey().equals(key)) {
                V oldValue = entry.getValue();
                entry.setValue(value);
                return oldValue;
            }
        }


        entries.add(new AbstractMap.SimpleEntry<>(key, value));
        return null;
    }

    @Override
    public V remove(Object key) {
        for (AbstractMap.SimpleEntry<K, V> entry : entries) {
            if (entry.getKey() == null ? key == null : entry.getKey().equals(key)) {
                V oldValue = entry.getValue();
                entries.remove(entry);
                return oldValue;
            }
        }
        return null;
    }

    @Override
    public Set<K> keySet() {
        Set<K> keys = new HashSet<>();
        for (AbstractMap.SimpleEntry<K, V> entry : entries) {
            keys.add(entry.getKey());
        }
        return keys;
    }
    @Override
    public Collection<V> values() {
        List<V> values = new ArrayList<>();
        for (AbstractMap.SimpleEntry<K, V> entry : entries) {
            values.add(entry.getValue());
        }
        return values;
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {

        return new HashSet<>(entries);
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        for (Map.Entry<? extends K, ? extends V> entry : m.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override
    public void clear() {
        entries.clear();
    }


}
