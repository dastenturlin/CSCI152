/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import pkg6.adt.Deque;
import pkg6.implement.LinkedListDeque;

/**
 *
 * @author Dasten
 */
public class Lab13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }
    
    static void exercise1(){
         LinkedListDeque<Integer> deque = new LinkedListDeque();
        //Tries to pop from both the front and the back of the empty deque 
        try {
            deque.popFromBack();
            deque.popFromFront();
        } catch (Exception e) {
            System.err.println(e);
        }
        
        //Pushes 5 items to the FRONT of the deque
        for (int i = 0; i < 5; i++) {
            deque.pushToFront(i);
            System.out.println(deque);
        }
        
        //Pops the 5 items from the FRONT of the deque
        for (int i = 0; i < 5; i++) {
            try {
                deque.popFromFront();
                System.out.println(deque);
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        
        System.out.println();
        
        //Pushes 6 items to the FRONT of the deque
        for (int i = 0; i < 6; i++) {
            deque.pushToFront(i);
        }
        System.out.println(deque);        
        //Pops the 6 items from the BACK of the deque
        for (int i = 0; i < 6; i++) {
            try {
                deque.popFromBack();
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        System.out.println(deque);    
        System.out.println();
        
        for (int i = 0; i < 7; i++) {
            deque.pushToBack(i);
        }
        System.out.println(deque);        
        //Pops the 7 items from the BACK of the deque
        for (int i = 0; i < 7; i++) {
            try {
                deque.popFromBack();
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        System.out.println(deque); 
        System.out.println();
        
        for (int i = 0; i < 8; i++) {
            deque.pushToBack(i);
        }
        System.out.println(deque);        
        //Pops the 8 items from the FRONT of the deque
        for (int i = 0; i < 8; i++) {
            try {
                deque.popFromFront();
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        System.out.println(deque);
        System.out.println();
        
        for(int i = 0; i < 10; i++)
        {
            deque.pushToFront(i);
            deque.pushToBack(i);
        }
        System.out.println(deque);
        System.out.println();
        
        for(int i = 0; i < 8; i++)
        {
             try {
                 deque.popFromFront();
             } catch (Exception e) {
                 System.err.println(e);
             }
             try {
                 deque.popFromBack();
             } catch (Exception e) {
                 System.err.println(e);
             }
        }
        System.out.println(deque);
        System.out.println();
        
        deque.clear();
        System.out.println(deque);
        System.out.println();
        
        deque.pushToBack(37);
        System.out.println(deque);
        System.out.println();
    }
    
    
    static void exercise2(){
        
        Deque<Integer> deq = new LinkedListDeque<>();
        deq.pushToFront(56);
        deq.pushToFront(5);
        deq.pushToFront(6);
        deq.pushToFront(560);
        deq.pushToFront(45);
        deq.pushToFront(56);
        deq.pushToFront(37);
        
        System.out.println("before:\n"+deq);
        
        System.out.println("after:\n"+mergeSort(deq));

        
    }
    
    public static Deque<Integer> merge(Deque<Integer> d1, Deque<Integer> d2) {
     int count1 = 0, count2 = 0;
     
     //length of a resulting queue
     int d1_size = d1.getSize(),
         d2_size = d2.getSize(),
         length = d1.getSize() + d2.getSize();
     
     Deque<Integer> result = new LinkedListDeque();
     
     int a=0, b=0;
     
     
     for(int i=0; i<length; i++){
         
         try {
            a = d1.popFromFront();
         } catch (Exception e) {
         }
         try {
            b = d2.popFromFront();
         } catch (Exception e) {
         }
         
         
         if(count1 == d1_size){
             result.pushToBack(b);
             count2++;
         }
         
         else if(count2 == d2_size){
             result.pushToBack(a);
             count1++;
         }
         
         else if(a < b){
             result.pushToBack(a);
             count1++;
             d2.pushToFront(b);
         } 
         
         else{
            result.pushToBack(b);
            count2++; 
            d1.pushToFront(a);
         }
         
     }
     
    return result;
    } 


    public static Deque<Integer> mergeSort(Deque<Integer> deq) {
         int size = deq.getSize();
         
         if(size <= 1) return deq;
         else{
             int mid = (deq.getSize()/ 2);
             
             Deque<Integer> half1 = new LinkedListDeque();
             for (int i = 0; i < mid; i++) {
                try {
                    half1.pushToBack(deq.popFromFront());
                } catch (Exception e) {
                    System.out.println(e + " in MergeSort");
                }
             }
             
             Deque<Integer> half2 = new LinkedListDeque();
             for (int i = mid; i < size; i++) {
                try {
                    half2.pushToBack(deq.popFromFront());
                } catch (Exception e) {
                    System.out.println(e + " in MergeSort");
                }
             }
             
             half1 = mergeSort(half1);
             half2 = mergeSort(half2);
             
             return merge(half1, half2);
             
             
         }
         
    } 
    
}
