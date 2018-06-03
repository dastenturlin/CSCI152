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
public class Panda extends AnimalImpl {
    
    
    @Override
    public String kindAnimal() {
    return "Bamboo";
    }
    
    @Override
    public boolean canEat(String food) {
    if(food.equals("Bamboo")) {
        return true;
    } else { 
        return false;
      }
    }
    
    @Override
    public int maxSpeed() {
    return 7;
    }

    @Override
    public int weight() {
    return 5;
    }

   @Override
    public void feed(String food) throws Exception {
    if(!food.equals("Bamboo"))
        throw new Exception("Panda does not eat this food");
    else System.out.println("Bz, bzz ....");
    }
    
      public String toString(){
        return "A panda which is " + getAge() + " years old and max speed is " + maxSpeed()
                 + "km/h and weight is " + weight() + " kg";
    }
}
