public class Circle implements Shape {
    //To inherit the interface, we use Implements keyword.
    public void findArea(){
        int r=5;
        double ar=3.14*r*r;
        System.out.println("Area of the Circle:"+ar);

    }
    public void diplay(){
        System.out.println("This is a Circle");
        
    }
    
}
