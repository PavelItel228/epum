package ua.project.homework.homework_3.View;

import lombok.Getter;
import lombok.Setter;

import java.io.File;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.ResourceBundle;

@Getter
@Setter
public class View {
    private final String NAME_REGEX;
    private final String LOGIN_REGEX;
    private final String INVITE_NAME;
    private final String INVITE_LOGIN;
    private final String WRONG_INPUT;


    public View() throws UnsupportedEncodingException {
        //Locale.setDefault(new Locale("en"));
        Locale.setDefault(new Locale("ua"));
        ResourceBundle bundle = ResourceBundle.getBundle("messages");
        NAME_REGEX = new String(bundle.getString("name.regexp").getBytes(StandardCharsets.ISO_8859_1),
                StandardCharsets.UTF_8);
        LOGIN_REGEX = new String(bundle.getString("login.regexp").getBytes(StandardCharsets.ISO_8859_1),
                StandardCharsets.UTF_8);
        INVITE_LOGIN = new String(bundle.getString("input.login.invite").getBytes(StandardCharsets.ISO_8859_1),
                StandardCharsets.UTF_8);
        INVITE_NAME = new String(bundle.getString("input.name.invite").getBytes(StandardCharsets.ISO_8859_1),
                StandardCharsets.UTF_8);
        WRONG_INPUT = new String(bundle.getString("input.wrong").getBytes(StandardCharsets.ISO_8859_1),
                StandardCharsets.UTF_8);
    }

    public void printMessage(String... args) {
        for (String arg : args) {
            System.out.print(String.format("%s ", arg));
        }
    }

    public void printWrongName() {
        System.out.println(WRONG_INPUT + " " + INVITE_NAME + " " + NAME_REGEX);
    }
    public void printWrongLogin() {
        System.out.println(WRONG_INPUT +" " + INVITE_LOGIN + " " + LOGIN_REGEX);
    }
}
