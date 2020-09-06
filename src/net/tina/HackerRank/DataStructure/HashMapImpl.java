package net.tina.HackerRank.DataStructure;

import java.security.Key;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

public class HashMapImpl {

    ArrayList<KeyValue>[] data;
    int currentLength;

    public HashMapImpl(int size) {
        data = new ArrayList[size];
        currentLength = 0;
    }

    public int _hash(String key) {
        int hash = 0;
        for(int i = 0; i < key.length(); i++) {
            hash = (hash + key.codePointAt(i) * i) % data.length;
        }
        return hash;
    }

    public void set(String key, int value) {
        int address = _hash(key);
        if(data[address] == null) {
            ArrayList<KeyValue> arrayAtAddress = new ArrayList<>();
            data[address] = arrayAtAddress;
            currentLength++;
        }
        KeyValue pair = new KeyValue(key, value);
        data[address].add(pair);
    }

    public Integer get(String key) {
        int address = _hash(key);
        ArrayList<KeyValue> bucket = data[address];
        if(bucket != null) {
            for(KeyValue keyValue: bucket) {
                if(keyValue.getKey().equals(key)) {
                    return keyValue.getValue();
                }
            }
        }
        return null;
    }

    public String [] keys() {
        ArrayList<KeyValue>[] bucket = data;
        String[] keysArray = new String[currentLength];
        int count = 0;
        for(ArrayList<KeyValue> keyValues : bucket) {
            if(keyValues != null) {
                keysArray[count] = keyValues.get(0).getKey();
                count++;
            }
        }
        return keysArray;
    }

    public static void main(String [] args) {
        HashMapImpl hashtable = new HashMapImpl(50);
        hashtable.set("grapes", 10000);
        hashtable.set("apple", 12);
        hashtable.set("banana", 4);
        System.out.println(hashtable.get("grapes"));
        System.out.println("list of keys: " + Arrays.toString(hashtable.keys()));
    }
}
