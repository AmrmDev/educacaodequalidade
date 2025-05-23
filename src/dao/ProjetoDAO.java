package dao;

import model.Projeto;
import java.sql.*;
import java.sql.Date;
import java.util.*;
import java.time.LocalDate;

public class ProjetoDAO {

    public void inserir(Projeto projeto) {
        String sql = "UPDATE projetos SET descricao = ?, ods = ?, nome_responsavel = ?, telefone = ?, data_criacao = ?, status = ? WHERE id = ?";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, projeto.getDescricao());
            stmt.setString(2, projeto.getAssunto());
            stmt.setString(3, projeto.getUsuarioResponsavel());
            stmt.setString(4, projeto.getTelefone());
            stmt.setDate(5, Date.valueOf(projeto.getDataCriacao()));
            stmt.setString(6, projeto.getStatus());
            stmt.setInt(7, projeto.getId());

            stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void deletar(int id) {
        String sql = "DELETE FROM projetos WHERE id = ²";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void atualizar(Projeto projeto) {
        String sql = "UPDATE projetos SET descricao = ?, ods = ?, nome_responsavel = ?, telefone = ?, data_criacao = ?, status = ? WHERE id = ?";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, projeto.getDescricao());
            stmt.setString(2, projeto.getAssunto());
            stmt.setString(3, projeto.getUsuarioResponsavel());
            stmt.setString(4, projeto.getTelefone());
            stmt.setDate(5, Date.valueOf(projeto.getDataCriacao()));
            stmt.setString(6, projeto.getStatus());
            stmt.setInt(7, projeto.getId());

            stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Projeto> listarTodos() {
        List<Projeto> lista = new ArrayList<>();
        String sql = "SELECT * FROM projetos";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
                while(rs.next()) {
                    Projeto projeto = new Projeto();
                    projeto.setId(rs.getInt("id"));
                    projeto.setDescricao(rs.getString("descricao"));
                    projeto.setAssunto(rs.getString("assunto"));
                    projeto.setUsuarioResponsavel(rs.getString("usuario_responsavel"));
                    projeto.setTelefone(rs.getString("telefone"));
                    projeto.setDataCriacao(rs.getDate("data_criacao").toLocalDate());
                    projeto.setStatus(rs.getString("status"));

                    lista.add(projeto);
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;

    }
}
