import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Leitura = new Scanner(System.in);

        // Declaração de variaveis
        double saldo = 300;
        int opcao = 0;
        double valor = 0;

        System.out.println("***********************************\n" +
                "Dados Bancarios:\n" +
                "Nome: Larissa Oliveira Ribeiro\n" +
                "Conta: 00-1\n" +
                "Tipo de Conta: Corrente\n" +
                "Saldo Inicial: R$ " + saldo +
                "\n************************************");

        String menu = """
                   
                   Operaçoes:
                1- Consultar Saldo
                2- Depositar Valor
                3- Transferir Valor
                4- Sair
                """;

        while (opcao != 4) {
            System.out.println(menu);
            // Pergunta qual opçao
            opcao = Leitura.nextInt();

            if (opcao == 1)
                System.out.println("Saldo: " + saldo);

            else if (opcao == 2) {
                System.out.println("Digite o valor a ser depositado: ");
                double recebeValor = Leitura.nextDouble();
                saldo += recebeValor;
                System.out.println("Saldo Atual: " + saldo);

            } else if (opcao == 3) {
                System.out.println("Digite o valor a ser Transferido: ");
                valor = Leitura.nextDouble();
                while (saldo < valor) {
                    System.out.println("Valor de saldo inexistente, digite novamente: ");
                    valor = Leitura.nextDouble();
                }
                saldo -= valor;
                System.out.println("Valor do saldo atual: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Digite novamente a opção desejada ");
            }

        }
    }
}