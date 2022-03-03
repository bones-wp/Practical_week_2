public class Rectangle extends Quadrangle implements Figure {
    public Rectangle(int a, int b, String color) {
        super(a, b, color);
    }

    public double area() {
        return a * b;
    }

    double getArea(){
        return area();
    }

    public double perimeter() {
        return 2 * (a + b);
    }

    double getPerimeter(){
        return perimeter();
    }

    @Override
    double getLargeDiagonal() {
        return Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
    }

    @Override
    double getHeight() {
        return Math.min(a, b);
    }

    @Override
    String getColor() {
        return color;
    }

}
