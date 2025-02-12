package org.oo_4.service;

import org.oo_4.model.Rabbit;
import org.oo_4.model.action.Judge;
import org.oo_4.model.action.Witness;

import java.util.List;

public class TrialService {

    private static final TrialService instance = new TrialService();

    public static TrialService getInstance() {
        return instance;
    }

    public void startJudgment(Judge judge, Rabbit rabbit, List<String> witnessNames) {
        for (String witnessName : witnessNames) {
            Witness witness = judge.orderRabbitToSummonWitness(rabbit, witnessName);
            judge.orderWitnessToGiveTestimony(witness);
        }
    }
}
