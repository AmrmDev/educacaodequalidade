package testes;

import dao.ProjetoDAO;
import model.Projeto;
import java.time.LocalDate;
import java.util.List;

public class TesteProjetoDAO {
    public static void main(String[] args) {
        ProjetoDAO projetoDAO = new ProjetoDAO();

        // teste para adicionar projeto
        Projeto novoProjeto = new Projeto();
        novoProjeto.setDescricao("Projeto de automação de tarefa utilizando Python");
        novoProjeto.setAssunto("IA | Python | Automação");
        novoProjeto.setUsuarioResponsavel("Pedro Amorim");
        novoProjeto.setDataCriacao(LocalDate.now());
        novoProjeto.setStatus("Em andamento...");
        novoProjeto.setTelefone("11 95858-7550");

        projetoDAO.inserir(novoProjeto);
        System.out.println("Projeto inserido com sucesso!");

        // teste para listar todos os projetos.
        List<Projeto> lista = projetoDAO.listarTodos();
        System.out.println("\n Lista de projetos: ");
        for (Projeto p : lista) {
            System.out.println("ID: " + p.getId() +
                    ", Descrição: " + p.getDescricao() +
                    ", Responsavel: " + p.getUsuarioResponsavel() +
                    ", Status: " + p.getStatus());
        }
    }
}
