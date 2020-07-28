
public class Print{
  
  
  public static void main(String []args){
    Animal dog = new Dog("boduk");
    Animal cat = new Dog("nyaong");
    
    
    
    
    Pet pet1 = new Dog("baduck");
    Pet pet2 - new Cat("nyaong");
    
    pet1.FoodCall();      //baduck!!!
    pet2.FoodCall();      //.......
    
    
    ((Cat)pet1).Cry();    //nyaong~~~
  }

}
