import java.util.Scanner;

public class MiniChatbot {

    public void iniciarConversa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá! Eu sou o MiniChatbot. Como posso te ajudar hoje?");
        String entradaUsuario;

        do {
            System.out.print("Usuário: ");
            entradaUsuario = scanner.nextLine().toLowerCase();

            if (entradaUsuario.contains("oi") || entradaUsuario.contains("olá")) {
                responderSaudacao();
            } else if (entradaUsuario.contains("seu nome")) {
                responderNome();
            } else if (entradaUsuario.contains("como você está")) {
                responderEstado();
            } else if (!entradaUsuario.equals("sair")) {
                responderNaoEntendido();
            }

        } while (!entradaUsuario.equals("sair"));

        responderDespedida();
        scanner.close();
    }

    private void responderSaudacao() {
        System.out.println("MiniChatbot: Olá! Como posso ajudar?");
    }

    private void responderNome() {
        System.out.println("MiniChatbot: Eu sou o MiniChatbot, seu assistente virtual!");
    }

    private void responderEstado() {
        System.out.println("MiniChatbot: Estou funcionando perfeitamente, obrigado!");
    }

    private void responderNaoEntendido() {
        System.out.println("MiniChatbot: Desculpe, não entendi sua pergunta. Pode reformular?");
    }

    private void responderDespedida() {
        System.out.println("MiniChatbot: Tchau! Até a próxima.");
    }
}
