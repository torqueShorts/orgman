package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    Race race = RaceFactory.buildRace("Black");

    @Test
    public void buildRace() {
        Assert.assertNotNull(race.getRaceId());
        Assert.assertNotNull(race);

    }
}