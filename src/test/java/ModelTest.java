import org.junit.Assert;
import static org.hamcrest.CoreMatchers.instanceOf;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import ua.project.homework.homework_2.src.Model;

public class ModelTest extends Assert {

    static Model model = new Model(0, 100);
    static int number;

    @BeforeClass
    public static void before() {
        number = model.GenerateRandomNumber();
        model.setUserNumber(10);
        model.setRadomNumber(50);
    }

    @Test
    public void generateRandomNumberMinTest() {
        Assert.assertTrue(number >= 0);
    }

    @Test
    public void generateRandomNumberMaxTest() {
        Assert.assertTrue(number <= 100);
    }

    @Test
    public void generateRandomNumbeIntTest() {
        Assert.assertThat(number, instanceOf(Integer.class));
    }

    @Test
    public void changeBordersStartTest() {
        model.setUserNumber(10);
        model.changeBorders();
        Assert.assertEquals(model.getStart(), 10);
    }

    @Test
    public void changeBordersEndTest() {
        model.setUserNumber(70);
        model.changeBorders();
        Assert.assertEquals(model.getEnd(), 70);
    }

}
