package com.mursey.gpacalculator.enums;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Note {
    AA(4),
    BA(3.5),
    BB(3),
    CB(2.5),
    CC(2),
    DC(1.5),
    DD(1),
    FF(0);

    private double coefficient;

    Note(double coefficient) {
        this.coefficient = coefficient;
    }


    public double getCoefficient() {
        return coefficient;
    }

    public List<String> getAllNotes(){
        return Stream.of(Note.values())
                .map(Note::name)
                .collect(Collectors.toList());
    }

}
