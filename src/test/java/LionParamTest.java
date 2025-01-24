import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParamTest {

    private final String sex;
    private final boolean hasMane;

    public LionParamTest(String sex, boolean hasMane){
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters(name = "Проверка пола: {0} {1}")
    public static Object[][] setData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void testSex() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline, sex);
        Assert.assertEquals("Пол льва неверный", lion.doesHaveMane(), hasMane);
    }

}
