import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nConta;
        String nome;
        String tipo;
        int op = 0;
        double saldo =0;
        double mvt;
        boolean opt = true;


        System.out.println("Olá! Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite o Numero da conta ");
        nConta = sc.nextLine();
        System.out.println("Qual tipo de conta ?");
        tipo = sc.nextLine();
        System.out.println("\nSeja bem Vindo ao JBank!");
        System.out.println("Dados do Cliente: " +
                "\nNome: " + nome +
                "\nConta: " + nConta +
                "\nTipo de Conta: " + tipo);
        while(opt){

            System.out.println("""
                    
                    Escolha uma das operações abaixo:
                    1) Consultar Saldo.
                    2) Deposito.
                    3 Sacar
                    4) Sair""");

            op = sc.nextInt();

            switch (op){
                case 1:
                    System.out.println("Seu saldo é de: R$" + saldo);
                    break;

                case 2:
                    System.out.println("Digite o valor a ser depositado:");
                    mvt = sc.nextDouble();
                    saldo += mvt;

                    System.out.println("Operação Concluida! \n Saldo atual: R$" + saldo);
                    break;

                case 3:
                    System.out.println("Digite o valor a ser Sacado:");
                    mvt = sc.nextDouble();
                    if (mvt <= saldo){
                        saldo -= mvt;
                        System.out.println("Operação Concluida! \nSaldo atual: R$" + saldo);
                        break;


                    } else {
                        System.out.println("Saldo Insuficiente!");
                        break;
                    }
                case 4:
                    System.out.println("Sessão encerrada! Obrigado!");
                    System.exit(0);
                default:
                    System.out.println("Opção Invalida!");


            }



        }

    }
}