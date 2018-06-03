/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author Dasten
 */
public class AnimalTest {
     
    public static void feedFood(Animal animal){
        try {
            animal.feed("Bamboo");
        }   catch(Exception ex) {
                System.out.println(ex.getMessage());
        }
    }
    
    public static void main(String[] str){
         
        AnimalImpl cow = new Cow();
        AnimalImpl tiger = new Tiger();
        AnimalImpl panda = new Panda();
        
        feedFood(cow);
        feedFood(tiger);
        feedFood(panda);
        
        tiger.addOneAge();
        
        cow.addOneAge();
        cow.addOneAge();
        
        System.out.println();
        System.out.println(cow);
         
         
        cow.addOneAge();
        cow.addOneAge();
        cow.addOneAge();
        
        System.out.println(cow.isAlive());
        System.out.print(tiger);
        System.out.println();
        
        panda.addOneAge();
        panda.addOneAge();
        panda.addOneAge();
        
        System.out.println(panda.isAlive());
        System.out.println(panda);
    }
}
