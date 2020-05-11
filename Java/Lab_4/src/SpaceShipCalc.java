import java.math.BigInteger;
import java.util.List;

/**
 * @author NikolayPirozhkov
 * @project Java
 */
public class SpaceShipCalc {
    public int minSpaceShipSpeed(Iterable<Spaceship> ships){
        int minShipsSpeed = Integer.MAX_VALUE;
        for (var ship:ships){
            if(ship.getSpeed() < minShipsSpeed){
                minShipsSpeed = ship.getSpeed();
            }
        }
        return minShipsSpeed;
    }

    public int avgSpaceShipSpeed(List<Spaceship> ships){
        BigInteger bigInteger = BigInteger.valueOf(0);
        for (var ship:ships){
            bigInteger = bigInteger.add(BigInteger.valueOf(ship.getSpeed()));
        }
        bigInteger = bigInteger.divide(BigInteger.valueOf(ships.size()));
        return bigInteger.intValue();
    }
}
