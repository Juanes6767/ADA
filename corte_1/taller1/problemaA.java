// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Problema A");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("N:");
        int N = scanner.nextInt();
        boolean encontrado = false
        for (int i = 1; i <= N; i++) {
            int izq = 0;
            for (int j = 1; j <= i-1; j++) {
                izq = izq + j;
            }
            int der = 0;
            for (int j = i+1; j <= N; j++) {
                der = der + j;
            }
            if (izq == der){ 
                System.out.println(i);
                encontrado = True
            }      
        }
        if (encontrado == false) {
            System.out.println("No hay");
        }
    }
}
