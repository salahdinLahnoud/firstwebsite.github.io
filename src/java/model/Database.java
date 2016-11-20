/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;

/**
 *
 * @author salahdin
 */
public class Database {

    private Connection connection;
    private Statement statment;
    
  

    public Database() {

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();

        } catch (Exception esception) {
            throw new SecurityException(esception);

        }
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "");
            connection.setAutoCommit(true);
            statment = (Statement) connection.createStatement();

        } catch (Exception exception) {

            throw new SecurityException(exception);
        }

    }

    public ResultSet executSelect(String select) throws SQLException {
        return statment.executeQuery(select);

    }

    public void executDML(String DML) throws SQLException {

        statment.executeUpdate(DML);
    }

    public void close() {

        try {
            statment.close();
            connection.close();

        } catch (Exception e) {
            throw new SecurityException(e);
        }
    }
}
