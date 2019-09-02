package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {

    OrganisationUser organisationUser = OrganisationUserFactory.buildOrganisationUser("OrgCode","email@email.com");

    @Test
    public void buildOrganisationUser() {

//      Testing to see if a hashcode has been made

        Assert.assertNotNull(organisationUser.hashCode());
        Assert.assertNotNull(organisationUser);

    }
}