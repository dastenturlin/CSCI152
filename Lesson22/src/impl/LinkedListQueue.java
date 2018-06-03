package impl;




import adt.Queue;

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
        
        //case when size=0
        if(size == 0) {
            front = newNode;
            back = front;
        } 
        //any other case
        else {
            back.setLink(newNode);
            back = newNode;            
        }
        size++;
    }

    @Override
    public T dequeue() throws Exception {
        //case when the queue is empty
        if(size == 0) throw new Exception("Still empty");
        
        //size = 1
        T result = front.getValue();
        if(size == 1) {
            front = null; 
            back = null;
            size--;
        } 
        
        //any other case
        else 
        {
            front = front.getLink();
            size--;
        }
        
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
        String str = "[ ";
        Node<T> curr = front;
        
        while(curr != null){
            str += curr.getValue() + " ";
            curr = curr.getLink();
        }
        
        return str + "] ";
    }

    public boolean isEmpty() {
        return size==0;
    }
    
}
