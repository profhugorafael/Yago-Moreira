package model;

public class Account {

    private long numeroDaConta;
    private String cpf;
    private String nome;
    private double saldo;
    private boolean active;

    private Address endereco;

    public Account(long numeroDaConta, String cpf, String nome, Address endereco) {
        this.numeroDaConta = numeroDaConta;
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.saldo = 0;
        this.active = true;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inferior a R$0,00. \nPara deposito o valor deve ser maior que R$0,00");
            return;
        }

        if (!active) {
            System.out.println("Conta inativa!");
            return;
        }

        this.saldo += valor;
        System.out.println("Valor depositado com sucesso!");
        System.out.println("Saldo atual: " + this.saldo);
    }

    public void sacar(double valor) {
        if (valor > this.saldo || valor < 0) {
            System.out.println("Impossivel realizar o saque.");
            return;
        }

        if (!active) {
            System.out.println("Conta inativa!");
            return;
        }

        this.saldo -= valor;
        System.out.println("Saque efetuado com sucesso!");
        System.out.println("Saldo atual: " + this.saldo);
    }

    public void transferir(Account destino, double valor) {
        if (this.saldo < valor || valor < 0) {
            System.out.println("Não é possivel realizar a transferência. Valor inferior a R$0,00.");
            return;
        }

        this.saldo -= valor;
        System.out.println("Transação realizada!");
        destino.depositar(valor);
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

    public Address getEndereco() {
        return endereco;
    }

    public void setEndereco(Address endereco) {
        this.endereco = endereco;
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
