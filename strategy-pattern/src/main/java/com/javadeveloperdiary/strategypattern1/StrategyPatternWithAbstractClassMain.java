package com.javadeveloperdiary.strategypattern1;

import com.javadeveloperdiary.strategypattern1.interfaces.ScoreBoard;
import com.javadeveloperdiary.strategypattern1.models.Balloon;
import com.javadeveloperdiary.strategypattern1.models.Clown;
import com.javadeveloperdiary.strategypattern1.models.SquareBalloon;

public class StrategyPatternWithAbstractClassMain {

    public static void main(String[] args) {
        ScoreBoard scoreBoard = new ScoreBoard();

        System.out.print("Balloon Tap Score:");
        scoreBoard.algorithmBase = new Balloon();
        scoreBoard.showScore(10, 5);

        System.out.print(" Clown Tap score: ");
        scoreBoard.algorithmBase = new Clown();
        scoreBoard.showScore(10, 5);

        System.out.print("Square Balloon score:");
        scoreBoard.algorithmBase = new SquareBalloon();
        scoreBoard.showScore(10, 5);
    }
}
