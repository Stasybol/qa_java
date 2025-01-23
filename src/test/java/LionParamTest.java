import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestLionParam {
    private final String sex;
    private final boolean hasMane;

    public TestLionParam(String sex, boolean hasMane){
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] setData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
//                {"Сам", false}
        };
    }

    @Test
    public void testSex() throws Exception {
        Lion lion = new Lion(sex);
        Assert.assertEquals(lion.doesHaveMane(), hasMane);
    }
}
