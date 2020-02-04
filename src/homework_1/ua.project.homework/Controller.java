package homework_1.ua.project.homework;

import java.util.Scanner;

public class Controller {

    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner scan = new Scanner(System.in);
        model.setHello(scanParticularValue(scan, View.HELLO));
        model.setJava(scanParticularValue(scan, View.JAVA));

        view.printResult(model.getHello(), model.getJava());
    }

    public String scanParticularValue(Scanner scan, String strToScan) {
        view.printInvite(strToScan);
        String word = scan.nextLine();

        while (!word.equals(strToScan)) {
            view.printMessage(View.WRONG_INPUT);
            word = scan.nextLine();
        }

        return word;
    }
}
