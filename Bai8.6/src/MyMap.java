public class MyMap <K, V> {
    private K key;
    private V value;

    //Constructor
    public MyMap(K key, V value)
    {
        this.key = key;
        this.value = value;
    }

    //Method
    public K getKey()
    {
        return this.key;
    }

    public V getValue()
    {
        return this.value;
    }
}
