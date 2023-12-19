package AbstructClasses;

public class Trangle extends Figure {
    protected double height;
    protected double side;

    public Trangle(double height, double side) {
        this.height = height;
        this.side = side;
    }

    @Override
    protected String countSquare() {
        double res= 0.5 *height*side;
        return "Площадь треуголника равна " + res;
    }
}
