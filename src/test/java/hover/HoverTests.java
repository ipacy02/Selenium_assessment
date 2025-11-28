package hover;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class HoverTests extends BaseTests {

    @Test
    public void testHover() {
        var hoverPage = homePage.clickHover();
        String actualResult = hoverPage.hoverImage(1);
        assertEquals(actualResult,  "Rs. 400");


    }


}
