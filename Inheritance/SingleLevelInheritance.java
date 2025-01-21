// To inherit the properties of the parent class by the child class, "Extends" keyword is used
class Bird {
    public void fly(){
        System.out.println("Birds Can Fly");
    }  
    public void eat(){
        System.out.println("Birds Can Eat");
    }  
    
}
class Duck extends Bird { //properties of Bird are extended by the Duck 
    public void swim(){
        System.out.println("Duck can Swim");
    }
}
public class SingleLevelInheritance {  
    public static void main(String[] args) {
        Duck d=new Duck();
        d.fly();
        d.eat();
        d.swim();     
    }
}

