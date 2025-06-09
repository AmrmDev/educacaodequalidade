package view;

import model.Duvida;
import model.Usuario;
import repository.DuvidaRepository;
import util.TipoUsuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastroDuvida extends JFrame {
    private JTextField campoTitulo;
    private JTextArea campoDescricao;
    private JButton botaoEnviar;

    private Usuario usuarioLogado = new Usuario("Pedro", "pedro@email.com", "123", "999999999", "Aluno");

    public TelaCadastroDuvida() {
        setTitle("Nova Dúvida");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel painelCampos = new JPanel(new GridLayout(4, 1));

        campoTitulo = new JTextField();
        campoDescricao = new JTextArea(5, 20);
        JScrollPane scroll = new JScrollPane(campoDescricao);

        painelCampos.add(new JLabel("Título:"));
        painelCampos.add(campoTitulo);
        painelCampos.add(new JLabel("Descrição:"));
        painelCampos.add(scroll);

        botaoEnviar = new JButton("Postar Dúvida");

        add(painelCampos, BorderLayout.CENTER);
        add(botaoEnviar, BorderLayout.SOUTH);

        botaoEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String titulo = campoTitulo.getText().trim();
                String descricao = campoDescricao.getText().trim();

                if (titulo.isEmpty() || descricao.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
                    return;
                }

                Duvida novaDuvida = new Duvida(titulo, descricao, usuarioLogado);
                DuvidaRepository.adicionar(novaDuvida);
                JOptionPane.showMessageDialog(null, "Dúvida cadastrada com sucesso!");

                campoTitulo.setText("");
                campoDescricao.setText("");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new TelaCadastroDuvida();
    }
}
