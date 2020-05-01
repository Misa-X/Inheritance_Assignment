package week9;

public class DriverShape {
    public static void main(String[] args){
        Shape shape = new Shape("green", true);
        Circle c = new Circle(2.5);
        Rectangle r = new Rectangle(2.0,2.5);
        Square s = new Square(2.0);

        System.out.println(shape.toString());
        System.out.println(c.toString());
        System.out.println(r.toString());
        System.out.println(s.toString());

    }





}
