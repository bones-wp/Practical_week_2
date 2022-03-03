public class Square extends Quadrangle implements Figure {

    public Square(int a, String color) {
        super(a, a, color);
    }

    public double area() {
        return a * a;
    }

    double getArea(){
        return area();
    }

    public double perimeter() {
        return 2 * (a + a);
    }

    double getPerimeter(){
        return perimeter();
    }

    @Override
    double getLargeDiagonal() {
        return a * Math.sqrt(2);
    }

    @Override
    double getHeight() {
        return a;
    }

    @Override
    String getColor() {
        return color;
    }
}
