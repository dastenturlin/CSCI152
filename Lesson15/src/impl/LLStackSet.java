/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Set;
import adt.Stack;

/**
 *
 * @author dasten
 */
public class LLStackSet<T> implements Set<T> {

    private LinkedListStack<T> stack;

    public LLStackSet() {
        this.stack = new LinkedListStack<>();
    }

    @Override
    public void add(T value) {
        if(!contains(value)){
            stack.push(value);
        }
    }

    @Override
    public boolean contains(T value) {
        int size = stack.getSize();  
        Stack<T> stk = new LinkedListStack<>();
        
        for(int i=0; i<size; i++){
            try {                
                T check = stack.pop();
                stk.push(check); 
                int s = stk.getSize();
                
                if(check.equals(value)){ 
                    for (int j = 0; j < s; j++) { 
                        T p = stk.pop();
                        stack.push(p); 
                    }
                    return true;
                } 
                
                else if(stack.getSize() == 0)
                    {
                        for (int j = 0; j < s; j++) { 
                            T p = stk.pop();
                            stack.push(p); 
                        }
                    }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return false;
    }

    @Override
    public boolean remove(T value) {
        if(contains(value)){
            Stack<T> copy = new LinkedListStack();
            T check = null;
            
            try {
                check = stack.pop();
            } catch (Exception e) {
                System.out.println(e);
            } 
            
            
            while(!value.equals(check)){ 
                copy.push(check);
                try {
                   check = stack.pop();
                } catch (Exception e) {
                    System.out.println(e);
                }  
            };
            
            int size = copy.getSize();
            for(int i=0; i<size; i++ ){
                try {
                    T p = copy.pop();
                    stack.push(p);
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
        if(stack.getSize() == 0) 
            throw new Exception("Still empty");
        T result = stack.pop();        
        return result;
    }

    @Override
    public int getSize() {
        return stack.getSize();
    }

    @Override
    public void clear() {
        stack.clear();
    }
    
    @Override
    public String toString(){
        return stack.toString();
    }
}
