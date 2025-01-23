import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestFeline {

    Feline feline = new Feline();

    @Test
    public void testEat() throws Exception {
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expectedList, feline.eatMeat());
    }

    @Test
    public void testFamily() {
        String family = "Кошачьи";
        Assert.assertEquals(family, feline.getFamily());
    }

    @Test
    public void testKittens() {
        int expectedCount = 1;
        Assert.assertEquals(expectedCount, feline.getKittens(expectedCount));
        Assert.assertEquals(expectedCount, feline.getKittens());
    }
}
