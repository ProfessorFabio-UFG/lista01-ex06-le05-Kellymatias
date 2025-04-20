package banco;

public class Pessoa {
    protected String nome;
    protected String telefone;

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome()       { return nome; }
    public void setNome(String n) { this.nome = n; }
    public String getTelefone()          { return telefone; }
    public void setTelefone(String t)    { this.telefone = t; }
}
