package javae;
public class Plasticos532 {
    static java.util.Scanner s = new java.util.Scanner(System.in);

    private static int pesoPlastico(int n, int t) {
        return t - n;
    }

    public static void main(String[] args) {
        int c = s.nextInt();

        for (int i = 0; i < c; i++) {
            System.out.println(pesoPlastico(s.nextInt(), s.nextInt()));
        }
    }
}
