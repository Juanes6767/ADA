import java.util.Scanner;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger masmelo = BigInteger.valueOf(49999);

        BigInteger N = scanner.nextBigInteger();
        int P = scanner.nextInt();

        System.out.println(N);
        System.out.println(P);

        BigInteger acum = BigInteger.ZERO;

        for (BigInteger i = BigInteger.ONE;
             i.compareTo(N) <= 0;
             i = i.add(BigInteger.ONE)) {

            acum = acum.add(i.pow(P).mod(masmelo));
        }

        System.out.println(acum.mod(masmelo));
    }
}
