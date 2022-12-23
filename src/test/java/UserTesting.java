import com.junit.UserEntry;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTesting {
    UserEntry user = new UserEntry();
    @Test
    public void firstNameTest(){
        String firstname="Pranay";
        assertEquals(true,user.firstName(firstname));
    }
    @Test
    public void lastNameTest(){
        String lastname = "Kumar";
        assertEquals(true,user.lastName(lastname));
    }
    @Test
    public void userMailTest(){
        String mail = "abc.xyz@bl.co.in";
        assertEquals(true,user.userEmail(mail));
    }
    @Test
    public void phoneNumberTest(){
        String number = "91 9896895647";
        assertEquals(true,user.userPassword(number));
    }
    @Test
    public void userPasswordTest(){
        String password = "PRANAYCHINNA";
        assertEquals(true,user.userPassword(password));
    }
}
