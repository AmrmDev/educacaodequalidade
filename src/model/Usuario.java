package model;

public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private String telefone;
    private String tipo; // aqui seria tipo, se for calouro, veterano e tal.


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
   }
   public String getTelefone() {
        return telefone;
   }
   public void setTelefone(String telefone) {
        this.telefone = telefone;
   }
   public String getTipo() {
        return tipo;
   }
   public void setTipo(String tipo) {
        this.tipo = tipo;
   }
}
