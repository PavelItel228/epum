package ua.project.homework.homework_2.src;

import java.util.ArrayList;

public class Model {
    private int start;
    private int end;
    private int radomNumber;
    private int userNumber;
    private ArrayList<Integer> tries;
    private int tryCount;

    public Model(int start, int end) {
        this.start = start;
        this.end = end;
        radomNumber = GenerateRandomNumber();
        tries = new ArrayList<Integer>();
    }

    public int GenerateRandomNumber() {
        return (int) (Math.random() * ((end - start + 1) + start));
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public int getRadomNumber() {
        return radomNumber;
    }

    public void setRadomNumber(int radomNumber) {
        this.radomNumber = radomNumber;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }

    public ArrayList<Integer> getTries() {
        return tries;
    }

    public void setTries(ArrayList<Integer> tries) {
        this.tries = tries;
    }

    public int getTryCount() {
        return tryCount;
    }

    public void setTryCount(int tryCount) {
        this.tryCount = tryCount;
    }

    public void addTry(int number) {
        tries.add(number);
    }

    public boolean isGuessed() {
        return radomNumber == userNumber;
    }

    public void changeBorders() {
        if (userNumber >= start && userNumber <= radomNumber) {
            start = userNumber;
        } else {
            end = userNumber;
        }
    }

}