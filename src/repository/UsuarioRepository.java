package repository;

import model.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository {
    private static List<Usuario> usuarios = new ArrayList<>();

    public void inserir(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Usuario> listar() {
        return new ArrayList<>(usuarios);
    }

    public void atualizar(Usuario usuarioAtualizado) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getEmail().equals(usuarioAtualizado.getEmail())) {
                usuarios.set(i, usuarioAtualizado);
                return;
            }
        }
    }

    public void deletar(String email) {
        usuarios.removeIf(usuario -> usuario.getEmail().equals(email));
    }


}
