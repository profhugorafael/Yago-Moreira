package model;

import enums.TransactionType;

import java.time.LocalDateTime;


public class Transaction {

   private Account destino;
   private TransactionType tipo;
   private double valor;
   private LocalDateTime horario;

    public Transaction(Account destino, TransactionType tipo, double valor) {
        this.destino = destino;
        this.tipo = tipo;
        this.valor = valor;
        this.horario = LocalDateTime.now();
    }

    public Account getDestino() {
        return destino;
    }

    public void setDestino(Account destino) {
        this.destino = destino;
    }

    public TransactionType getTipo() {
        return tipo;
    }

    public void setTipo(TransactionType tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "{" +
                "[" + tipo +
                "] numeroContaDestino=" + destino.getNumeroDaConta() +
                ", valor=" + valor +
                ", horario=" + horario +
                '}';
    }
}

