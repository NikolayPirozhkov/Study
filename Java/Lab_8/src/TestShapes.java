import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * @author NikolayPirozhkov
 * @project Java
 */
public class TestShapes {
    @Test
    void testShapes(){
        ArrayList<IShape> shapes = new ArrayList<>();
        for (int i = 0; i <10; i++){
            shapes.add(new ShapeWorking().generateRandomShapeClass());
        }

    }

}
