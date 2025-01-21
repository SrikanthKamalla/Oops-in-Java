//Child Class
public class Rectangle extends Shape {
    void findArea(){//Overidden method of parent class
        int l=10;
        int b=5;
        int ar=l*b;
        System.out.println("Area of Rectangle:"+ar);

    }
    void diplay(){//Overidden method of parent class
        System.out.println("This is a Rectangle");

    }
    
}
