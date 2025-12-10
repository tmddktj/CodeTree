public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int tem = a;
        a = b;
        b = tem;

        System.out.println(a);
        System.out.println(b);
    }
}