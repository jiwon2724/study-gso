package org.oo_4.model;

import org.oo_4.model.action.Witness;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Witnesses {
    private final List<String> witnessNames;

    private Witnesses(List<String> witnessNames) {
        this.witnessNames = witnessNames;
    }

    public static Witnesses WitnessesFromNames(List<String> witnessNames) {
        return new Witnesses(witnessNames);
    }

    public Witness enterTheWitnessStand(String name) {
        if (this.witnessNames.stream()
                .anyMatch(w -> w.equals(name))) {
            return Person.NewPerson(name).enterTheWitnessStand();
        }
        return null;
    }
}


//    private final List<Witness> witnesses;
//
//    private Witnesses(List<Witness> witnesses) {
//        this.witnesses = witnesses;
//    }
//
//    public static Witnesses fromNames(List<String> names) {
//        Set<String> nonDuplicatedNames = validateDuplicateName(names);
//        List<Witness> witnesses = nonDuplicatedNames.stream()
//                .map(Person::NewPerson)
//                .collect(Collectors.toList());
//
//        return new Witnesses(witnesses);
//    }
//
//    private static Set<String> validateDuplicateName(List<String> names) {
//        return new HashSet<>(names);
//    }