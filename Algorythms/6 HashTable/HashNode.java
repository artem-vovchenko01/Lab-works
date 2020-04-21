public class HashNode<K, V> {
    private HashNode<K, V> next;
    private K key;
    private V value;
    public HashNode (K key, V value) {
        this.setKey(key);
        this.setValue(value);
    }

    public void setNext (HashNode<K, V> hashNode) {
        this.next = hashNode;
    }

    public HashNode<K, V> getNext () {
        return next;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "(" + getKey() + " : " + getValue() + ")";
    }
}
