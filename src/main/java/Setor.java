public interface Setor {
    String cadastrarClientePlano(int idCliente, String tipoPlano);
    String solicitarCartaoCliente(int idCliente);
    String cancelarPlano(int idCliente, int idPlano);
}
