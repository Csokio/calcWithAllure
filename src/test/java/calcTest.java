import io.qameta.allure.*;
import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Epic("Epic 1")
public class calcTest {


    @Test
    @Story("User Story1")
    @Description("Description related to testAdd test")
    @Severity(SeverityLevel.NORMAL)
    @Tag("Tag 1")
    @Link("https://example.org")
    public void testAdd()
    {
        Calculator calc = new Calculator();

        Assertions.assertEquals(5,calc.Add(2,3));

    }

   /* @Step("Calculator initialization")
    private Calculator createCalc(){
        return new Calculator();
    }*/


    @Test
    @Story("User Story2")
    @Description("Description related to testAddWithNegative test")
    @Severity(SeverityLevel.BLOCKER)
    @Tag("Tag 2")
    public void testAddWithNegative()
    {
        Calculator calc = new Calculator();

        Assertions.assertEquals(-5, calc.Add(-2,-3));
    }
}