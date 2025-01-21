//Child Class
public class Circle extends Shape {
    void findArea(){//Overidden method of parent class
        int r=5;
        double ar=3.14*r*r;
        System.out.println("Area of the Circle:"+ar);

    }
    void diplay(){//Overidden method of parent class
        System.out.println("This is a Circle");
        
    }
    
}
