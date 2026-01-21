import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        double cnt = 0;
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            sum += num;
            cnt++;
        }
        System.out.printf(sum + " " + "%.1f", sum/cnt);
    }
}