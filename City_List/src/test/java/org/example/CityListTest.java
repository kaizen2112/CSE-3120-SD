package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CityListTest {
    private CityList cityList = new CityList();

    private City city1  =new City("Hazaribag","Dhaka");
    private City city2  =new City("Teligati","Khulna");


    @Test
    public void testDelete() {
        cityList.add(city1);
        cityList.add(city2);
        cityList.delete(city1);
        List<City> newCities = cityList.getCities();
        assertEquals(1,newCities.size());
        assertEquals(city2,newCities.get(0));

    }

    @Test
    public void testDeleteException() {
        cityList.add(city1);
        cityList.add(city2);
        assertThrows(IllegalArgumentException.class, () -> cityList.delete(new City("Doulatpur","Khulna")));
    }

    @Test
    public void testCount() {
        cityList.add(city1);
        cityList.add(city2);
        assertEquals(2, cityList.count());
    }

    @Test
    public void testSort() {
        cityList.add(city1);
        cityList.add(city2);
        List<City> cities = cityList.getCities();
        assertEquals(city1,cities.get(0));
        assertEquals(city2,cities.get(1));
    }
}
