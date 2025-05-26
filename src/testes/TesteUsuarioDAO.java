package testes;

import dao.UsuarioDAO;
import model.Usuario;

public class TesteUsuarioDAO {
    public static void main(String[] args) {
        UsuarioDAO dao =  new UsuarioDAO();

        Usuario usuario = new Usuario();
        usuario.setNome("Teste");
        usuario.setEmail("teste@gmail.com");
        usuario.setSenha("123456");
        usuario.setTelefone("9 9999-9999");
        usuario.setTipo("aluno");

        dao.inserir(usuario);
        System.out.println("Usuário inserido com sucesso");

        for (Usuario u : dao.listarTodos()) {
            System.out.println(u);
        }

        usuario.setNome("Teste da Silva");
        dao.atualizar(usuario);
        System.out.println("Usuário atualizado com sucesso");

        dao.deletar(usuario.getId());
        System.out.println("Usuário delteado com sucesso");
    }
}
