public class Conta {
    // Atributos (O que a conta TEM)
    private String titular;
    private int numero;
    private double saldo;

    // Construtor (Para inicializar a conta com valores)
    public ContaBancaria(String titular, int numero, double saldoInicial) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    // Métodos (O que a conta FAZ)
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado.");
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
            return false;
        }
    }

    // Getters para acessar informações de forma segura
    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }
    public int getNumero() { return numero; }
}
