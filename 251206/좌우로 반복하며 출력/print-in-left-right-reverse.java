import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            int[] arrays = new int[n];
            int cnt = 1;
            for(int j = 0 ; j<n; j++){
                    arrays[j] = cnt++;
                }
            if(i%2!=0){
                for (int j = 0; j < n / 2; j++) {
                    int temp = arrays[j];
                    arrays[j] = arrays[n - j - 1];
                    arrays[n - j - 1] = temp;
                }
            }
            for(int j = 0; j<arrays.length; j++){
                System.out.print(arrays[j]);
            }
            System.out.println();
        }

    }
}