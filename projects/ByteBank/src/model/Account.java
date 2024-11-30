package model;

public class Account {

    private long numeroDaConta;
    private String cpf;
    private String nome;
    private double saldo;
    private boolean active;

    public Account(long numeroDaConta, String cpf, String nome) {
        this.numeroDaConta = numeroDaConta;
        this.cpf = cpf;
        this.nome = nome;
        this.saldo = 0;
        this.active = true;
    }

    public void depositar(double valor) {
        saldo += valor;
        sout

    }

    public void sacar(double valor) {
        if (valor > this.saldo || valor < 0) {
            System.out.println("Impossivel realizar o saque.");
        }
        else {
            this.saldo -= valor;
            System.out.println("Saque efetuado com sucesso!");
            System.out.println("Saldo atual: " + this.saldo);
        }
    }

    public void transferir(Account destino, double valor) {
        if (this.saldo > valor) {
            this.saldo -= valor;
            System.out.println("Transação realizada!");
            destino.depositar(valor);
        }
        else {
            System.out.println("Não é possivel realizar a transferência. Valor inferior a R$0,00.");
        }
    }

    public long getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isActive() {
        return active;
    }

    public void toggleActive() {
        active = !active;
    }

    @Override
    public String toString() {
        return "Account{" +
                "numeroDaConta=" + numeroDaConta +
                ", cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                ", active=" + active +
                '}';
    }
}
