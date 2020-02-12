package ua.project.homework.homework_3.Controller;

import lombok.AllArgsConstructor;
import ua.project.homework.homework_3.Model.UserModel;
import ua.project.homework.homework_3.View.View;

import java.util.Scanner;

@AllArgsConstructor
public class Controller {

    private UserModel userModel;
    private View view;

    public Controller(UserModel userModel, View view) {
        this.userModel = userModel;
        this.view = view;
    }

    private UserService userService = new UserService();



    public void processUser() {
        Scanner scan = new Scanner(System.in);
        userService.processInput(userModel,view, scan);
        userService.printUser(userModel);
    }
}
