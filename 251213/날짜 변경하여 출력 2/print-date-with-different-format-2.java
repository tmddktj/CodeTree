import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String[] sArrays = s.split("-");
        System.out.println(sArrays[2]+"."+sArrays[0]+"."+sArrays[1]);
    }
}