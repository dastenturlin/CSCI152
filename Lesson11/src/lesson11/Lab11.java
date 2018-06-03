package lesson11;


import pkg6.adt.Queue;
import pkg6.implement.LinkedListQueue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dasten
 */
public class Lab11 {
    
    public static void main(String[] str) throws Exception{
    
        //11.1
        LinkedListQueue<Integer> a = new LinkedListQueue();
        
        try
        {
            a.dequeue();
        }
        catch(Exception ex)
                {
                    System.out.println(ex.getMessage());
                }
        
        
        
        for(int i=1; i<=8; i++)
        {
            a.enqueue(i*10);
        }
            System.out.print(a);
            System.out.println(a.getSize());
        
        for(int i=1; i<=3; i++)
        {
            a.dequeue();
            
        }
        System.out.print(a);
        System.out.println(a.getSize());
        
        
        for(int i=1; i<=9; i++)
        {
            a.enqueue(i*50);
            a.enqueue(i*100);
            a.dequeue();
            a.dequeue();
            System.out.print(a);
            System.out.println(a.getSize());
        }
        
        a.clear();
        System.out.print(a);
        System.out.println(a.getSize());
        
        
        for(int i=1; i<=22; i++)
        {
            a.enqueue(i);
        }
            System.out.print(a);
            System.out.println(a.getSize());
            
        System.out.println();
        System.out.println();
                        
        //11.3    
            
        Palindrome word = new Palindrome();
        
        LinkedListQueue<Character> queue = new LinkedListQueue();
        queue.enqueue('D');
        queue.enqueue('a');
        queue.enqueue('s');
        queue.enqueue('t');
        queue.enqueue('e');
        queue.enqueue('n');
        System.out.println(Palindrome.isPalindrome(queue));
}
    
    
}