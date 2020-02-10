package ua.project.homework.homework_1;

public class View {
    public static final String JAVA = "Java";
    public static final String HELLO = "Hello";
    public static final String PLS_TYPE_WORD = "Please type";
    public static final String WRONG_INPUT = "Wrong input please try again \n";
    public static final String RESULT = "Result : ";

    public void printMessage(String... args) {
        for (String arg : args) {
            System.out.print(String.format("%s ", arg));
        }
    }

    public void printResult(String str1, String str2) {
        System.out.println(String.format("%s %s %s", RESULT, str1, str2));
    }

    public void printInvite(String wordToType) {
        System.out.println(String.format("%s '%s' :", PLS_TYPE_WORD, wordToType));
    }
}
