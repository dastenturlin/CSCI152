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
public class Tiger extends AnimalImpl {
    private int age;
    
    public Tiger(){
      maxAge(9);
    }
    
    @Override
    public String kindAnimal() {
    return "Tiger";
    }

   

    @Override
    public boolean canEat(String food) {
    if(food.equals("Meat")) {
        return true;
    }          else { 
        return false;
        }
    }

  
     
    @Override
    public int maxSpeed() {
    return 45;
    }
    
    @Override
    public int weight(){
        return 60;
    }
    
    public String toString(){
        return "A tiger which is " + getAge() + " years old and max speed is " + maxSpeed()
                 + "km/h and weight is " + weight() + " kg";
    }

    @Override
    public void feed(String food) throws Exception {
    if(!food.equals("Meat"))
        throw new Exception("Tiger does not eat this food");
    else System.out.println("Meaf, Meaf....");
    }

}
