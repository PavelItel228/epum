package ua.project.homework.homework_3;

import ua.project.homework.homework_3.View.View;
import ua.project.homework.homework_3.Controller.Controller;
import ua.project.homework.homework_3.Model.UserModel;

import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Controller controller = new Controller(new UserModel(), new View());
        controller.processUser();
    }
}
