import java.util.Scanner;

class Main {
    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String[] list = sc.nextLine().trim().split("\\s+");

        long mcm = Long.parseLong(list[0]);

        for (int i = 1; i < list.length; i++) {
            long num = Long.parseLong(list[i]);
            mcm = lcm(mcm, num);
        }

        System.out.println(mcm);
    }
}
