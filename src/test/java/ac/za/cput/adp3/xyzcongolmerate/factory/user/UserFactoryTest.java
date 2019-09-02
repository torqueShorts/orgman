package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {

    User user = UserFactory.buildUser("email@email.com","Chad","Wyngaard");

    @Test
    public void buildUser() {
        Assert.assertNotNull(user.getUserEmail());
        Assert.assertNotNull(user);

    }
}