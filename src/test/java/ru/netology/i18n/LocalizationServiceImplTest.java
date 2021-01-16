package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

import static org.junit.jupiter.api.Assertions.*;

class LocalizationServiceImplTest {

    @Test
    void locale() {
        //given
        final Country countryArgument = Country.RUSSIA;
        final  String expected = "Добро пожаловать";
        //when
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();
        String realMessage = localizationService.locale(countryArgument);
        Assertions.assertEquals(expected, realMessage);

    }
}