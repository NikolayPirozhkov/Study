import java.util.ArrayList;

/**
 * @author NikolayPirozhkov
 * @project Java
 */
/*
"Создать 10 случайных фигур Circle, Triangle, Rectangle со случайными параметрами – радиусом, длиной стороны.
Все фигуры имплементируют интерфейс Shape с одним методом getPerimeter():double, возвращающим периметр (или длину окружности)
Найти и вывести информацию о фигуре с максимальным/минимальным периметром"
 */
public class Main {
    public static void main(String [] args) {
        ArrayList<IShape> shapeList= new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            shapeList.add(new ShapeWorking().generateRandomShapeClass());
            System.out.println(new ShapeWorking().getShapeInfo(shapeList.get(i)));
        }
        System.out.println("\n\n\n");
        shapeList.sort(new SortShapeByPerimeter());
        for (IShape iShape : shapeList) {
            System.out.println(new ShapeWorking().getShapeInfo(iShape));
        }
    }
}
