// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt(); // COTA SUPERIOR
        
        int acum = 0;
        
        for (int i = 2; i<=M-1 ;i++) {
            int izq = 0;
            for (int j = 1; j<i ;j++) {
                izq += Math.pow(j,2);   
            }
            int der = 0;
            for (int j = i+1; j<=M ;j++) {
                der += Math.pow(j,2);   
            }
            if (der % izq == 0){
                acum= acum + 1;
            }          
        }
        System.out.println(acum-1);
        
    }
}
