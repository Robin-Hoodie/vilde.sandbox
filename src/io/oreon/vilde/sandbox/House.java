package io.oreon.vilde.sandbox;

import java.util.ArrayList;
import java.util.List;

public class House {
    private String address;
    private int amountWindows;
    private boolean finished;
    private List<Person> inhabitants;


    public void addInhabitant(Person person){
        this.inhabitants.add(person);
    }

    public House(String address, int amountWindows, boolean finished) {
        this.address = address;
        this.amountWindows = amountWindows;
        this.finished = finished;
        this.inhabitants = new ArrayList<>();

    }

    public String toString(){
        return "Address " + this.address + " amount of windows " + this.amountWindows + " finished? " + this.finished + " who is living in the house? " + this.inhabitants;


    }
}
