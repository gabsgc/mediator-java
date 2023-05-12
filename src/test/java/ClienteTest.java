import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveAdquirirPlano() {
        Cliente cliente = new Cliente();
        assertEquals("A Recepção já registrou sua solicitação.\n"+
                "O atendente respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>O cliente será cadastrado no plano Pro", cliente.adquirirPlano(1, "Pro"));
    }

    @Test
    void deveSolicitarCartao() {
        Cliente cliente = new Cliente();
        assertEquals("A Recepção já registrou sua solicitação.\n"+
                "O atendente respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>O cartão foi solicitado. Aguarde o e-mail para retirada.", cliente.solicitarCartao(1));
    }

    @Test
    void deveCancelarPlano() {
        Cliente cliente = new Cliente();
        assertEquals("A Recepção já registrou sua solicitação.\n"+
                "O atendente respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>O plano foi cancelado com sucesso.", cliente.cancelarPlano(1, 2));
    }
}