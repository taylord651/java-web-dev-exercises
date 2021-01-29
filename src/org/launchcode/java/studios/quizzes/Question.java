package org.launchcode.java.studios.quizzes;

public abstract class Question {

    private Integer points;
    private String question;

    public Question(Integer points, String question) {
        this.points = points;
        this.question = question;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public void displayQuestion() {
        System.out.println(question);
    }

    public abstract void displayAnswers();

    public abstract Integer getAnswers();
}
