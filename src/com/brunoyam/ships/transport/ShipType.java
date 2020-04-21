package com.brunoyam.ships.transport;

/**
 * Классы кораблей.
 */
public enum ShipType {

    BOAT("Шлюпка", 0, 1, 4),
    CARAVEL("Каравелла", 10, 8, 4),
    FREGATE("Фрегат", 20, 15, 5);

    /**
     * Название класса корабля.
     */
    private String name;
    /**
     * Количество кают комфорт-класса.
     */
    private int comfortCabinsNumber;
    /**
     * Количество стандартных кают.
     */
    private int standardCabinsNumber;
    /**
     * Количество кают эконом-класса.
     */
    private int economCabinsNumber;

    /**
     * Конструктор.
     * @param name название класса корабля.
     * @param comfortCabinsNumber количество кают комфорт-класса.
     * @param standardCabinsNumber количество стандартных кают.
     * @param economCabinsNumber количество кают эконом-класса.
     */
    ShipType(String name, int comfortCabinsNumber, int standardCabinsNumber, int economCabinsNumber) {
        this.name = name;
        this.comfortCabinsNumber = comfortCabinsNumber;
        this.standardCabinsNumber = standardCabinsNumber;
        this.economCabinsNumber = economCabinsNumber;
    }

    /**
     * Геттер.
     * @return название класса кораблей.
     */
    public String getName() {
        return name;
    }

    /**
     * Геттер.
     * @return количество кают комфорт-класса.
     */
    public int getComfortCabinsNumber() {
        return comfortCabinsNumber;
    }

    /**
     * Геттер.
     * @return количество стандартных кают.
     */
    public int getStandardCabinsNumber() {
        return standardCabinsNumber;
    }

    /**
     * Геттер.
     * @return количество кают эконом-класса.
     */
    public int getEconomCabinsNumber() {
        return economCabinsNumber;
    }

    /**
     * Возвращает название класса кораблей.
     * @return описание класса кораблей.
     */
    @Override
    public String toString() {
        return name;
    }
}
