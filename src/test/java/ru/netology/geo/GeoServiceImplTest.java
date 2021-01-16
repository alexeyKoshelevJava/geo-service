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

    @Test
    void testByIp() {
        //given
        final String argument = "127.0.0.1";
        final Location expectedLocation = new Location(null, null, null, 0);

        GeoServiceImpl geoService = new GeoServiceImpl();
//when
        Location realLocation = geoService.byIp(argument);
        //then
        Assertions.assertEquals(expectedLocation, realLocation);

    }

    @Test
    void testByIp1() {
        //given
        final String argument = "172.0.32.11";
        final Location expectedLocation = new Location("Moscow", Country.RUSSIA, "Lenina", 15);

        GeoServiceImpl geoService = new GeoServiceImpl();
//when
        Location realLocation = geoService.byIp(argument);
        //then
        Assertions.assertEquals(expectedLocation, realLocation);
    }

    @Test
    void testByIp2() {
        //given
        final String argument = "172.0.00.00";
        final Location expectedLocation = new Location("Moscow", Country.RUSSIA, null, 0);

        GeoServiceImpl geoService = new GeoServiceImpl();
//when
        Location realLocation = geoService.byIp(argument);
        //then
        Assertions.assertEquals(expectedLocation, realLocation);
    }

    @Test
    void testByIp3() {
        //given
        final String argument = "96.00.000.001";
        final Location expectedLocation = new Location("New York", Country.USA, null,  0);

        GeoServiceImpl geoService = new GeoServiceImpl();
//when
        Location realLocation = geoService.byIp(argument);
        //then
        Assertions.assertEquals(expectedLocation, realLocation);
    }
}