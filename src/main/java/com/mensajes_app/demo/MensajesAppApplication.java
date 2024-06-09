package com.mensajes_app.demo;

import com.mensajes_app.demo.conexion.Conexion;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.SQLException;

@SpringBootApplication
public class MensajesAppApplication {

	public static void main(String[] args) throws SQLException {

		Conexion Conexion = new Conexion();
		Connection cnx = Conexion.get_connection();

	}

}
