package ru.timokhina.lesson8;

public class Object {
    private static int objCount = 0;
    private final int numberObject;

    public Object() {
        objCount++;
        this.numberObject = countAdd();

    }
    public static int countAdd() {
            return objCount;
    }

    public int getNumberObject() {
        return numberObject;
    }
}
