package pkg6.implement;
import pkg6.adt.Deque;

/**
 *
 * @author Dasten
 * @param <T>
 */
public class LinkedListDeque<T> implements Deque<T> {
    private DoublyLinkedNode<T> front, back;
    private int size;
    
    public LinkedListDeque(){
        front = null;
        back = null;
        size = 0;
    }
    @Override
    //push to front
    public void pushToFront(T value) {
        DoublyLinkedNode<T> newNode = new DoublyLinkedNode(value);
        
        if(size == 0){
            front = newNode;
            back = newNode;
            size++;
        } else {
            newNode.setNext(front);
            front.setPrevious(newNode);
            front=newNode;  
            size++;
        }
        
        
    }

    //as conventional push(enqueue) works, but with queue, not stack
    @Override
    public void pushToBack(T value) {
        DoublyLinkedNode<T> newNode = new DoublyLinkedNode(value);
        if(size == 0){
            front = newNode;
            back = newNode;
            size++;
        }else {
            newNode.setPrevious(back);
            back.setNext(newNode);
            back=newNode;       
            size++;
        }        
        
    }

    //dequeue
    @Override
    public T popFromFront() throws Exception {
        if(size == 0) throw new Exception("Still empty");
        T result = front.getValue();
        if(size == 1) {
            front = null; 
            back = null;
            size--;
        } else{
            front = front.getNext();
            front.setPrevious(null);
            size--;
        }
        
        return result;
    }

    @Override
    public T popFromBack() throws Exception {
        if(size == 0) throw new Exception("Still empty");
        T result = back.getValue();
        if(size == 1) {
            front = null; 
            back = null;
            size--;
        } else{
            back = back.getPrevious();
            back.setNext(null);
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
        
        DoublyLinkedNode<T> curr = front;
        while(curr != null){
            str += curr.getValue() + " ";
            curr = curr.getNext();
        }
        
        return str + "]";
                
    }
    

    
}