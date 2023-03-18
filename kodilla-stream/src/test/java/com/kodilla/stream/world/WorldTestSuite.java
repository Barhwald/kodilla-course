package com.kodilla.stream.world;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Country sweden = new Country("Sweden", BigDecimal.valueOf(12000));
        Country germany = new Country("Germany", BigDecimal.valueOf(60000));
        Country spain = new Country("Spain", BigDecimal.valueOf(50500));

        Continent europe = new Continent(List.of(sweden, spain, germany));

        Country japan = new Country("Japan", BigDecimal.valueOf(24700));
        Country malaysia = new Country("Malaysia", BigDecimal.valueOf(15000));
        Country iran = new Country("Iran", BigDecimal.valueOf(36700));

        Continent asia = new Continent(List.of(japan, malaysia, iran));

        Country venezuela = new Country("Venezuela", BigDecimal.valueOf(45000));
        Country guinea = new Country("Guinea", BigDecimal.valueOf(12000));
        Country uruguay = new Country("Uruguay", BigDecimal.valueOf(39800));

        Continent southAmerica = new Continent(List.of(venezuela, guinea, uruguay));

        World newWorld = new World(List.of(europe, asia, southAmerica));

        //When
        BigDecimal totalPeopleQuantity = newWorld.getPeopleQuantity();
        BigDecimal expected = BigDecimal.valueOf(295700);

        //Then
        assertEquals(expected, totalPeopleQuantity);
    }

}
