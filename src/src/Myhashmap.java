import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Myhashmap<K,V> implements Map<K,V> {

    private final Map<K, V> interMap = new HashMap<>();

    @Override
    public int size(){
        return interMap.size();
    }

    @Override
    public boolean isEmpty() {
        return interMap.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return interMap.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return interMap.containsValue(value);
    }

    @Override
    public V get(Object key) {
        return interMap.get(key);
    }

    @Override
    public V put(K key, V value) {
        return interMap.put(key, value);
    }

    @Override
    public V remove(Object key) {
        return interMap.remove(key);
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        interMap.putAll(m);
    }

    @Override
    public void clear() {
        interMap.clear();
    }

    @Override
    public Set<K> keySet() {
        return interMap.keySet();
    }

    @Override
    public Collection<V> values() {
        return interMap.values();
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return interMap.entrySet();
    }

    @Override
    public boolean equals(Object o) {
        return interMap.equals(o);
    }

    @Override
    public int hashCode() {
        return interMap.hashCode();
    }

}
