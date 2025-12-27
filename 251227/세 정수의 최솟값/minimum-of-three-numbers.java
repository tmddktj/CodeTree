import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int min = arr[0];

        for(int i = 0; i<3; i++){
            arr[i] = sc.nextInt();
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.print(min);
    }
}