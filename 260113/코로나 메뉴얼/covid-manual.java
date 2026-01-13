import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] symp = new String[3];
        int[] temp = new int[3];
        int count = 0; 

        for(int i = 0; i<3; i++){
            symp[i] = sc.next();
            temp[i] = sc.nextInt();
        }

        for(int i =0; i<3; i++){
            if(symp[i].equals("Y") && temp[i]>=37){
                count++;
            }
        }
        
        if(count >= 2){
            System.out.print("E");
        } else{
            System.out.print("N");
        }
    }
}