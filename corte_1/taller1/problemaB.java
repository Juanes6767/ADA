// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.utils.scanner;
import java.lang.math;
public class Main {
    public static void main(String[] args) {
        sc scanner = new Scanner();

        int M = sc.nextInt(); // COTA SUPERIOR

        int acum = 0;
        for (int i = 1; i<=M ;i++) {
            int izq = 0;
            for (int j = 1; j<i ;j++) {
                izq += math.pow(j,2);   
            }
            int der = 0;
            for (int j = i+1; j<=M ;j++) {
                izq += math.pow(j,2);   
            }
            if (der % izq == 0){
                acum+=1;
            }          
        }
        System.out.println(acum);
        
}
