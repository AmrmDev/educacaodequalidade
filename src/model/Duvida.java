package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.UUID;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Duvida {
    private String id;
    private String titulo;
    private String descricao;
    private Usuario autor;
    private LocalDateTime datacriacao;
}
