// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;
        for (int i = 1; i<=N;i++){
            if (N % i == 0){
                count += 1;
            }
        }
        System.out.println(count); 
    }
}
