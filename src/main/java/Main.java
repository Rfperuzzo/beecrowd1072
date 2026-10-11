
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i = 1, x, n, in = 0, out = 0;

        x = scanner.nextInt();

        while (i <= x) {
            n = scanner.nextInt();
            if (n >= 10 && n <= 20) {
                in = in + 1;
            } else {
                out = out + 1;
            }
            i++;
        }
        System.out.println(in+ " in");
        System.out.println(out+ " out");
    }
}
