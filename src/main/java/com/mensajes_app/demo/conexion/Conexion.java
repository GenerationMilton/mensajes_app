package com.mensajes_app.demo.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection get_connection() throws SQLException {

    Connection connection=null;
    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes","root","Gomito1831");

    if(connection != null){
        System.out.println("Conexion exitosa");
    } else{
        System.out.println("falla en la Conexion");
    }
        return connection;
    }
}

