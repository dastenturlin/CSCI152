package impl;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author dasten
 */

import adt.Map;
import adt.KeyValuePair;
import impl.LinkedListQueue;
/**
 *
 * @author dasten
 * @param <K>
 * @param <V>
 */
public class LLQueueMap<K, V> implements Map <K,V> {

    /**
     * @param args the command line arguments
     */
    private LinkedListQueue <KeyValuePair <K,V>> pairs;
    private int size;
    
    public LLQueueMap() {
        pairs = new LinkedListQueue();
        size = 0;
        
    }

    @Override
    public void define(K key, V value) {
       if(!contains(key))
       {
           KeyValuePair <K, V> a = new KeyValuePair(key, value);
           pairs.enqueue(a);
           size++;
       }
       else 
       {
           remove(key);
           KeyValuePair <K, V> a = new KeyValuePair(key, value);
           pairs.enqueue(a);
       }
        
    }

    @Override
     public boolean contains(K key) {
         for(int i=0; i<size; i++)
         {
             try {
                KeyValuePair<K, V> check = pairs.dequeue();
                pairs.enqueue(check);
                K a = (K) check.getKey();
                if(a.equals(key))
                    return true;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return false; 
    }
        
    @Override
    public V getValue(K key) {
         for(int i=0; i<pairs.getSize(); i++)
         {
             try {
                KeyValuePair<K, V> check = pairs.dequeue();
                pairs.enqueue(check);
                
                if(check.getKey() == key)
                    return check.getValue();
                } catch (Exception e) {
                System.out.println(e);
            }
        }   
        return null;
    }

    @Override
    public V remove(K key) {
         for(int i=0; i<pairs.getSize(); i++)
         {
             try {
                KeyValuePair<K, V> check = pairs.dequeue();
                K a = (K) check.getKey();
                if(a.equals(key))  {
                    size--;
                    return (V) check.getValue();
                }
                else pairs.enqueue(check);
                
                } catch (Exception e) {
                System.out.println(e);
            }
        } 
        return null;
    }
    

    //1 line
    @Override
    public KeyValuePair<K, V> removeAny() {
        
        try {
            KeyValuePair<K, V> deq = pairs.dequeue();
            size--;
            return deq;
        }
        catch (Exception e) {
        System.out.println(e);   
        }
        
            
        return null;
    }
    

    //1 line
    @Override
    public int getSize() {
        return size;
    }
    

    // 1 line
    @Override
    public void clear() {
        pairs.clear();
        size=0;
    }

    
    @Override
    public String toString(){
        return pairs.toString();
    }
    

   
}
    

