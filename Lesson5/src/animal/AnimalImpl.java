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
public class AnimalImpl implements Animal {

     private int age = 0;
   

    @Override
    public int getAge() {
    return age ;
    }

   
int max = 2;
  
    public int maxAge(int i){
        max = i;
        return i;
    }
    
     public boolean isAlive(){
        if(age<= max) {
         return true;
        } else {
            return false;
        }
     }
    
      @Override
    public void addOneAge() {
    age++;
    isAlive();
    }
    
    @Override
    public String kindAnimal() {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean canEat(String food) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int maxSpeed() {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int weight() {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void feed(String food) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
