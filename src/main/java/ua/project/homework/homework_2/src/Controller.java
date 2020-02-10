package ua.project.homework.homework_2.src;

import java.util.Scanner;

public class Controller {

    private final Model model;
    private final View view;


    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

    }

    public void processUser() {
        System.out.println(model.getRadomNumber());
        Scanner scan = new Scanner(System.in);
        while(!model.isGuessed()){
            model.setUserNumber(userInput(scan));
            model.changeBorders();
            model.addTry(model.getUserNumber());
        }
        view.printCongratulations(model.getRadomNumber());
        view.printMessage(View.TRIES + model.getTries().toString());
    }

    public int userInput(Scanner scanner) {
        view.printInvite(model.getStart(), model.getEnd());
        while (true) {
            while (!scanner.hasNextInt()) {
                view.printMessage(View.WRONG);
                view.printInvite(model.getStart(), model.getEnd());
                scanner.next();
            }
            int enteredInt = scanner.nextInt();
            if (enteredInt > model.getStart() && enteredInt < model.getEnd()) {
                return enteredInt;
            }
            view.printMessage(View.WRONG);
            view.printInvite(model.getStart(), model.getEnd());
        }
    }



}
