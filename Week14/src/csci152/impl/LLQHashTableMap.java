/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci152.impl;

import csci152.adt.KeyValuePair;
import csci152.adt.Map;

/**
 *
 * @author Aivar Abrashuly
 * @param <K>
 * @param <V>
 */
public class LLQHashTableMap<K, V> implements Map<K, V> {

    private LinkedListQueue<KeyValuePair<K, V>>[] backets;
    private int size, all;
    
    public LLQHashTableMap(int k){
        backets = (LinkedListQueue<KeyValuePair<K, V>>[]) new LinkedListQueue[k];
        size = 0;
        all = k;
    }
    
    public int Index(K key){
        return key.hashCode();
    }
    
    @Override
    public void define(K key, V value) {
        int index = Math.abs(key.hashCode()) % all;
        
        V val = remove(key);
        
        
   
        size++;
        if(backets[index] == null) {
            backets[index] = new LinkedListQueue<KeyValuePair<K, V>>();
        }
        
        
            backets[index].enqueue(new KeyValuePair(key, value));
            
            
        
    }

    @Override
    public V getValue(K key) {
        int index = Math.abs(key.hashCode()) % all;
        
        if(backets[index] == null) return null;
        for(int i = 0; i < backets[index].getSize(); i++){
         KeyValuePair temp;
         try {
             
             
             temp = backets[index].dequeue();
             backets[index].enqueue(temp);
         if(temp.getKey().equals(key))return (V) temp.getValue();
       
         }   
         catch (Exception ex) {
             System.out.println(ex.getMessage());;
         }
     }
     return null;
    }

    @Override
    public V remove(K key) {
        int index = Math.abs(key.hashCode()) % all;
        
        if(getValue(key) == null) return null;
        
        else{
            size--;
            
            for(int i = 0; i < backets[index].getSize(); i++) {
                KeyValuePair temp;
                try {             
             temp = backets[index].dequeue();
         if(temp.getKey().equals(key)) {
             if(size == 0) backets[index] = null;
             return (V) temp.getValue();
         }
         backets[index].enqueue(temp);
         
         }   
         catch (Exception ex) {
             System.out.println(ex.getMessage());;
         }
                
     }
        }
        return null;
    }
    

    @Override
    public KeyValuePair<K, V> removeAny() throws Exception {
        KeyValuePair temp = null; 
    if(size == 0)throw new Exception("map is empty!");
    else{
        
        for(int i = 0; i < all; i++){
            if(backets[i]!= null){
                size--;
                if(backets[i].getSize()==0) backets[i] = null;
              temp = backets[i].dequeue();
              break;
            }
        }
    }
    return temp;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
        backets = new LinkedListQueue[all];
        size = 0;
    }
    
    public String toString() {
        String r = "";
          for(int i=0; i<all; i++){
              r+=  backets[i] + "\n";
            }
          r += "\nSize is: " + size;
        return r;
    }
    
    
    public int getNumberOfBuckets() {
        return all;
    }

    public int getBucketSize(int index) throws Exception {
        return backets[index].getSize();
    }

    public double getLoadFactor() {
        return size / all;
    }

    public double getBucketSizeStandardDev() {
         int mean , sum = 0;
        for (int i = 0; i < all; i++) {
            if(backets[i] != null)
            sum += backets[i].getSize();
        }
        mean = sum/all;
        
        int sumOfSquares = 0;
        
        for (int i = 0; i < all; i++) {
            int s = 0;
            if(backets[i]!=null) s = backets[i].getSize(); 
            sumOfSquares += Math.pow(s - mean , 2);
        }
        
        return Math.sqrt(sumOfSquares/backets.length);
    }

    public String bucketsToString() {
        return toString();
    }
}
