package homework.hw6.models;

import java.util.Objects;

public class City {
    private int city_id;
    private String city;
    private int country_id;

    public City(){}

    public City(int city_id, String city, int country_id) {
        this.city_id = city_id;
        this.city = city;
        this.country_id = country_id;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return city_id == city1.city_id &&
                country_id == city1.country_id &&
                Objects.equals(city, city1.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city_id, city, country_id);
    }

    @Override
    public String toString() {
        return "City{" +
                "city_id=" + city_id +
                ", city='" + city + '\'' +
                ", country_id=" + country_id +
                '}';
    }
}
