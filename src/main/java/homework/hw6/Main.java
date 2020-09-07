package homework.hw6;

import homework.hw6.models.City;

import java.sql.*;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.
                getConnection("jdbc:mysql://localhost:3306/sakila?serverTimezone=UTC", "root", "rootroot");

        PreparedStatement preparedStatement = connection.prepareStatement("select * from city");
        ResultSet  resultSet = preparedStatement.executeQuery();
        List<City> cityList = new ArrayList<>();
        while (resultSet.next()) {
            int city_id = resultSet.getInt("city_id");
            String city_name = resultSet.getString("city");
            int country_id = resultSet.getInt(3);
            City city = new City(city_id, city_name, country_id);
            cityList.add(city);

        }
//        System.out.println(cityList);
//        List<City> collect = cityList.stream()
//                .filter(city -> city.getCity_id() > 100 && city.getCity_id() < 150)
//                .collect(Collectors.toList());
//        System.out.println(collect);
//        List<City> collect = cityList.stream()
//                .sorted(Comparator.comparing(City::getCity))
//                .collect(Collectors.toList());
//        System.out.println(collect);
//        List<City> collect = cityList.stream()
//                .sorted(Comparator.comparing(City::getCity_id))
//                .collect(Collectors.toList());
//        System.out.println(collect);
//        List<City> collect = cityList.stream()
//                .sorted(Comparator.comparing(City::getCountry_id))
//                .collect(Collectors.toList());
//        System.out.println(collect);
    }
}
