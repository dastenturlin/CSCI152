/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci152.impl;

import csci152.adt.Stack;

/**
 *
 * @author Aivar Abrashuly
 * @param <T>
 */
public class ArrayStack<T> implements Stack<T>{
     
    private T[] values;
    int size;
    public ArrayStack() {
        values = (T[])new Object[10];
        size = 0;
    }
    
    @Override
    public void push(T value) {
       
        if(size == values.length) {
            T[] newArr = (T[])new Object[size+10];
            for(int i=0; i<values.length; i++) newArr[i] = values[i];
            values = newArr;
        }
        values[size] = value;
        size++;
    }

    @Override
    public T pop() throws Exception {
        if (size == 0) throw new Exception("no item in the stack");
        T result = values[size-1];
        size--;
        return result;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
       values = (T[])new Object[10];
       size = 0;
    }
    
    
    @Override
    public String toString(){
        String result ="bottom["; 
        for(int i =0; i<size; i++) result += String.valueOf(values[i])+" ";
        result+="]front";
        return result;
    }
    
}
