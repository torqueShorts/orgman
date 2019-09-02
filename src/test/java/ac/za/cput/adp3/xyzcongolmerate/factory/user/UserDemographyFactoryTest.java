package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {

    java.util.Date date = new java.util.Date();

    UserDemography userDemography = UserDemographyFactory.buildUserDemography("email@email.com","title", "123","543", date);


    @Test
    public void buildUserDemography() {
        Assert.assertNotNull(userDemography.hashCode());
        Assert.assertNotNull(userDemography);

    }
}