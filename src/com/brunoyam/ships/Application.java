package com.brunoyam.ships;

import com.brunoyam.ships.transport.CabinType;
import com.brunoyam.ships.transport.Ship;
import com.brunoyam.ships.transport.ShipType;

/**
 * Странный пример с перечислениями
 */
public class Application {

    /**
     * Главный метод - создаем корабль и наполняем пассажирами.
     * @param args
     */
    public static void main(String[] args) {
        Ship boat = new Ship(ShipType.BOAT);
        addPassengerToShip(boat, CabinType.ECONOM, new Passenger("112233"));
        addPassengerToShip(boat, CabinType.COMFORT, new Passenger("332211"));
        addPassengerToShip(boat, CabinType.STANDARD, new Passenger("12345"));
        addPassengerToShip(boat, CabinType.STANDARD, new Passenger("12346"));
        addPassengerToShip(boat, CabinType.STANDARD, new Passenger("12347"));
        addPassengerToShip(boat, CabinType.STANDARD, new Passenger("12348"));
        addPassengerToShip(boat, CabinType.STANDARD, new Passenger("12349"));

        System.out.println(boat);
    }

    /**
     * Пытаемся разместить пассажира на борту корабля и выводим в консоль результат.
     * @param ship корабль
     * @param cabinType тип каюты
     * @param passenger пассажир
     */
    private static void addPassengerToShip(Ship ship, CabinType cabinType, Passenger passenger) {
        if (ship.addPassenger(cabinType, passenger)) {
            System.out.println("Билет продан");
        } else {
            System.out.println("На корабле нет свободных мест класса " + cabinType);
        }
    }
}
