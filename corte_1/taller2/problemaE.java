import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la cota superior M: ");
        int a = sc.nextInt();
        int M = sc.nextInt();

        System.out.println(sumaCuadrados(a, M));

        sc.close();
    }

    // Suma de cuadrados desde a hasta b (fórmula cerrada)
    public static long sumaCuadrados(int a, int b) {
        if (a > b) return 0;
        // fórmula: n(n+1)(2n+1)/6
        long sumaHastaB = contarDivisores(b);
        long sumaHastaA_1 = contarDivisores(a);
        return sumaHastaB - sumaHastaA_1;
    }

    // Contar divisores de un número
    public static int contarDivisores(int n) {
        if (n <= 0) return 0;
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (i != n / i) count++;
            }
        }
        return count;
    }
}
