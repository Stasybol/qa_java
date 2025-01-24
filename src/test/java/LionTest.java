import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void testKittens() throws Exception {
        int expectedCount = 1;
        Mockito.when(feline.getKittens()).thenReturn(expectedCount);

        Lion lion = new Lion(feline, "Самец");
        Assert.assertEquals("Количество котят неверно", expectedCount, lion.getKittens());
    }

    @Test
    public void testFood() throws Exception {
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedList);

        Lion lion = new Lion(feline, "Самец");
        Assert.assertEquals("Список еды неправильный", expectedList, lion.getFood());
    }

    @Test
    public void exceptionSex(){
        Exception exception = Assert.assertThrows(Exception.class, () -> new Lion(feline, "Альфа-самец"));
        String expectedException = "Используйте допустимые значения пола животного - самец или самка";
        Assert.assertEquals(expectedException, exception.getMessage());
    }
}


