package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CityOperationsTest {

    static CityOperations cOperations;
    static ArrayList<Cities> cities;
    static ArrayList<Cities> cities1;
    static CityOperations op;

    @BeforeEach // ka setting tabaw nae same tl @BeforeAll nae same
    void setUp()
    {
        cOperations = new CityOperations();
        cities = new ArrayList<>();
        cities1 = new ArrayList<>();
        //int id,String name,int cid,String code,int state-code,float latitude,float longitude

        cities.add(new Cities(135335, "Airole",  107, "IT",1768, 43.0f, 7.0f));
        cities.add(new Cities(135336, "Airuno",  107, "IT",1705, 45.0f, 9.0f));
        cities.add(new Cities(135337, "Aisone",  107, "IT",1702, 44.0f, 7.0f));
        cities.add(new Cities(141853, "Aistale",  107, "IT",4853, 23.0f, 88.0f));
        cities.add(null);
    }

    @Test
    void connect() {
        op = new CityOperations();
        op.connect();
    }

    @Test
    void getCitesBetween() {
//        ArrayList<Cities> cities = op.getCitesBetween(1,3); //1,2,3 pr lr ml.
//        Cities cities1 = cities.get(1); //arraylist pyn pygg tae khr 0 khnn mhr 1, 1 khnn mhr 2 win ml.
//        assertEquals("Arinsal",cities1.getName(),"are not equal");
    }

    @Test
    void getCitiesbyName() {
    }

    @Test
    void getCitiesbyCountryCode() throws SQLException {
        cOperations.getCitiesbyCountryCode(0);
    }

    @Test
    void display() {
        cOperations.display(null); //arraylist object needed, null is provided
        cOperations.display(cities1);
        cOperations.display(cities);
    }
}