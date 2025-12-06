import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arrays = new int[n][n];

        for(int i = 0; i<n; i++){
            int cnt = 1;
            if(i%2==0){
                for(int j = 0; j<n; j++){
                    arrays[i][j] = cnt++;
                }
            } else{
                for(int j = n-1; j>-1; j--){
                    arrays[i][j] = cnt++;
                }
            }
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                    System.out.print(arrays[j][i]);
                }
            System.out.println();
        }
    }
}