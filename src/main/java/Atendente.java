public class Atendente implements Setor {
    private static Atendente instancia = new Atendente();

    private Atendente() {}

    public static Atendente getInstance() {
        return instancia;
    }

    @Override
    public String cadastrarClientePlano(int idCliente, String tipoPlano) {
        return "O cliente será cadastrado no plano " + tipoPlano;
    }

    @Override
    public String solicitarCartaoCliente(int idCliente) {
        return "O cartão foi solicitado. Aguarde o e-mail para retirada.";
    }

    @Override
    public String cancelarPlano(int idCliente, int idPlano) {
        return "O plano foi cancelado com sucesso.";
    }
}
