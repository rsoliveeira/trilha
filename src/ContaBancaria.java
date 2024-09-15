
public class ContaBancaria {
    private int numeroConta;
    private String nomeCliente;
    private double saldo;

    public ContaBancaria(int numeroConta, String nomeCliente, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso. Saldo atual: R$" + saldo);
        } else {
            System.out.println("O valor de depósito deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso. Saldo atual: R$" + saldo);
        } else if (valor > 0 && saldo < valor) {
            System.out.println("Saldo insuficiente para realizar o saque. Saldo atual: R$" + saldo);
        } else {
            System.out.println("O valor de saque deve ser positivo.");
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numeroConta=" + numeroConta +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(12345, "João Silva", 1000.0);
        ContaBancaria conta2 = new ContaBancaria(67890, "Maria Souza", 500.0);

        conta1.depositar(200.0);
        conta1.sacar(150.0);
        conta1.sacar(1200.0);

        conta2.depositar(300.0);
        conta2.sacar(600.0);
        conta2.sacar(50.0);
    }
}
