
import java.util.Scanner;// библ для ввода с клавиатуры


public class Main {
    public static int toBinary(int n) {

        double res = 0;
        double st = 1;
        double pow2 = 1;
        double r = n;
        while (r > 0) {
            st = (int) (Math.log10(r) / Math.log10(2));
            pow2 = Math.pow(2, st);
            r = r - pow2;
            res += (int) Math.pow(10, st);
        }
        return (int) res;
    }

    private static Scanner inn = new Scanner(System.in);// метод для ввода с клавиатуры

    public static <string> void main(String[] args) {
        System.out.println(toBinary(14));

    }
}
