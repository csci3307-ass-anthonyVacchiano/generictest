package generic_test;

import generic_test.Mygeninterface;

public class Mygenclass<K,V> implements Mygeninterface<K,V>{
private K key;
private V value;

public Mygenclass(K _key,V _value){
	key = _key;
	value = _value;
}
public K getkey(){
	return key;
}

public V getvalue(){
	return value;
}
}
