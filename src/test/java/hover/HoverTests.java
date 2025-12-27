package hover;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
public class HoverTests extends BaseTests {

    @Test
    public void testHover() {

     String actualResult = homePage.clickCart(5);
        assertEquals(actualResult, "Added!","Something went wrong");

    }
}
