package com.mensajes_app.demo.dao;

import com.mensajes_app.demo.conexion.Connection;
import com.mensajes_app.demo.model.Messages;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MessageDAO {

    public static void createMessageDB(Messages messages) throws SQLException {
        Connection dbConnect = new Connection();

        java.sql.Connection connection = dbConnect.get_connection();
        PreparedStatement ps= null;

        String query="INSERT INTO mensajes.mensajes ( message, author_message, date_message) VALUES (?,?,?)";
        ps= connection.prepareStatement(query);
        ps.setString(1,messages.getMessage());
        ps.setString(2, messages.getAuthor_message());
        ps.setString(3,messages.getDate_message());
        ps.executeUpdate();
        System.out.println("Mensaje creado");
    }
    public static void readMessageDB() throws SQLException {
        Connection dbConnect = new Connection();

        PreparedStatement ps=null;
        ResultSet rs=null;

        java.sql.Connection conection = dbConnect.get_connection();
        String query= "SELECT*FROM mensajes.mensajes";
        ps=conection.prepareStatement(query);
        rs=ps.executeQuery();

        while(rs.next()){
            System.out.println("ID: "+ rs.getInt("id_message"));
            System.out.println("Message: "+ rs.getString("message"));
            System.out.println("Author: "+ rs.getString("author_message"));
            System.out.println("Fecha: "+ rs.getString("date_message"));
            System.out.println("");
        }

    }

    public static void deleteMessageDB(int id_message) throws SQLException {
            Connection dbConnect = new Connection();

            java.sql.Connection connection= dbConnect.get_connection();
            PreparedStatement ps=null;

            String query = "DELETE FROM mensajes WHERE id_message= ? ";
            ps=connection.prepareStatement(query);
            ps.setInt(1, id_message);
            ps.executeUpdate();
            System.out.println("el mensaje ha sido borrado");

    }

    public static void updateMessageDB(Messages messages) throws SQLException {

        Connection dbConnect = new Connection();

        java.sql.Connection connetion= dbConnect.get_connection();
        PreparedStatement ps=null;

        String query= "UPDATE mensajes SET message = ? WHERE id_message = ? ";
        ps=connetion.prepareStatement(query);
        ps.setString(1, messages.getMessage());
        ps.setInt(2,messages.getId_message());
        ps.executeUpdate();
        System.out.println("El mensaje se actualizó correctamente");
    }
}
