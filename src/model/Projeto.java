package model;

import lombok.Data;
import lombok.Setter;
import lombok.Getter;
import util.Status;

import java.time.LocalDate;


@Data
@Getter
@Setter
public class Projeto {
    private int id;
    private String descricao;
    private String assunto;
    private String usuarioResponsavel;
    private String telefone;
    private LocalDate dataCriacao;
    private Status status;
}
