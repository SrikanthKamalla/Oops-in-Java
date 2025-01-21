// To inherit the properties of the parent class by the child class, "Extends" keyword is used
class Animals {
    public void move(){
        System.out.println("Animals can Walk");
    }
    public void sleep(){
        System.out.println("Animals cna sleep");
    }      
}



class Herbivores extends Animals{// The properties of the Animals class are inheriterd by the Herbivores class
    public void eatPlants(){
        System.out.println("Herbivores animals eat plants");
    }
}

class Carnivares extends Animals{// The properties of the Animals class are inheriterd by the Carnivares class
    public void eatAnimals(){
        System.out.println("Carnivares animals eat animals");
    }
}

class Omnivores extends Animals{// The properties of the Animals class are inheriterd by the Omnivores class
    public void eatBoth(){
        System.out.println("Omnivores animals eat both animals and plants");
    }
}

public class HierarchichalInheritance {
    public static void main(String[] args) {
        Herbivores h=new Herbivores();
        Carnivares c=new Carnivares();
        Omnivores o=new Omnivores();
        h.move();
        h.sleep();
        h.eatPlants();
        c.move();
        c.sleep();
        c.eatAnimals();
        o.move();
        o.sleep();
        o.eatBoth();

    }
    
}