package com.mensajes_app.demo.service;

import com.mensajes_app.demo.dao.MessageDAO;
import com.mensajes_app.demo.model.Messages;

import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class MessageService {

    public static void createMessage() throws SQLException {
        Scanner sc= new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String message= sc.nextLine();

        System.out.println("Tu nombre");
        String name = sc.nextLine();

        System.out.println("Escribe la fecha");
        String date = sc.nextLine();

        Messages register= new Messages();
        register.setMessage(message);
        register.setAuthor_message(name);
        register.setDate_message(date);
        MessageDAO.createMessageDB(register);

    }

    public static void listMessage() throws SQLException {
        MessageDAO.readMessageDB();
    }

    public static void deleteMessage() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("indica el ID del mensaje a borrar");
        int id_message= sc.nextInt();
        MessageDAO.deleteMessageDB(id_message);
    }

    public static void updateMessage() throws SQLException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu nuevo mensaje");
        String message= sc.nextLine();
        System.out.println("indica el ID del mensaje a editar");
        int id_message= sc.nextInt();

        Messages update= new Messages();
        update.setId_message(id_message);
        update.setMessage(message);
        MessageDAO.updateMessageDB(update);
    }


}
