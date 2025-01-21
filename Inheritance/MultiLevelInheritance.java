// To inherit the properties of the parent class by the child class, "Extends" keyword is used
class Animals {
    public void move(){
        System.out.println("Animals can Walk");
    }
    public void sleep(){
        System.out.println("Animals cna sleep");
    }      
}
class Carnivores extends Animals{// properties of animals are extended by Carnivarous animals
    public void hunt(){
        System.out.println("Carnivares animals hunt for food");
    }
}
class Loin extends Carnivores{//properties of Carnivarous animals extended by the Loin
    public void roar(){
        System.out.println("Loins make roar sound");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Loin l=new Loin();
        l.move();
        l.sleep();
        l.hunt();
        l.roar();        
    }
    
}
