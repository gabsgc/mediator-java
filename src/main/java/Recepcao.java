public class Recepcao  {
    private static Recepcao instancia = new Recepcao();

    private Recepcao() {}

    public static Recepcao getInstance() {
        return instancia;
    }

    public String cadastrarClientePlano(int idCliente, String tipoPlano) {
        return "A Recepção já registrou sua solicitação.\n"+
                "O atendente respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Atendente.getInstance().cadastrarClientePlano(idCliente, tipoPlano);
    }

    public String solicitarCartaoCliente(int idCliente) {
        return "A Recepção já registrou sua solicitação.\n"+
                "O atendente respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Atendente.getInstance().solicitarCartaoCliente(idCliente);
    }

    public String cancelarPlano(int idCliente, int idPlano) {
        return "A Recepção já registrou sua solicitação.\n"+
                "O atendente respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Atendente.getInstance().cancelarPlano(idCliente, idPlano);
    }
}
