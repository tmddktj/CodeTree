import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                continue;
            }
            int num = i;
            int lastNum = i % 10;
            while(num > 0){
                num /= 10;
                if(lastNum == 5){
                    break;
                }
            }
            if(lastNum == 5){
                continue;
            }
            if(i % 3 == 0 && i % 9 !=0){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}