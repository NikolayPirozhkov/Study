

import java.util.ArrayList;
import java.util.List;

/**
 * "Имеется класс Spaceship. Создайте 3 экземпляра. Напишите методы, которые находят:
 * a) среднюю скорость кораблей
 * б) минимальную скорость кораблей
 *
 * Класс Spaceship сохраните в отдельном файле:
 * public class Spaceship {
 *     private int speed;
 *     public Spaceship(int speed) {
 *         this.speed = speed;
 *     }
 *
 *     public int getSpeed() {
 *         return speed;
 *     }
 * }
 *
 * Подсказка
 * Вот так можно создать один экземпляр и передать значение скорости 123:
 * Spaceship s1 = new Spaceship(123);"
 */

public class Main {
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
    public static void main(String[] args) {

    }
}
