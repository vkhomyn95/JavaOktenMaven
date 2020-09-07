package classwork.cw6.models;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.Objects;

public class MyConnection {
    private Connection conection;
    private String password = "rootroot";
    private String login = "root";

    public MyConnection() throws SQLException {
        this.conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila?serverTimezone=UTC", login, password);;
    }

    public Connection getConection() {
        return conection;
    }

    public void setConection(Connection conection) {
        this.conection = conection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyConnection that = (MyConnection) o;
        return Objects.equals(conection, that.conection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conection);
    }

    @Override
    public String toString() {
        return "JDBCConnection{" +
                "conection=" + conection +
                '}';
    }
}
