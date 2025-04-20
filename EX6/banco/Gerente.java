package banco;

public class Gerente extends Funcionario {
    private double bonificacaoMensal;
    private String tipo; 

    public Gerente(String nome, String telefone, String matricula,
                   double salario, double bonificacaoMensal, String tipo) {
        super(nome, telefone, matricula, salario);
        this.bonificacaoMensal = bonificacaoMensal;
        this.tipo = tipo;
    }

    public double getBonificacaoMensal()        { return bonificacaoMensal; }
    public void setBonificacaoMensal(double b)  { this.bonificacaoMensal = b; }
    public String getTipo()                     { return tipo; }
    public void setTipo(String t)               { this.tipo = t; }

    @Override
    public double recebimentoAnual() {
        return super.recebimentoAnual() + bonificacaoMensal * 12;
    }

    @Override
    public String toString() {
        return String.format(
            "Gerente [%s] %s – Tel: %s – Salário: R$ %.2f – Bônus: R$ %.2f/mês – Tipo: %s",
            matricula, nome, telefone, salario, bonificacaoMensal, tipo
        );
    }
}
