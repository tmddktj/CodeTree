import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int l = sc.nextInt();

        w += 8;
        l *= 3;
        System.out.println(w);
        System.out.println(l);
        System.out.println(w*l);
    }
}