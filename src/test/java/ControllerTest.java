import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import ua.project.homework.homework_2.src.Controller;
import ua.project.homework.homework_2.src.Model;
import ua.project.homework.homework_2.src.View;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class ControllerTest extends Assert {

    static Model model = new Model(0, 100);
    static View view = new View();
    static Controller controller = new Controller(model, view);
    static int number;

    @Test
    public void userInputTest() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("55".getBytes());
        System.setIn(in);
        Scanner scan = new Scanner(System.in);
        Assert.assertEquals(controller.userInput(scan), 55);
        System.setIn(sysInBackup);
    }

    @Ignore
    @Test
    public void userInputIncorrectTest() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("aaa".getBytes());
        System.setIn(in);
        Scanner scan = new Scanner(System.in);
        controller.processUser();
        Assert.assertTrue(System.out.toString().contains("Number you enter is wrong."));
        System.setIn(sysInBackup);
    }

}
