import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestLion {
    Feline feline = new Feline();
    Lion lion = new Lion(feline);

    @Test
    public void testKittens(){
        int expectedCount = 1;
        Assert.assertEquals(expectedCount, lion.getKittens());
    }

    @Test
    public void testFood() throws Exception {
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expectedList, lion.getFood());
    }

    @Test
    public void exceptionSex() throws Exception {
        Lion lion = new Lion("Сам");
        InterruptedException exception = Assert.assertThrows(InterruptedException.class, () -> lion.doesHaveMane());
        Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }
}

