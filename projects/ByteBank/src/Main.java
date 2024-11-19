import model.Account;

public class Main {
    public static void main(String[] args) {
        Account conta1 = new Account(112233, "99988877766", "Yago");
        Account conta2 = new Account(119988, "22233344455", "Bob");

        System.out.println(conta1.toString());
        System.out.println(conta2.toString());

        System.out.println();
        conta1.depositar(1000.00);
        conta2.depositar(2000.00);


        System.out.println();
        conta1.sacar(200.00);
        conta2.sacar(300.00);


        System.out.println();
        conta1.transferir(conta2, 450.00);
        conta2.transferir(conta1, 150.00);

    }
}