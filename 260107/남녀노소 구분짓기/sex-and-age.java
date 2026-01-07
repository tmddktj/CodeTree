import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gender = sc.nextInt();
        int age = sc.nextInt();

        if(age>=19 && gender==0){
            System.out.print("MAN");
        } else if(age>=19 && gender==1){
            System.out.print("WOMAN");
        } else if(age<19 && gender==0){
            System.out.print("BOY");
        } else if (age<19 && gender==1){
            System.out.print("GIRL");
        }
    }
}