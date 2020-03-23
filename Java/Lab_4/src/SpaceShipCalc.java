import java.util.List;

/**
 * @author NikolayPirozhkov
 * @project Java
 */
public class SpaceShipCalc {
    public int minSpaceShipSpeed(List<Spaceship> ships){
        int minShipsSpeed = Integer.MAX_VALUE;
        for (var ship:ships){
            if(ship.getSpeed() < minShipsSpeed){
                minShipsSpeed = ship.getSpeed();
            }
        }
        return minShipsSpeed;
    }

    public int avgSpaceShipSpeed(List<Spaceship> ships){

        int sumForAvg = 0;
        for (var ship:ships){
            sumForAvg += ship.getSpeed();
        }
        return sumForAvg/ships.size();
    }
}
