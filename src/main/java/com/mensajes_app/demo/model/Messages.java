package com.mensajes_app.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Messages {

    int id_message;
    String message;
    String author_message;
    String date_message;


}
