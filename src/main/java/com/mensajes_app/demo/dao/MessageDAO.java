package com.mensajes_app.demo.dao;

import com.mensajes_app.demo.conexion.Connection;
import com.mensajes_app.demo.model.Messages;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MessageDAO {

    public static void createMessageDB(Messages messages) throws SQLException {
        Connection dbConnect = new Connection();

        java.sql.Connection connection = dbConnect.get_connection();
        PreparedStatement ps= null;

        String query="INSERT INTO mensajes.mensajes ( message, author_message) VALUES (?,?)";
        ps= connection.prepareStatement(query);
        ps.setString(1,messages.getMessage());
        ps.setString(2, messages.getAuthor_message());
        ps.executeUpdate();
        System.out.println("Mensaje creado");
    }
    public static void readMessageDB(){

    }

    public static void deleteMessageDB(int id_message){

    }

    public static void updateMessageDB(Messages messages){

    }
}
