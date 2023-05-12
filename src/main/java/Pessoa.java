public class Pessoa {
    public String adquirirPlano(int idCliente, String tipoPlano) {
        return Recepcao.getInstance().cadastrarClientePlano(idCliente, tipoPlano);
    }
    public String solicitarCartao(int idCliente) {
        return Recepcao.getInstance().solicitarCartaoCliente(idCliente);
    }
    public String cancelarPlano(int idCliente, int idPlano) {
        return Recepcao.getInstance().cancelarPlano(idCliente, idPlano);
    }
}