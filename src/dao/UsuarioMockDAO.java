package dao;

import model.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioMockDAO {
    private List<Usuario> usuarios = new ArrayList<>();
    private int idAtual = 1;

    public void inserir(Usuario usuario) {
        usuario.setId(idAtual++);
        usuarios.add(usuario);
        System.out.println("Inserido (Mock)> " + usuario);
    }

    public List<Usuario> listar() {
        return usuarios;
    }

    public void atualizar(Usuario usuario) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == usuario.getId()) {
                usuarios.set(i, usuario);
                System.out.println("Atualizado (Mock): " + usuario);
                return;
            }
        }
    }

    public void excluir(int id) {
        usuarios.removeIf(u -> u.getId() == id);
        System.out.println("Deletado (MOCK), ID: " + id);
    }
}
