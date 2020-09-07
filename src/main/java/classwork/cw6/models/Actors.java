package classwork.cw6.models;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Actors {
    private int actor_id;
    private String first_name;
    private String last_name;
    private Date last_update;
    private Connection connection;
    private MyConnection myConnection = new MyConnection();
    private static List<Actors> actorsList = new ArrayList();
    private PreparedStatement preparedStatement;

    public Actors() throws SQLException {
        this.connection = myConnection.getConection();
        this.preparedStatement = connection.prepareStatement("select * from actor");
    }

    public Actors(int actor_id, String first_name, String last_name, Date last_update, Connection connection, MyConnection myConnection) throws SQLException {
        this.actor_id = actor_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.last_update = last_update;
        this.connection = connection;
        this.myConnection = myConnection;
    }

    public Actors(int actor_id, String first_name, String last_name, Date last_update) throws SQLException {
    }

    public void UpdateActor() throws SQLException {
        ResultSet  resultSet = preparedStatement.executeQuery();
        System.out.println(resultSet);
        while (resultSet.next()) {
            actorsList.add(
                    new Actors(
                            resultSet.getInt("actor_id"),
                            resultSet.getString("first_name"),
                            resultSet.getString("last_name"),
                            resultSet.getDate("last_update")
                    )
            );
        }
        resultSet.close();
        connection.close();
        System.out.println(actorsList);

    }
    

    public int getActor_id() {
        return actor_id;
    }

    public void setActor_id(int actor_id) {
        this.actor_id = actor_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public MyConnection getMyConnection() {
        return myConnection;
    }

    public void setMyConnection(MyConnection myConnection) {
        this.myConnection = myConnection;
    }

    @Override
    public String toString() {
        return "Actors{" +
                "actor_id=" + actor_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", last_update=" + last_update +
                ", connection=" + connection +
                ", myConnection=" + myConnection +
                '}';
    }
}
