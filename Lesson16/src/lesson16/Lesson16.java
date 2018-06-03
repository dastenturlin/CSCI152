/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson16;

import impl.BSTSet;
import impl.Student;

/**
 *
 * @author dasten
 */
public class Lesson16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        exercise1();
        exercise2();    
    }
    
    static void exercise1(){
        System.out.println("exercise1");
        BSTSet<Integer> tree = new BSTSet();
        
        tree.add(5); 
        tree.add(12); 
        tree.add(3); 
        tree.add(6); 
        tree.add(14); 
        tree.add(2); 
        tree.add(-6); 
        tree.add(8); 
        tree.add(0);         
        System.out.println(tree+" size:"+tree.getSize());
        System.out.println();
        
        tree.add(14); 
        tree.add(-6); 
        tree.add(5); 
        System.out.println(tree+" size:"+tree.getSize());
        System.out.println();

        System.out.println("contains 12: "+tree.contains(12));
        System.out.println("contains 7: "+tree.contains(7));
        System.out.println("contains 2: "+tree.contains(2));
        System.out.println("contains -8: "+tree.contains(-8));
        System.out.println("contains 5: "+tree.contains(5));

        System.out.println();
       
        tree.clear();
        System.out.println(tree+" size:"+tree.getSize());
        System.out.println();
        
        
        tree.add(55); 
        tree.add(24); 
        tree.add(78); 
        tree.add(51); 
        System.out.println(tree+" size:"+tree.getSize());        
        System.out.println();
                    
        
    }
    
    static void exercise2(){
        
        System.out.println("exercise2");
        BSTSet<Student> floor7 = new BSTSet();
        
        //Add 5
        floor7.add(new Student(1, "Dasten"));
        floor7.add(new Student(2, "Aivar"));
        floor7.add(new Student(3, "Dias"));
        floor7.add(new Student(4, "Bakha"));
        floor7.add(new Student(5, "Unknown"));
        System.out.println(floor7+"size:"+floor7.getSize());
        
        System.out.println("inserting the same values:");
        
        //Add 2 new (the same)
        floor7.add(new Student(7, "Aivar"));
        floor7.add(new Student(8, "Bakha"));
        System.out.println(floor7+"size:"+floor7.getSize());
        
        //Add 3
        System.out.println("add 3 new:");
        floor7.add(new Student(9, "Tair"));
        floor7.add(new Student(10, "Maks"));
        floor7.add(new Student(11, "Chingiz"));
        System.out.println(floor7+"size:"+floor7.getSize());
        
        //Clear 
        System.out.println("clean:");
        floor7.clear();
        System.out.println(floor7+"size:"+floor7.getSize());
        System.out.println("");
        
        //Add 2 
        System.out.println("add 2:");
        floor7.add(new Student(12, "Yassawe"));
        floor7.add(new Student(13, "Sultanbek"));
        System.out.println(floor7+"size:"+floor7.getSize());       
        
        
    }
    
}
