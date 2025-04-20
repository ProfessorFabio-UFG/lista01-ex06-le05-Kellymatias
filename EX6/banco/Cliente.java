package banco;

public class Cliente extends Pessoa {
    protected int idade;
    protected String cpf;
    protected char status;

    public Cliente(String nome, String telefone,
                   int idade, String cpf) {
        super(nome, telefone);
        this.idade  = idade;
        this.cpf    = cpf;
        this.status = 'A';
    }

    public void desativar() {
        if (status == 'A') {
            status = 'I';
        }
    }

    public String mostrarDados() {
        String estado = (status == 'A') ? "ativo" : "inativo";
        return String.format(
            "%s – Tel:%s – idade: %d anos – cpf: %s – %s",
            nome, telefone, idade, cpf, estado
        );
    }

    public int getIdade()                  { return idade; }
    public void setIdade(int i)            { this.idade = i; }
    public String getCpf()                 { return cpf; }
    public void setCpf(String c)           { this.cpf = c; }
    public char getStatus()                { return status; }
    public void setStatus(char s)          { this.status = s; }
}
