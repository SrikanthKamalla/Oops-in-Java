public class Rectangle implements Shape {
    //To inherit the interface, we use Implements keyword.
    public void findArea(){
        int l=10;
        int b=5;
        int ar=l*b;
        System.out.println("Area of Rectangle:"+ar);

    }
    public void diplay(){
        System.out.println("This is a Rectangle");

    }
    
}
