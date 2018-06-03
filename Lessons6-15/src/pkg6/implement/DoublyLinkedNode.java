
package pkg6.implement;

/**
 * Generic doubly-linked nodes
 * @param <T>
 */
public class DoublyLinkedNode<T> {
    
    private T value;
    
    private DoublyLinkedNode<T> previous;
    private DoublyLinkedNode<T> next;

    /**
     * 
     * 
     * @param val 
     */
    public DoublyLinkedNode(T val) {
        value = val;
        previous = null;
        next = null;
    }

    /**
     * @return 
     */
    public T getValue() {
        return value;
    }

    /**
     * @param value 
     */
    public void setValue(T value) {
        this.value = value;
    }

    /**
     * @return 
     */
    public DoublyLinkedNode<T> getPrevious() {
        return previous;
    }

    /**
     * @param previous 
     */
    public void setPrevious(DoublyLinkedNode<T> previous) {
        this.previous = previous;
    }

    /**
     * @return 
     */
    public DoublyLinkedNode<T> getNext() {
        return next;
    }

    /**
     * @param next 
     */
    public void setNext(DoublyLinkedNode<T> next) {
        this.next = next;
    }
      
    /**
     * @return the string 
     */
    @Override
    public String toString() {
        return value.toString();
    }
}
