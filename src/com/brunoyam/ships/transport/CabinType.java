package com.brunoyam.ships.transport;

/**
 * Типы кают.
 */
public enum CabinType {
    ECONOM("Эконом", 4, false, 100000),
    STANDARD("Стандарт", 4, true, 170000),
    COMFORT("Комфорт", 2, true, 250000);

    /**
     * Класс каюты.
     */
    private String name;
    /**
     * Количество мест.
     */
    private int seatsNumber;
    /**
     * Наличие окна.
     */
    private boolean window;
    /**
     * Стоимость билета.
     */
    private long cost;

    /**
     * Конструктор.
     * @param name название класса каюты.
     * @param seatsNumber количество мест.
     * @param window наличие окна.
     * @param cost стоимость билета.
     */
    CabinType(String name, int seatsNumber, boolean window, long cost) {
        this.name = name;
        this.seatsNumber = seatsNumber;
        this.window = window;
        this.cost = cost;
    }

    /**
     * Геттер.
     * @return название класса каюты.
     */
    public String getName() {
        return name;
    }

    /**
     * Геттер.
     * @return количество мест.
     */
    public int getSeatsNumber() {
        return seatsNumber;
    }

    /**
     * Геттер.
     * @return наличие окна.
     */
    public boolean isWindow() {
        return window;
    }

    /**
     * Геттер.
     * @return стоимость.
     */
    public long getCost() {
        return cost;
    }

    /**
     * Возвращает название класса каюты.
     * @return описание типа каюты.
     */
    @Override
    public String toString() {
        return name;
    }
}
