/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Queue;
import adt.Set;

/**
 *
 * @author Dasten
 */
public class LLQueueSet<T> implements Set<T> {

    private LinkedListQueue<T> que;

    public LLQueueSet() {
        this.que = new LinkedListQueue<>();
    }

    @Override
    public void add(T value) {
        if(!contains(value)){
            que.enqueue(value);
        }
    }

    @Override
    public boolean contains(T value) {
        //launching a search for the T
        for(int i = 0; i < que.getSize(); i++){
            
            try {
                T check = que.dequeue();
                que.enqueue(check);
                
                if(check.equals(value))
                    return true;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return false;
    
    }

    @Override
    public boolean remove(T value) {
        if(contains(value)){
            Queue<T> copy = new LinkedListQueue();
            T current = null;
            try {
                current = que.dequeue();
            } catch (Exception e) {
                System.out.println(e);
            }
            
            while(!value.equals(current)){
                copy.enqueue(current);
                try {
                   current = que.dequeue();
                } catch (Exception e) {
                    System.out.println(e);
                }  
            };
            
            int size = copy.getSize();
            for(int i=0; i<size; i++ ){
                try {
                    que.enqueue(copy.dequeue());
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            return true;
        } 
        else return false;
    }

    @Override
    public T removeAny() throws Exception {
        if(que.getSize() == 0) throw new Exception("Still empty");
        T result = que.dequeue();        
        return result;
    }

    @Override
    public int getSize() {
        return que.getSize();
    }

    @Override
    public void clear() {
        que.clear();
    }
    
    @Override
    public String toString(){
        System.out.print(que + " ");
        return que.toString();
    }
}
