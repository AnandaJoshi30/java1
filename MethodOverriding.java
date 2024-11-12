class Animal {
    public void sound(){
        System.out.println("The animal makes a sound");
    }
}
class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("The dog barks");
    }   
}

public class MethodOverriding{
    public static void main(String[] args){
        Animal myAnimal=new Animal();
        myAnimal.sound();
        
        Animal myDog=new Dog();
        myDog.sound();
        
    }
}
