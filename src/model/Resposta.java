package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Resposta {
    private Duvida duvida;
    private Usuario autor;
    private String conteudo;
    private LocalDateTime dataCriacao;
}
