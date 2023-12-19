package AbstructClasses;

public class Rectangle extends Figure{
    private double weight;
    private double height;

    public Rectangle(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    protected String countSquare() {
        double res=weight*height;
        return "Площадь прямоуголника равна " + res;
    }
}
