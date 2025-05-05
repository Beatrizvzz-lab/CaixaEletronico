import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao caixa eletrônico!");

        Scanner leitor = new Scanner(System.in);
        String nomeDoTitular;
        String numeroDoCartao;
        double sacarSaldo;
        int opcao;

        System.out.println("Qual o nome do titular?");
        nomeDoTitular = leitor.nextLine();

        System.out.println("Digite os números do cartão:");
        numeroDoCartao = leitor.nextLine();

        Random random = new Random();
        int saldo = random.nextInt(1000); // Gera saldo aleatório entre 0 e 999

        do { //estrutura de repeticao do while..
            System.out.println("\nMenu:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Sacar valor");
            System.out.println("3 - Sair");
            opcao = leitor.nextInt();

            switch (opcao) { //escolher entre várias opções com base no valor de uma variável
                case 1:
                    System.out.println("Saldo atual: R$" + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor para sacar:");
                    sacarSaldo = leitor.nextDouble();

                    if (sacarSaldo % 10 != 0) {//resto da divisao diferente de zero
                        System.out.println("Olá "+ nomeDoTitular + " não foi possivel realizar o saque de: " + sacarSaldo + " ,as cédulas disponiveis são somente 10,20,50 e 100");
                    } else if (saldo < 10) {
                        System.out.println("Saldo muito baixo, não foi possível realizar o saque.");
                    } else if (sacarSaldo <= saldo && sacarSaldo > 0) {
                    saldo -= sacarSaldo;// saldo - o valor digitado para sacar saldo
                    System.out.println("Olá " + nomeDoTitular + ", saque de R$" + sacarSaldo + " realizado com sucesso!");
                    System.out.println("Saldo restante: R$" + saldo);
                    } else {
                        System.out.println("Olá "+ nomeDoTitular + " não foi possivel realizar o saque de: " + sacarSaldo + " ,o valor máximo para sacar saldo da plataforma é 1000.");
                    }
                    break;
                case 3:
                    System.out.println("Obrigado por usar nosso caixa eletrônico!");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 3);

        leitor.close(); // Boa prática
    }
}


