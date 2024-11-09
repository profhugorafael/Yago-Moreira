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

    public void depositar() {

    }

    public void sacar() {

    }

    public void transferir() {

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
}
