package javae;
import java.util.InputMismatchException;
public class Kaprekar {
    static java.util.Scanner in;

    public static void casoDePrueba() {
        int n;
        try {
            n = in.nextInt(); in.nextLine();
        } catch (InputMismatchException e) {
            n = 0;
        }
        boolean s = false;
        int n1, n2, nO, nE, c, r;
        if (n > 0) {
            nO = n;

            n *= n;
            nE = n;

            c = 0;

            while (n != 0) {
                n = n / 10;
                c++;
            }

            if (c % 2 == 1) {
                c = c / 2 + 1;
            } else {
                c = c / 2;
            }

            r = 1;

            while (c != 0) {
                r *= 10;
                c--;
            }

            n1 = nE / r;

            n = n1 % 10;

            if (n == 0) {
                n1 /= 10;
            }

            n2 = nE % r;

            if (n1 + n2 == nO) {
                s = true;
            }
        } System.out.println(s ? "SI" : "NO");
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++) {
            casoDePrueba();
        }
    }
}
