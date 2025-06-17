import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
        private final int numero;
        private final String agencia, nomeCliente;
        @SuppressWarnings("FieldMayBeFinal")
        private double saldo;
        public ContaTerminal(int numero, String agencia, String nomeCliente, double saldo) {
            this.agencia = agencia;
            this.numero = numero;
            this.nomeCliente = nomeCliente;
            this.saldo = saldo;
        }
        public String getDados() {
            String saldoFormatado = String.format(Locale.US, "%.2f", saldo);
            return "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.\n" +
                   "Sua agência é " + agencia + ", conta " + numero + ".\n" +
                   "Seu saldo é de R$ " + saldoFormatado + " já está disponível para saque.";
        }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência:");
        String agenciaDigitada = scanner.nextLine(); 
        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt(); 
        scanner.nextLine();
        System.out.println("Por favor, digite seu Nome Completo:");
        String nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o Saldo da Conta:");
        double saldoConta = scanner.nextDouble();
        scanner.nextLine(); 
        ContaTerminal novaConta = new ContaTerminal(numeroConta, agenciaDigitada, nomeCliente, saldoConta);
        System.out.println(novaConta.getDados());
    }
}