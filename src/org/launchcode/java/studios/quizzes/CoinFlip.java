package org.launchcode.java.studios.quizzes;

public class CoinFlip extends Question {

    private Boolean correctAnswer;

    public CoinFlip(Integer points, String question, Boolean correctAnswer){
        super(points, question);
        this.correctAnswer = correctAnswer;

    }

    @Override
    public void displayAnswers() {

    }

    @Override
    public Integer getAnswers() {
        return null;
    }
}
