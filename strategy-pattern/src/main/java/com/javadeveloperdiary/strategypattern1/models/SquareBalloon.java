package com.javadeveloperdiary.strategypattern1.models;

import com.javadeveloperdiary.strategypattern1.interfaces.ScoreAlgorithmBase;

public class SquareBalloon extends ScoreAlgorithmBase {
    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) + 40;
    }
}
