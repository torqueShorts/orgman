package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import org.junit.Assert;
import org.junit.Test;

public class GenderFactoryTest {

    Gender gender = GenderFactory.buildGender("Male");

    @Test
    public void buildGender() {
        Assert.assertNotNull(gender.getGenderId());
        Assert.assertNotNull(gender);

    }
}