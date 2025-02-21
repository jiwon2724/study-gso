package org.oo_4.model;

import org.oo_4.model.action.Witness;

public class Person implements Witness {

    private String name;

    private Person(String name) {
        this.name = name;
    }

    public static Person NewPerson(String name) {
        return new Person(name);
    }

    @Override
    public Witness enterTheWitnessStand() {
        return this;
    }


    @Override
    public void giveTestimony() {
    }
}
