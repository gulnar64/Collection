package test;

public class Circle implements Shape{
    private static final double PI = 3.14;
    @Override
    public double calculateArea(int a, int b) {
        double area = Math.PI * Math.pow(a, 2);
        return PI * a * a;
    }
}
