package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

import static org.junit.jupiter.api.Assertions.*;
import static ru.netology.entity.Country.USA;

class GeoServiceImplTest {

    @Test
    void byIp() {
        //given
        final String argument = "96.44.183.149";
        final Location expectedLocation = new Location("New York", USA, " 10th Avenue", 32);

        GeoServiceImpl geoService = new GeoServiceImpl();
//when
        Location realLocation = geoService.byIp(argument);
        //then
        Assertions.assertEquals(expectedLocation, realLocation);


    }

}