import exceptions.NotaInvalidaException;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static int dividir(Scanner sc) throws IOException {
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (b == 0) {
                throw new ArithmeticException("B não pode ser zero");
            }

            return a / b;
        } catch (ArithmeticException e) {
            throw new ArithmeticException(e.getMessage());
        } catch (InputMismatchException e) {
            throw new IOException("Voce nao digitou um numero");
        } finally {
            System.out.println("Chegou aqui");
        }
    }

    static int dividir2(Scanner sc) {

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b == 0) {
            throw new ArithmeticException("B não pode ser zero");
        }

        return a / b;

    }

    static double calcularMedia(double nota1, double nota2) {

        if (nota1 == 0 || nota2 == 0) {
            throw new NotaInvalidaException();
        }

        return (nota1 + nota2) / 2;
    }

    public static void main(String[] args) {
        //Tratar, Delega, Criar

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println(dividir(scanner));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}