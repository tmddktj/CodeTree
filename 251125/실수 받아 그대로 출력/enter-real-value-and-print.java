import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double N = sc.nextDouble();
        double result = Math.round(N * 100) / 100.0;
        System.out.println(result);
    }
}