public class Staff<K, V> extends MyMap<K, V>{
    //Constructor
    //Note: key là id của Staff (ID có thể là int, long), value là tên của Staff
    public Staff(K key, V value) {
        super(key, value);
    }

    //Method
    public K getId()
    {
        return getKey();
    }

    public V getName()
    {
        return getValue();
    }
}
