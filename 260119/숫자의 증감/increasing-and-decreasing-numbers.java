import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        int n = sc.nextInt();

        if("A".equals(c)){
            for(int i = 1; i <= n; i++){
                System.out.printf("%d\t", i);
            }
        } else if("D".equals(c)){
            for(int i = n; i > 0 ; i--){
                System.out.printf("%d\t", i);
            }
        }
    }
}