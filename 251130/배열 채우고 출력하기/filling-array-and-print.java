import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] stringArrays = new String[10];

        stringArrays[0] = sc.next();
        stringArrays[1] = sc.next();
        stringArrays[2] = sc.next();
        stringArrays[3] = sc.next();
        stringArrays[4] = sc.next();
        stringArrays[5] = sc.next();
        stringArrays[6] = sc.next();
        stringArrays[7] = sc.next();
        stringArrays[8] = sc.next();
        stringArrays[9] = sc.next();

        for(int i = 9; i>=0; i--){
            System.out.print(stringArrays[i]);
        }
    }
}