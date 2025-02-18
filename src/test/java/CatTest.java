import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;


    @Test
    public void testSound(){
        Cat cat = new Cat(feline);
        String expectedSound = "Мяу";
        Assert.assertEquals("Кот должен говорить мяу", expectedSound, cat.getSound());
    }

    @Test
    public void testEat() throws Exception {
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectedList);

        Cat cat = new Cat(feline);
        Assert.assertEquals("Список еды неправильный", expectedList, cat.getFood());
    }

}
