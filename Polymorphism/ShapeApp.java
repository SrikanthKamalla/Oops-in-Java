public class ShapeApp {
    public static void main(String[] args) {
        Square s=new Square();
        Rectangle r=new Rectangle();
        Circle c=new Circle();

        Run(s);// while we pass "s(Object of Square)" as an value for the run function then Run Method behave for Square 
        Run(r);// while we pass "r(Object of Rectanfle)" as an value for the run function then Run Method behave for Rectangle 
        Run(c);// while we pass "c(Object of Circle)" as an value for the run function then Run Method behave for Circle.This process is called Loose Coupling 
        
        /* In Loose Coupling
        Instead of Child type reference refering to a Child type object,
        Parent type referce refers to a Child type object
        */
    }
    public static void Run(Shape S){
        S.findArea();
        S.diplay();
    }
    
}
