public class Rhombuses extends Quadrangle implements Figure {
    double alpha, beta;

    public Rhombuses (int a, double alpha, double beta, String color) {
        super(a, a, color);
        this.alpha = alpha;
        this.beta = beta;
    }

    public double area() {
        return b * getHeight();
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
        double d1 = a * Math.sqrt(2-2 * Math.cos(Math.toRadians(beta)));
        double d2 = a * Math.sqrt(2-2 * Math.cos(Math.toRadians(alpha)));
        return Math.max(d1, d2);
    }

    @Override
    double getHeight() {
        return a * Math.sin(Math.toRadians(alpha));
    }

    @Override
    String getColor() {
        return color;
    }

}
