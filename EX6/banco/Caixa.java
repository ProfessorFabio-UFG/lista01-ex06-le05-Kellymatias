package banco;

public class Caixa extends Funcionario {
    private String horario;

    public Caixa(String nome, String telefone, String matricula, double salario) {
        super(nome, telefone, matricula, salario);
        this.horario = "";
    }

    public String getHorario()             { return horario; }
    public void setHorario(String h)       { this.horario = h; }

    @Override
    public String toString() {
        return String.format(
            "Caixa [%s] %s – Tel: %s – Salário: R$ %.2f – Horário: %s",
            matricula, nome, telefone, salario, horario
        );
    }
}
