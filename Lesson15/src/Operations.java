  
import adt.Set;
import impl.LLQueueSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dasten
 */
public class Operations {

    public Operations() {
    }
    
    public static boolean isSubset(Set<Integer> set1, Set<Integer> set2){
        int size = set1.getSize();
        System.out.println("Entered:\n"+set1+" and "+set2);
        
        for (int i = 0; i < size; i++) {
            try {
              Integer temp = set1.removeAny();
              set1.add(temp);
              if(!set2.contains(temp)) 
                  return false;  
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return true;
    }
    
    public static Set<String> union(Set<String> set1, Set<String> set2){
        System.out.println("Entered:\n"+set1+" and "+set2);
        
        Set<String> result = new LLQueueSet();
        int size1 = set1.getSize();
        int size2 = set2.getSize();
        
        //we need to preserve initials, so
        for (int i = 0; i < size1; i++) {
            try {
                String temp = set1.removeAny();
                set1.add(temp);
                result.add(temp);
            } catch (Exception e) {
                System.out.println(e);
            }            
        }
        for (int i = 0; i < size2; i++) {
            try {
                String temp = set2.removeAny();
                set2.add(temp);
                result.add(temp);
            } catch (Exception e) {
                System.out.println(e);
            }            
        }
        return result;
    }
    
    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2){
        System.out.println("Entered:\n" + set1 + " and " + set2);
        Set<Integer> result = new LLQueueSet();
        int size = set1.getSize();
        
        for (int i = 0; i < size; i++) {
            try {
                Integer temp = set1.removeAny();
                set1.add(temp);
                if(set2.contains(temp))
                {
                    result.add(temp);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return result; 
    }
}
