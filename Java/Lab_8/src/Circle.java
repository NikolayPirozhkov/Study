/**
 * @author NikolayPirozhkov
 * @project Java
 */
public class Circle implements IShape {
    private double _radius;
    Circle(double radius){
        this._radius = radius;
    }
    @Override
    public double getPerimeter() {
        return Math.PI * 2 * _radius;
    }

    @Override
    public String toString() {
        return "Radius = " + _radius + "\t" +
                "Perimeter = " + getPerimeter();
    }
}
