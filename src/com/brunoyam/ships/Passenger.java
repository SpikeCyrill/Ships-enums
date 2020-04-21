package com.brunoyam.ships;

/**
 * Пассажир.
 */
public class Passenger {

    /**
     * Имя.
     */
    private String name;
    /**
     * Фамилия.
     */
    private String surname;
    /**
     * Номер документа, удостоверяющего личность.
     */
    private final String docNumber;

    /**
     * Конструктор для безымянного пассажира.
     * @param docNumber номер документа, удостоверяющего личность.
     */
    public Passenger(String docNumber) {
        this.docNumber = docNumber;
    }

    /**
     * Геттер.
     * @return имя пасажира.
     */
    public String getName() {
        return name;
    }

    /**
     * Геттер.
     * @return фамилия пассажира.
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Геттер.
     * @return номер документа, удостоверяющего личность.
     */
    public String getDocNumber() {
        return docNumber;
    }

    /**
     * Возвращает описание пассажира, содержащее значения всех заполненных полей.
     * @return
     */
    @Override
    public String toString() {
        String description = "Passenger{";
        if (name != null) {
            description = description + "name='" + name + "\', ";
        }
        if (surname != null) {
            description = description + "surname='" + surname + "\', ";
        }
        if (docNumber != null) {
            description = description + "docNumber='" + docNumber + "\',";
        }
        description = description.substring(0, description.length() - 2);
        description = description + '}';

        return description;
    }
}
