package AbstructClasses;

public class Circle extends Figure{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    protected String countSquare() {
        double res=Math.PI * Math.pow(radius, 2);
        return "Площадь круга равна " + res;
    }
}
