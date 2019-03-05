package io.oreon.vilde.sandbox;

public class Main {

    public static void main(String[] args) {
        Person vilde = new Person("Vilde", "Oyen", 27, 170);
        Person robin = new Person("Robin", "Hellemans", 27, 188);
        Person tine = new Person("Tine", "Oyen", 56, 183);
        House tinesHouse = new House("Bergsalleen 16", 10,true);
        tinesHouse.addInhabitant(tine);
        tinesHouse.addInhabitant(robin);
        tinesHouse.addInhabitant(vilde);
        System.out.println(vilde);
        System.out.println(tinesHouse);


    }
}
