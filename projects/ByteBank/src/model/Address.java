package model;

public class Address {
    private String rua;
    private String cidade;
    private String cep;
    private String numero;

    public Address() {
    }

    public Address(String rua, String cidade, String cep, String numero) {
        this.rua = rua;
        this.cidade = cidade;
        this.cep = cep;
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
