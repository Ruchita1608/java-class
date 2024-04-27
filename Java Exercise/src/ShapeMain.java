abstract class Shape
{
    protected String color;

    public Shape(String color)
    {
        this.color=color;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}


class Square extends Shape{
    private int side;

    public Square(String color, int side)
    {
        super(color);
        this.side=side;
    }

    public double getSide()
    {
        return side;
    }

    public double getArea()
    {
        return side*side;
    }

    @Override
    public double getPerimeter() {
        return 4*side;
    }
}


class Rectangle extends Shape{

    private int height, width;

    public Rectangle(String color, int height, int width ){

        super(color);
        this.height=height;
        this.width=width;
    }

    public int getHeight()
    {
        return height;
    }

    public int getWidth()
    {
        return width;
    }
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2*(width+height);
    }
}


class Triangle extends Shape{

    private int side1, side2, side3;

    public Triangle(String color, int side1, int side2, int side3){

        super(color);
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}


class Circle extends Shape{

    private double radius;

    public Circle(String color, double radius)
    {
        super(color);
        this.radius=radius;
    }

    public double getRadius()
    {
        return radius;
    }

    @Override
    public double getArea() {
        return  Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
public class ShapeMain {

    public static void main(String args[])
    {
        Square sq= new Square("Red",5);
        System.out.println("Area of square = "+sq.getArea());
        System.out.println("Perimeter of square ="+ sq.getPerimeter());

        Rectangle rec= new Rectangle("Green",5,6);
        System.out.println("Area of rectangle ="+rec.getArea());
        System.out.println("Perimeter of rectangle ="+rec.getPerimeter());

        Triangle tr= new Triangle("Pink",3,3,2);
        System.out.println("Area of Triangle = "+tr.getArea());
        System.out.println("Perimeter of Triangle ="+tr.getPerimeter());

        Circle cr= new Circle("White",4.5);
        System.out.println("Area of the circle ="+cr.getArea());
        System.out.println("Perimeter od the Circle ="+cr.getPerimeter());
    }
}
