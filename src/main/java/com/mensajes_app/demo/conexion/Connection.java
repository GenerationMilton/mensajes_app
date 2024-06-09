package com.mensajes_app.demo.conexion;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {

    public java.sql.Connection get_connection() throws SQLException {

    java.sql.Connection connection=null;
    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes","root","Gomito1831");

    if(connection != null){
        System.out.println("Conexion exitosa");
    } else{
        System.out.println("falla en la Conexion");
    }
        return connection;
    }
}

