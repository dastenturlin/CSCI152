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
public interface Animal {
     /**
      * 
      * @return name of object name
      */
    public String kindAnimal();
    
    /**
      * 
      * @return gives age of animal
      */
    public  int getAge();
    
    /**
     * @param food takes kind of food from user
     * @return true if animal can eat given food and false if not
     *  java.lang.Exception if food is not convinient
     */
    public boolean canEat(String food);
    
    /**
     * implements age of animal by adding one
     */
    public void addOneAge();
    
    /**
     * 
     * @return max speed which animal can reach
     */
    
    public int maxSpeed();
    
    /**
     * 
     * @return average weight of animal
     */
    
    public int weight();
    
    public void feed(String food) throws Exception;
}
