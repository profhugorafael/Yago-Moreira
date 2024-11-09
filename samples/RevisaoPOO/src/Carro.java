public class Carro {
    // atributos (tem...)
    public String marca;
    public int ano;
    public String modelo;
    public String placa;
    public double velocidade;

    // construtor personalizado
    public Carro() {
    }

    public Carro(String modelo, int ano, String marca) {
        this.modelo = modelo;
        this.ano = ano;
        this.marca = marca;
    }

    // metodos(faz...)
    public void acelerar(double aceleracao) {
        velocidade += aceleracao;
    }

    public void frear(double desaceleracao) {
        if (desaceleracao > velocidade){
            velocidade = 0;
        } else {
            velocidade -= desaceleracao;
        }
    }

    public void frear() {
        velocidade = 0;
    }
}