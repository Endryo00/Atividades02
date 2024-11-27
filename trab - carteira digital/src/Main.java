import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarteiraDigital carteira = new CarteiraDigital();

        int opcao;
        do {
            exibirMenu();
            opcao = lerEntradaUsuario(scanner);

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para adicionar ao saldo: ");
                    double valorAdicionar = scanner.nextDouble();
                    carteira.adicionarSaldo(valorAdicionar);
                    break;
                case 2:
                    System.out.print("Digite o valor do pagamento: ");
                    double valorPagamento = scanner.nextDouble();
                    carteira.realizarPagamento(valorPagamento);
                    break;
                case 3:
                    System.out.println("Seu saldo atual é: R$ " + carteira.verificarSaldo());
                    break;
                case 4:
                    carteira.exibirHistoricoTransacoes();
                    break;
                case 5:
                    System.out.println("Obrigado por usar a sua Carteira Digital!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\nBem-vindo à sua Carteira Digital!");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Adicionar Saldo");
        System.out.println("2 - Realizar Pagamento");
        System.out.println("3 - Verificar Saldo");
        System.out.println("4 - Exibir Histórico de Transações");
        System.out.println("5 - Sair");
        System.out.print("Opção: ");
    }

    private static int lerEntradaUsuario(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Por favor, insira um número válido: ");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
