package com.brunoyam.ships.transport;

import com.brunoyam.ships.Passenger;

import java.util.Arrays;

/**
 * Корабль.
 */
public class Ship {

    /**
     * Класс корабля.
     */
    private final ShipType type;
    /**
     * Список кают.
     */
    private Cabin[] cabins;

    /**
     * Конструктор.
     * @param type класс корабля.
     */
    public Ship(ShipType type) {
        this.type = type;
        int cabinsNumber = type.getComfortCabinsNumber()
                + type.getStandardCabinsNumber()
                + type.getEconomCabinsNumber();

        cabins = new Cabin[cabinsNumber];

        int i = 0;
        while(i < type.getEconomCabinsNumber()) {
            cabins[i] = new Cabin(CabinType.ECONOM);
            i++;
        }
        while (i < type.getEconomCabinsNumber() + type.getStandardCabinsNumber()) {
            cabins[i] = new Cabin(CabinType.STANDARD);
            i++;
        }
        while (i < cabinsNumber) {
            cabins[i] = new Cabin(CabinType.COMFORT);
            i++;
        }
    }

    /**
     * Добавляет пассажира если есть свободное место в каюте нужного класса.
     * @param cabinType класс каюты.
     * @param passenger пассажир.
     * @return <code>true</code> если удля пассажира нашлось свободное место, <code>false</code> если все места в
     * каютах требуемого класса заняты.
     */
    public boolean addPassenger(CabinType cabinType, Passenger passenger) {
        for(Cabin cabin : cabins) {
            if(cabin.getType() == cabinType
                && cabin.addPassenger(passenger)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Возвращает описание корабля со списком кают.
     * @return описание корабля.
     */
    @Override
    public String toString() {
        return "Ship{" +
                "type=" + type +
                ", cabins=" + Arrays.toString(cabins) +
                '}';
    }
}
