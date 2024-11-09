import java.util.List;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro("Renault", 2022, "Kwid");
        Carro c2 = new Carro();

        System.out.println(c1.modelo);
        System.out.println(c1.ano);
        System.out.println(c1.marca);

        c1.marca = "Renault";
        c1.ano = 2022;
        c1.modelo = "Kwid";
        c1.placa = "ABC1D123";
        c1.velocidade = 100;

        c1.velocidade = 200;

        c1.velocidade = -10;
        if (c1.velocidade < 0) {
            // pega apenas valor positivo
            c1.velocidade = Math.abs(c1.velocidade);
        }

        Pessoa p1 = new Pessoa();

        p1.setNome("Pedro");

        System.out.println(p1.getNome());

        System.out.println(p1.getNome());
    }
}