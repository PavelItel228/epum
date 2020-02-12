package ua.project.homework.homework_3.Controller;

import ua.project.homework.homework_3.Model.UserModel;
import ua.project.homework.homework_3.View.View;

import java.util.Scanner;

public class UserService {
    public void processInput(UserModel userModel, View view, Scanner scan) {
        String res;
        view.printMessage(view.getINVITE_NAME(), view.getNAME_REGEX());
        while (!(scan.hasNext() && (res = scan.next()).matches(view.getNAME_REGEX()))) {
            view.printWrongName();
        }
        userModel.setFirstName(res);
        view.printMessage(view.getINVITE_LOGIN(), view.getLOGIN_REGEX());
        while (!(scan.hasNext() && (res = scan.next()).matches(view.getLOGIN_REGEX()))) {
            view.printWrongLogin();
        }
        userModel.setLogin(res);
    }

    public void printUser(UserModel userModel) {
        System.out.println(userModel);
    }
}
