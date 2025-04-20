package banco;

public class CadastroBanco {
    public static void main(String[] args) {

        // 1) criar um funcionário caixa
        Caixa caixa = new Caixa("João Silva", "11-91234-0000", "C123", 2500.00);
        caixa.setHorario("08:00–16:00");

        // aumentar salário em 10%
        caixa.aplicarAumento(10);

        // mostrar dados e recebimento anual
        System.out.println(caixa);
        System.out.printf("Recebimento anual: R$ %.2f%n", caixa.recebimentoAnual());

        System.out.println("------------------------------------------------");

        // 2) criar um funcionário gerente
        Gerente gerente = new Gerente("Maria Oliveira", "11-99876-5432",
                                      "G456", 5000.00, 800.00, "PF");

        // aumentar salário em 20%
        gerente.aplicarAumento(20);
        
        // mostrar dados e recebimento anual
        System.out.println(gerente);
        System.out.printf("Recebimento anual: R$ %.2f%n", gerente.recebimentoAnual());

        System.out.println("------------------------------------------------");

        // 3) criar 3 clientes
        Cliente c1 = new Cliente("Carlos Santos", "11-90000-1111", 30, "123.456.789-00");
        Cliente c2 = new Cliente("Fernanda Lima", "11-90000-2222", 25, "234.567.890-11");
        Cliente c3 = new Cliente("Paulo Souza",   "11-90000-3333", 40, "345.678.901-22");

        // desativar um deles
        c2.desativar();

        // mostrar dados de cada cliente
        System.out.println(c1.mostrarDados());
        System.out.println(c2.mostrarDados());
        System.out.println(c3.mostrarDados());
    }
}
