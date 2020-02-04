package homework_1.ua.project.homework;

public class View {
    public static final String JAVA = "Java";
    public static final String HELLO = "Hello";
    public static final String PLS_TYPE_WORD = "Please type";
    public static final String WRONG_INPUT = "Wrong input please try again";
    public static final String RESULT = "Result : ";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printResult(String str1, String str2) {
        System.out.println(String.format("%s %s %s", RESULT, str1, str2));
    }

    public void printInvite(String wordToType) {
        System.out.println(String.format("%s '%s' :", PLS_TYPE_WORD, wordToType));
    }
}
