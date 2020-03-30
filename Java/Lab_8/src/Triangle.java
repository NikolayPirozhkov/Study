/**
 * @author NikolayPirozhkov
 * @project Java
 */
public class Triangle implements IShape {
    private double _a;
    private double _b;
    private double _c;
    Triangle(double a, double b, double c){
        this._a = a;
        this._b = b;
        this._c = c;
    }
    @Override
    public double getPerimeter() {
        return _a + _b + _c;
    }

    @Override
    public String toString() {
        return "First side = " + _a + "\t" +
                "Second side = " + _b + "\t" +
                "Third side = " + _c + "\t" +
                "Perimeter = " + getPerimeter();
    }
}
