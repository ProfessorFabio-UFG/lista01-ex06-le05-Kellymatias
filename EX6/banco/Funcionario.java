package banco;

public abstract class Funcionario extends Pessoa {
    protected String matricula;
    protected double salario;

    public Funcionario(String nome, String telefone, String matricula, double salario) {
        super(nome, telefone);
        this.matricula = matricula;
        this.salario   = salario;
    }

    public void aplicarAumento(double percentual) {
        if (percentual > 0) {
            salario += salario * (percentual / 100.0);
        }
    }

    public double recebimentoAnual() {
        return salario * 12;
    }


    public String getMatricula()            { return matricula; }
    public void setMatricula(String m)      { this.matricula = m; }
    public double getSalario()              { return salario; }
    public void setSalario(double s)        { this.salario = s; }
}
