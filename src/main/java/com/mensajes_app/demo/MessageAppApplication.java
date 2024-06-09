package com.mensajes_app.demo;

import com.mensajes_app.demo.service.MessageService;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.sql.SQLException;
import java.util.Scanner;

@SpringBootApplication
public class MessageAppApplication {

	public static void main(String[] args) throws SQLException {

		Scanner sc = new Scanner(System.in);
		int option=0;
		do{
			System.out.println("----------------");
			System.out.println("App message");
			System.out.println("1. Create message");
			System.out.println("2. List menssage");
			System.out.println("3. Edit message");
			System.out.println("4. Delete message");
			System.out.println("5. Exit");
			//leemos la opcion del usuario
			option=sc.nextInt();

			switch (option){
				case 1:
					MessageService.createMessage();
					break;
				case 2:
					MessageService.listMessage();
					break;
				case 3:
					MessageService.updateMessage();
					break;
				case 4:
					MessageService.deleteMessage();
					break;
				default:
					break;
			}

		} while(option !=5);

	}

}
