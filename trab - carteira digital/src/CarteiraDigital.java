import java.util.ArrayList;
import java.util.List;

public class CarteiraDigital {
    private double saldo;
    private List<String> historicoTransacoes;

    public CarteiraDigital() {
        this.saldo = 0.0;
        this.historicoTransacoes = new ArrayList<>();
    }

    public void adicionarSaldo(double valor) {
        if (valor > 0) {
            saldo += valor;
            historicoTransacoes.add("Adicionado: R$ " + valor);
            System.out.println("Saldo adicionado com sucesso!");
        } else {
            System.out.println("Valor inválido. Tente novamente.");
        }
    }

    public void realizarPagamento(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            historicoTransacoes.add("Pagamento: R$ " + valor);
            System.out.println("Pagamento realizado com sucesso!");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            System.out.println("Valor inválido. Tente novamente.");
        }
    }

    public double verificarSaldo() {
        return saldo;
    }

    public void exibirHistoricoTransacoes() {
        System.out.println("Histórico de Transações:");
        if (historicoTransacoes.isEmpty()) {
            System.out.println("Nenhuma transação realizada.");
        } else {
            for (String transacao : historicoTransacoes) {
                System.out.println(transacao);
            }
        }
    }
}
