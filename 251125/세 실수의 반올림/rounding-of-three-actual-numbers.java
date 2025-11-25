import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double num1 = Math.round(a * 1000) / 1000.0;
        double num2 = Math.round(b * 1000) / 1000.0;
        double num3 = Math.round(c * 1000) / 1000.0;

        System.out.printf("%.3f", num1);
        System.out.println();
        System.out.printf("%.3f", num2);
        System.out.println();
        System.out.printf("%.3f", num3);
    }
}