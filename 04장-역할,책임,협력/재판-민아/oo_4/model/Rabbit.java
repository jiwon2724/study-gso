package org.oo_4.model;

import org.oo_4.model.action.Witness;

import java.util.List;

public class Rabbit {
    private final Witnesses witnesses;

    private Rabbit(List<String> witnessNames) {
        this.witnesses = Witnesses.WitnessesFromNames(witnessNames);
    }

    public static Rabbit NewRabbit(List<String> witnessNames) {
        return new Rabbit(witnessNames);
    }


    public Witness bringInWitness(String witnessName) {
        return witnesses.enterTheWitnessStand(witnessName);
    }
}
