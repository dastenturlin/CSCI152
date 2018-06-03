
package pkg11;

import pkg11.adt.Queue;

/**
 *
 * @author Dasten
 * @param <T>
 */
public class LinkedListQueue<T> implements Queue<T> {
    private Node<T> front, back;
    private int size;
    
    public LinkedListQueue(){
        front = null;
        back = null;
        size = 0;
    }
    @Override
    public void enqueue(T value) {
        Node<T> newNode = new Node(value); 
        
        if(size == 0) {
            front = newNode;
            back = front;
        } else {
            back.setLink(newNode);
            back = newNode;            
        }
        size++;
    }

    @Override
    public T dequeue() throws Exception {
        if(size == 0) throw new Exception("Still empty");
        T result = front.getValue();
        if(size == 1) {
            front = null; back= null;
        } else front = front.getLink();
        size--;
        return result;
    }

    @Override
    public int getSize() {  
        return size;
    }

    @Override
    public void clear() {
        front = null;
        back = null;
        size = 0;
    }
    
    @Override
    public String toString(){
        String result = "[ ";
        Node<T> current = front;
        while(current != null){
            result += current.getValue() + " ";
            current = current.getLink();
        }
        
        return result+"] ";
    }

    public boolean isEmpty() {
        return size==0;
    }
    
}
