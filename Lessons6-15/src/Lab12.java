/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import pkg6.implement.LinkedListSortedQueue;
import pkg6.implement.Student;

/**
 *
 * @author Dasten
 */
public class Lab12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        exercise1();
        exercise2();

    }
    
    static void exercise1(){
        LinkedListSortedQueue<Integer> sortedQueue = new LinkedListSortedQueue();
        
        for(int i=90; i>0; i-=10){
            sortedQueue.insert(i);
        }
        System.out.println(sortedQueue+" and size:"+ sortedQueue.getSize());
        
        for(int i=0; i<3; i++)
            try {
                sortedQueue.dequeue();
            } catch (Exception e) {
                System.out.println(e);
            }
        System.out.println(sortedQueue+" and size:"+ sortedQueue.getSize());


        for(int i=100; i<=900; i+=100){
            sortedQueue.insert(i);
        }
        System.out.println(sortedQueue+" and size:"+ sortedQueue.getSize());

        
        for(int i=0; i<4; i++)
            try {
                sortedQueue.dequeue();
            } catch (Exception e) {
                System.out.println(e);
            }
        System.out.println(sortedQueue+" and size:"+ sortedQueue.getSize());
        
        for(int i=5; i<=915; i+=10){
            sortedQueue.insert(i);
        }
        System.out.println(sortedQueue+" and size:"+ sortedQueue.getSize());
        

        int size = sortedQueue.getSize();
        for(int i=0; i<size; i++){
            try {
                sortedQueue.dequeue();
            } catch (Exception e) {
                System.out.println(e);
            }            
        }
        System.out.println(sortedQueue+" and size:"+ sortedQueue.getSize());
        
        sortedQueue.insert(1);        
        sortedQueue.insert(5);
        sortedQueue.insert(7);
        System.out.println(sortedQueue+" and size:"+ sortedQueue.getSize());
        
        sortedQueue.clear();
        System.out.println(sortedQueue+" and size:"+ sortedQueue.getSize());
        
        sortedQueue.insert(250);        
        sortedQueue.insert(500);
        sortedQueue.insert(750);
        sortedQueue.insert(5000);

        System.out.println(sortedQueue+" and size:"+ sortedQueue.getSize());
    }
    
    static void exercise2() throws Exception{
        
        LinkedListSortedQueue<Student> a = new LinkedListSortedQueue();
        Student st1 = new  Student(1, "Dasten");
        Student st2 = new  Student(2, "Aivar");
        Student st3 = new  Student(3, "Bakytzhan");        
        Student st4 = new  Student(4, "Dias");

        a.insert(st1);
        a.insert(st2);
        a.insert(st2);
        a.insert(st3);
        a.insert(st2);
        a.insert(st1);
        a.insert(st4);

        System.out.println(a);

        a.dequeue();
        a.dequeue();
        
        System.out.println(a);
        
       
        
    }
    
}
