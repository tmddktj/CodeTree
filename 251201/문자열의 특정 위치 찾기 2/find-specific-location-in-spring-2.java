import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] fruits = {"apple", "banana", "grape", "blueberry", "orange"};

        char charc = sc.next().charAt(0);
        int cnt = 0;

        for(int i = 0; i<5; i++){
            if((charc == fruits[i].charAt(2)) || (charc == fruits[i].charAt(3))){
                System.out.println(fruits[i]);
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }
}