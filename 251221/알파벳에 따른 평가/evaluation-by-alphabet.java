import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String eng = sc.next();

        if(eng.equals("S")){
            System.out.print("Superior");
        } else if(eng.equals("A")){
            System.out.print("Excellent");
        } else if(eng.equals("B")){
            System.out.print("Good");
        } else if(eng.equals("C")){
            System.out.print("Usually");
        } else if(eng.equals("D")){
            System.out.print("Effort");
        } else{
            System.out.print("Failure");
        }
    }
}