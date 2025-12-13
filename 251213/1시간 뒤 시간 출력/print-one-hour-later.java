import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String[] strArrays = s.split(":");
        int h = Integer.valueOf(strArrays[0]);
        System.out.println((h+1)+":"+strArrays[1]);
    }
}