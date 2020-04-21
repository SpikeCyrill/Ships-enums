package com.brunoyam.ships.transport;

import com.brunoyam.ships.Passenger;

/**
 * Каюта.
 */
public class Cabin {

    /**
     * Пассажиры, размещенные в этом купе.
     */
    private Passenger[] passengers;
    /**
     * Тип каюты.
     */
    private final CabinType type;

    /**
     * Конструктор.
     * @param type тип каюты.
     */
    public Cabin(CabinType type) {
        this.type = type;
        passengers = new Passenger[type.getSeatsNumber()];
    }

    /**
     * Геттер.
     * @return тип каюты.
     */
    public CabinType getType() {
        return type;
    }

    /**
     * Если есть свободное место, добавляет на него пассажира.
     * @param passenger пассажир.
     * @return <code>true</code> если удалось найти свободное место, <code>false</code> если свободных мест не нашлось.
     */
    public boolean addPassenger(Passenger passenger) {
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] == null) {
                passengers[i] = passenger;
                return true;
            }
        }
        return false;
    }

    /**
     * Возвращает описание кабины со списком пассажиров.
     * @return описание кабины.
     */
    @Override
    public String toString() {
        String passengerString = "passengers=[";
        for (Passenger passenger : passengers) {
            if (passenger != null) {
                passengerString = passengerString + passenger + ", ";
            }
        }
        passengerString = passengerString.substring(0, passengerString.length() - 2) + "]";
        return "Cabin{" +
                "type=" + type +
                ", " + passengerString +
                '}';
    }
}
