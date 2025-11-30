import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        StringBuilder sb = new StringBuilder(text);

        sb.setCharAt(1, 'a'); // 두 번째 문자
        sb.setCharAt(sb.length() - 2, 'a'); // 뒤에서 두 번째 문자

        System.out.println(sb.toString());
    }
}