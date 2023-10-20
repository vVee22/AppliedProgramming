package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.ArrayList;

import static org.example.CityOperationsTest.cOperations;
import static org.junit.jupiter.api.Assertions.*;

class CityOperationsTestIT {

    static CityOperations cop;

    @BeforeAll
    static void init()
    {
        cop = new CityOperations();
        cop.connect();
    }

    @Test
    void getCitesBetween() throws SQLException { //error takhu khu tt yin java yae runtime system ka htote pay phoh throws htae
        ArrayList<Cities> cities = cop.getCitesBetween(1, 5);
        Cities city = cities.get(cities.size()-1);
        assertEquals("Encamp", city.getName()); //hote ma hote sit dr
    }

    @Test
    void getCitiesbyName() throws SQLException{
        ArrayList<Cities> cities = cop.getCitiesbyName("Mu");
        Cities city = cities.get(0);
        assertEquals("Murbaḩ", city.getName());

    }

    @Test
    void getCitiesbyCountryCode() throws Exception{
        ArrayList<Cities> cities = cop.getCitiesbyCountryCode(0);
        cop.display(cities);
        cities = cop.getCitiesbyCountryCode(11);
        for(Cities c:cities)
            System.out.println(c);
        Cities c2 = cities.get(cities.size()-1);
        System.out.println(c2.getName());
        assertEquals("Abra Pampa", c2.getName());
    }
}