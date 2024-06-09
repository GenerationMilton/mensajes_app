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

        Messages register= new Messages();
        register.setMessage(message);
        register.setAuthor_message(name);
        MessageDAO.createMessageDB(register);

    }

    public static void listMessage(){

    }

    public static void deleteMessage(){

    }

    public static void updateMessage(){

    }


}
