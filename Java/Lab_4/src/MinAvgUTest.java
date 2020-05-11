import org.junit.jupiter.api.DynamicTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author NikolayPirozhkov
 * @project Java
 */
class MinAvgUTest {

    @org.junit.jupiter.api.Test
    void minSpaceShipSpeed() {
        ArrayList<Spaceship> spaceships = new ArrayList<>();
        SpaceShipCalc spaceShipCalc = new SpaceShipCalc();
        Random random = new Random();
        for(int i = 0; i < 10; i++){
            spaceships.add(new Spaceship(Math.abs(random.nextInt(100000))));
        }
        System.out.println(spaceShipCalc.avgSpaceShipSpeed(spaceships));
    }

    @org.junit.jupiter.api.Test
    void avgSpaceShipSpeed() {
    }
}