package org.oo_4.model.action;

import org.oo_4.model.Rabbit;

public interface Judge {
    Witness orderRabbitToSummonWitness(Rabbit rabbit, String witnessName);
    void orderWitnessToGiveTestimony(Witness witness);
}
