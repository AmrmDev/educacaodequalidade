package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private String telefone;
    private String tipo; // aqui seria tipo, se for calouro, veterano e tal.
}

