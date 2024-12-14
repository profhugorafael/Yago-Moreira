package models;

public class Circle {
    public static final double PI = 3.14;

    private double raio;
    private String cor;

    public double getPerimetro() {
        return PI * 2 * raio;
    }

}
