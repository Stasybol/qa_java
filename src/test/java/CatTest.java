import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestCat {

    Feline feline = new Feline();
    Cat cat = new Cat(feline);

    @Test
    public void testSound(){
        String ex = "Мяу";
        Assert.assertEquals(ex, cat.getSound());
    }

    @Test
    public void testEat() throws Exception {
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expectedList, cat.getFood());
    }

}
