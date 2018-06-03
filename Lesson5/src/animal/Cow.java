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
public class Cow extends AnimalImpl {
    
private int age;
    
public Cow(){
    maxAge(5);
    }
   
@Override
    
public String kindAnimal() {
   return "Cow";
    }
   
//    @Override
//    public int getAge() {
//    return age;
//    }
    
    @Override
    public boolean canEat(String food){
        if (food.equals("Grass"))
            return true;
        else 
            return false;
    }

//    @Override
//    public void addOneAge() {
//   age++;
//    } 
   
  @Override
  public int maxSpeed(){
      return 25;
  }
  
  @Override
  public int weight(){
      return 35;
  }
    
    public String toString(){
        return "A cow which is " + getAge() + " years old and max speed is " + maxSpeed()
                 + "km/h and weight is " + weight()+ " kg";
    }
    
     @Override
    public void feed(String food) throws Exception {
    if(!food.equals("Grass"))
        throw new Exception("Cow does not eat this food");
    else System.out.println("Chew, Chew....");
    }
}
