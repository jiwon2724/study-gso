package org.oo_4.controller;

import org.oo_4.model.Rabbit;
import org.oo_4.model.TrumpHuman;
import org.oo_4.model.role.Position;
import org.oo_4.service.TrialService;

import java.util.ArrayList;
import java.util.List;

import static org.oo_4.model.Rabbit.NewRabbit;
import static org.oo_4.model.TrumpHuman.NewTrumpHuman;


public class TrialController {
    private static final TrialService trialService = TrialService.getInstance();

    public void createTrial() {
        List<String> witnessNames = new ArrayList<>(List.of("MadHatter", "Alice"));
        TrumpHuman judge = NewTrumpHuman(Position.KING);
        Rabbit rabbit = NewRabbit(witnessNames);

        trialService.startJudgment(judge, rabbit, witnessNames);
    }
}
