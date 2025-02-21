package org.oo_4.model;

import org.oo_4.model.action.Judge;
import org.oo_4.model.action.Witness;
import org.oo_4.model.role.Position;

public class TrumpHuman extends Trump implements Judge {
    private boolean isStanding;
    private boolean isWalking;
    private Position position;

    private TrumpHuman(Position name) {
        this.isStanding = true;
        this.isWalking = false;
    }

    public static TrumpHuman NewTrumpHuman(Position position) {
        return new TrumpHuman(position);
    }

    @Override
    public void lieProne() {
        this.isLookingUp = false;
        this.isStanding = false;
        this.isWalking = false;
    }

    public void walk() {
        this.isWalking = true;
    }

    @Override
    public Witness orderRabbitToSummonWitness(Rabbit rabbit, String witnessName) {
        return rabbit.bringInWitness(witnessName);
    }

    @Override
    public void orderWitnessToGiveTestimony(Witness witness) {
        witness.giveTestimony();
    }
}
