//Bernouilli
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int masmelo = 49999;
        
        int N = scanner.nextInt();
        int P = scanner.nextInt();

        int acum = 0;
        
        for (int i = 1; i <= N; i++) {
            acum = acum + ((int) Math.pow(i, P) % masmelo);
        }
        
        System.out.println(acum % masmelo);
    }
}
