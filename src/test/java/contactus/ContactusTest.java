package contactus;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ContactUs;
import pages.PopUpMessage;

import static org.testng.AssertJUnit.assertEquals;

public class ContactusTest extends BaseTests {

    @Test
    public void testContact() {
        ContactUs contactUs = homePage.clickContactLink();
        contactUs.setNameField("Pacifique");
        contactUs.setEmailField("ipacy02@gmial.com");
        contactUs.setSubject("Physic");
        contactUs.setMessage("we are going ther");
        contactUs.clickUploadFile("C:/Users/deeplight tech/Desktop/ZIPLINE/MANIRAMPA PACIFIQUE - Application letter.pdf");

        PopUpMessage popUpMessage = contactUs.clickSubmit();

        String aleertOk = popUpMessage.getAlertTextAndAccept();

        assertEquals(aleertOk, "Press OK to proceed!");


    }

}



