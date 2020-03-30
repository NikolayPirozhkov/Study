import java.util.Random;

/**
 * @author NikolayPirozhkov
 * @project Java
 */
public class ShapeWorking {
    IShape generateRandomShapeClass() {

        Random randomGenerator = new Random();
        int shapeSelector = randomGenerator.nextInt(3);
        if (shapeSelector == 0) {
            return new Rectangle(randomGenerator.nextDouble(),randomGenerator.nextDouble());
        }
        if (shapeSelector == 1){
            return new Circle(randomGenerator.nextDouble());
        }
        if (shapeSelector == 2){
            return new Triangle(randomGenerator.nextDouble(),randomGenerator.nextDouble(),randomGenerator.nextDouble());
        }

        return null;
    }
    String getShapeInfo(IShape shape){
        return shape.toString();
    }

}
