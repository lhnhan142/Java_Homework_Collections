public class Phone<K, V> extends MyMap<K, V>{
    //Constructor
    //Note: key là email hoặc là số thứ tự hoặc là tên người sử dụng Với value là số điện thoại
    public Phone(K key, V value) {
        super(key, value);
    }

    //Method
    public V getPhoneNumber()
    {
        return getValue();
    }
}
