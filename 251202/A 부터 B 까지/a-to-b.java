import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = a;

        while(n<=b){
            System.out.print(n + " ");
            if(n%2 == 0){
                n += 3;
            } else {
                n *= 2;
            }
        } 
    }
}