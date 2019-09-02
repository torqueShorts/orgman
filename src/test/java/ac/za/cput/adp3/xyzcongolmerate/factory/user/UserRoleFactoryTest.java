package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRoleFactoryTest {

    UserRole userRole = UserRoleFactory.buildUserRole("RD2398", "email@email.com","role3232");

    @Test
    public void buildUserRole() {
        Assert.assertNotNull(userRole.hashCode());
        Assert.assertNotNull(userRole);

    }
}