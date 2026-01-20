import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            boolean check = false;

            if(i % 3 == 0){
                check = true;
            }
            int num = i;
            while(num > 0){
                int lastNum = i % 10;
                if(lastNum == 3 || lastNum == 6 || lastNum == 9){
                    check = true;
                    break;
                }
                num /= 10;
            }

            if(check){
                System.out.print(0);
            } else{
                System.out.print(i);
            }
            if(i < n){
                System.out.print(" ");
            }
        }
    }
}