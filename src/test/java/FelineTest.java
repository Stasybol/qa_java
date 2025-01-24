import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void testEat() throws Exception {
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals("Список еды неправильный", expectedList, feline.eatMeat());
    }

    @Test
    public void testFamily() {
        String family = "Кошачьи";
        Assert.assertEquals("Это семейство называется кошачьи", family, feline.getFamily());
    }

    @Test
    public void testKittens() {
        int expectedCount = 1;
        Assert.assertEquals("Количество котят неверно", expectedCount, feline.getKittens());
    }

    @Test
    public void testKittensWithParameter() {
        int expectedCount = 2;
        Assert.assertEquals("Количество котят неверно", expectedCount, feline.getKittens(expectedCount));
    }
}
