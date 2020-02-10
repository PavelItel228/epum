package ua.project.homework.homework_2.src;

public class View {
    public static final String INVITE = "Guess the number form %d to %d";
    public static final String WRONG = "Number you enter is wrong.\n";
    public static final String TRIES = "Your tries : ";
    public static final String YOU_WIN = "You guess, number was %d";

    public void printMessage(String... args) {
        for (String arg : args) {
            System.out.print(String.format("%s ", arg));
        }
    }

    public void printInvite(int start, int end) {
        System.out.println(String.format(INVITE, start, end));
    }

    public void printCongratulations(int guessedNumber) {
        System.out.println(String.format(YOU_WIN, guessedNumber));
    }


}
