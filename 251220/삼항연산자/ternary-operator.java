import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String score = n>=100 ? "pass" : "failure";
        System.out.println(score); 
    }
}