package week9;

public class Rectangle extends Shape {
    private double width ;
    private double length;

    public Rectangle(){
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getArea(double width, double length){
        return width*length;
    }
    public double getPerimeter(double width, double length){
        return (2*width)+(2*length);
    }

    @Override
    public String toString(){
        return "Rectangle {" + "Color: "+ getColor()+ ", Width: "+ getWidth() + ", Length: "+ getLength()+ ", Area: "+ getArea(width, length)+ ", Perimeter: "+ getPerimeter(width, length)+ "}";
    }

}
