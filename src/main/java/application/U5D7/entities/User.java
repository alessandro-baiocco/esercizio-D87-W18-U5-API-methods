package application.U5D7.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class User {
        private int id;
        private String nome;
        private String cognome;
        private String email;
        private LocalDate dataDiNascita;
        private String userPicture;



}
