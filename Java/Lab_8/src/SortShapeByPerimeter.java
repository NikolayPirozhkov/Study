import java.util.Comparator;

/**
 * @author NikolayPirozhkov
 * @project Java
 */
public class SortShapeByPerimeter implements Comparator<IShape> {
    @Override
    public int compare(IShape shape1, IShape shape2) {
        return Double.compare(shape1.getPerimeter(), shape2.getPerimeter());
    }
}
