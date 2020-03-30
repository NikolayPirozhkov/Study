/**
 * @author NikolayPirozhkov
 * @project Java
 */
public class Rectangle implements IShape{

    private double _width;
    private double _height;

    Rectangle (double width, double height){
        this._width = width;
        this._height = height;
    }
    @Override
    public double getPerimeter() {
        return (_height + _width) * 2;
    }

    @Override
    public String toString() {
        return "Width = " + _width + "\t"+
                "Height = " + _height + "\t" +
                "Perimeter = " + getPerimeter();
    }
}
