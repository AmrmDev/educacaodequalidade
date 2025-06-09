package repository;

import model.Resposta;
import java.util.ArrayList;
import java.util.List;

public class RespostaRepository {
    private static List<Resposta> respostas = new ArrayList<>();


    public static void adicionar(Resposta resposta) {
        respostas.add(resposta);
    }

    public static List<Resposta> listarPorDuvida(String duvidaId) {
        List<Resposta> relacionadas = new ArrayList<>();
        for (Resposta r : respostas) {
            if (r.getDuvida().getId().equals(duvidaId)) {
                relacionadas.add(r);
            }
        }
        return relacionadas;
    }


}
