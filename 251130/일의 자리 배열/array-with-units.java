import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        numbers[0] = sc.nextInt();
        numbers[1] = sc.nextInt();

        System.out.print(numbers[0] + " " + numbers[1]);

        for(int i = 2; i<10; i++){
            numbers[i] = (numbers[i-2] + numbers[i-1]) % 10;
            System.out.print(" "  +  numbers[i]);
        }
    }
}