/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci152.impl;

import csci152.adt.HashTableMap;
import csci152.adt.KeyValuePair;
import csci152.adt.Map;

/**
 *
 * @author Aivar Abrashuly
 * @param <K>
 * @param <V>
 */
public class BSTHashTableMap<K extends Comparable, V> implements Map<K, V>{

    private Map<K, V>[] buckets;
    private int size;
    
    public BSTHashTableMap(int numBuckets) {
        buckets = new BSTMap[numBuckets];
        size = 0;
    }
    
    public int Index(K key) {
        return key.hashCode();
    }
    
    public void define(K key, V value) {
        int index = Math.abs(key.hashCode()) % buckets.length;
        
        if(buckets[index]==null) buckets[index] = new BSTMap<K, V>();
        
        size++;
        buckets[index].define(key, value);
        
    }

    public V getValue(K key) {
        int index = Math.abs(key.hashCode()) % buckets.length;
        
        if(buckets[index] == null) return null;
        
        return buckets[index].getValue(key);
    }

    public V remove(K key) {
        int index = Math.abs(key.hashCode()) % buckets.length;
        
        if(getValue(key) == null) return null;
        
        size--;
        return buckets[index].remove(key);
        
    }

    @Override
    public KeyValuePair removeAny() throws Exception {
        if (size == 0) throw new Exception("set is empty!");
        
        KeyValuePair result = null;
        
        for(int i = 0; i < buckets.length; i++) {
            if(buckets[i].getSize() > 0) {
                result = buckets[i].removeAny();
                size--;
                break;
            }
        }
        
        
        return result;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
        buckets = new BSTMap[buckets.length];
        size = 0;
    }

    public int getNumberOfBuckets() {
        return buckets.length;
    }

    public int getBucketSize(int index) throws Exception {
        return buckets[index].getSize();
    }

    public double getLoadFactor() {
        return size / buckets.length;
    }

    public double getBucketSizeStandardDev() {
        int mean , sum = 0;
        for (int i = 0; i < buckets.length; i++) {
            if(buckets[i] != null)
            sum += buckets[i].getSize();
        }
        mean = sum/buckets.length;
        
        int sumOfSquares = 0;
        
        for (int i = 0; i < buckets.length; i++) {
            int s = 0;
            if(buckets[i]!=null) s = buckets[i].getSize(); 
            sumOfSquares += Math.pow(s - mean , 2);
        }
        
        return Math.sqrt(sumOfSquares/buckets.length);
    }

    public String bucketsToString() {
        return toString();
    }  
    
   public String toString() {
        String r = "";
          for(int i=0; i<buckets.length; i++){
              r+=  buckets[i] + "\n";
            }
          r += "\nSize is: " + size;
        return r;
    }
}
