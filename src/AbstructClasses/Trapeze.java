package AbstructClasses;

public class Trapeze extends Figure {
    protected double side1;
    protected double side2;
    protected double height;

    public Trapeze(double side1, double side2, double height) {
        this.side1 = side1;
        this.side2 = side2;
        this.height=height;
    }

    @Override
    protected String countSquare() {
        double res= 0.5 * (side1 + side2)* height;
        return "Площадь трапеции равна " + res;
    }
}
