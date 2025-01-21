public class ShapeApp {
    public static void main(String[] args) {
        Square s=new Square();
        Rectangle r=new Rectangle();
        Circle c=new Circle();

        Run(s); 
        Run(r);
        Run(c);
    }
    public static void Run(Shape S){
        S.findArea();
        S.diplay();
    }
    
}
