import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];
        int third = 0;
        int fifth = 0;

        for(int i = 0; i<10; i++){
            numbers[i] = sc.nextInt();
        }

        for(int i = 0; i<10; i++){
            if(numbers[i] % 3 == 0){
                third += 1;
            }
            if(numbers[i] % 5 == 0){
                fifth += 1;
            }
        }
        System.out.println(third + " " + fifth);
    }
}