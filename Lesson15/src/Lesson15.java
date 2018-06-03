 
import adt.Set;
import impl.LLQueueSet;
import impl.LLStackSet;
import impl.Student;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dasten
 */
public class Lesson15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }
    
    static void exercise1(){
        Set<Student> floor7 = new LLQueueSet();
        
        //empty
        try {
            floor7.removeAny();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        //Add 5
        floor7.add(new Student(1, "Dasten"));
        floor7.add(new Student(2, "Aivar"));
        floor7.add(new Student(3, "Dias"));
        floor7.add(new Student(4, "Bakha"));
        floor7.add(new Student(5, "Unknown"));
        System.out.println(floor7+"size:"+floor7.getSize());
        
        //Remove       
        try {
            floor7.remove(new Student(6, "Nurzhan"));
        } catch (Exception e) {
        }
        System.out.println(floor7+"size:"+floor7.getSize());
        
        //Add 2 new (the same)
        floor7.add(new Student(7, "Maksat"));
        floor7.add(new Student(8, "Abylay"));
        System.out.println(floor7+"size:"+floor7.getSize());
        
        //Add 3
        floor7.add(new Student(9, "Tair"));
        floor7.add(new Student(10, "Maks"));
        floor7.add(new Student(11, "Chingiz"));
        System.out.println(floor7+"size:"+floor7.getSize());
        
        //removeAny 2 times
        try {
            System.out.println("Removed ones: "+floor7.removeAny());
            System.out.println("Removed ones: "+floor7.removeAny());
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(floor7+"size:"+floor7.getSize());
        
        //Clear 
        floor7.clear();
        System.out.println(floor7+"size:"+floor7.getSize());
        
        //Add 2 
        floor7.add(new Student(12, "Yassawe"));
        floor7.add(new Student(13, "Sultanbek"));
        System.out.println(floor7+"size:"+floor7.getSize());       
        
        
        System.out.println();
        System.out.println();
        
        
    }
    
    static void exercise2(){
        Set<Student> floor7 = new LLStackSet();
        
        //empty
        try {
            floor7.removeAny();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        //Add 5
        floor7.add(new Student(1, "Dasten"));
        floor7.add(new Student(2, "Aivar"));
        floor7.add(new Student(3, "Dias"));
        floor7.add(new Student(4, "Bakha"));
        floor7.add(new Student(5, "Unknown"));
        System.out.println(floor7+"size:"+floor7.getSize());
        
        //Remove       
        try {
            floor7.remove(new Student(6, "Nurzhan"));
        } catch (Exception e) {
        }
        System.out.println(floor7+"size:"+floor7.getSize());
        
        
       //Add 2 new (the same)
        floor7.add(new Student(7, "Maksat"));
        floor7.add(new Student(8, "Abylay"));
        System.out.println(floor7+"size:"+floor7.getSize());
        
        //Add 3
        floor7.add(new Student(9, "Tair"));
        floor7.add(new Student(10, "Maks"));
        floor7.add(new Student(11, "Chingiz"));
        System.out.println(floor7+"size:"+floor7.getSize());
        
        //removeAny 2 times
        try {
            System.out.println("Removed ones: "+floor7.removeAny());
            System.out.println("Removed ones: "+floor7.removeAny());
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(floor7+"size:"+floor7.getSize());
        
        //Clear 
        floor7.clear();
        System.out.println(floor7+"size:"+floor7.getSize());
        
        //Add 2 
        floor7.add(new Student(12, "Yassawe"));
        floor7.add(new Student(13, "Sultanbek"));
        System.out.println(floor7+"size:"+floor7.getSize()); 
        
        
        System.out.println();
        
    }
    
    static void exercise3(){
        Operations checker = new Operations();
        Set<Integer> set1 = new LLQueueSet();
        Set<Integer> set2 = new LLQueueSet();
        
        set2.add(1);
        set2.add(3);
        set2.add(5);
        set2.add(7);

        set1.add(3);
        set1.add(6);
        
        System.out.println(checker.isSubset(set1, set2));
        System.out.println();
    }
    
    static void exercise4(){
        Operations checker = new Operations();
        
        Set<String> set1 = new LLQueueSet();
        Set<String> set2 = new LLQueueSet();
       
        set2.add("1");
        set2.add("3");
        set2.add("5");
        set2.add("7");

        set1.add("3");
        set1.add("6");
        
        System.out.println(checker.union(set1, set2));
        System.out.println();
    }
    
    static void exercise5(){
        Operations checker = new Operations();
        
        Set<Integer> set1 = new LLQueueSet();
        Set<Integer> set2 = new LLQueueSet();
        
        set2.add(1);
        set2.add(3);
        set2.add(5);
        set2.add(7);

        set1.add(3);
        set1.add(6);
        
        System.out.println(checker.intersection(set1, set2));
    }
}
