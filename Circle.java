package week9;
import java.lang.Math;
import java.util.* ;

public class Circle extends Shape{
    private double radius;

    public Circle(){
        this.radius = 1.0;
    }

    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(double radius){
        return Math.PI * Math.pow(radius, 2);
    }
    public double getPerimeter(double radius){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString(){
        return "Circle {"+ "Color: "+ getColor()+ ", Radius: "+ getRadius() +", Area: "+ getArea(radius)+ ", Perimeter: " + getPerimeter(radius) + "}" ;
    }

}
