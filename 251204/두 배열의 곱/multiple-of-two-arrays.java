import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arrays1 = new int[3][3];
        int[][] arrays2 = new int[3][3];

        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                arrays1[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                arrays2[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(arrays1[i][j]*arrays2[i][j]+" ");
            }
            System.out.println();
        }
    }
}