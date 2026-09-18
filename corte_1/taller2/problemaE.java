// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int count = 0;
        for (int i = 1; i<=B;i++){
            if (B % i == 0){
                count += 1;
            }
        }
        int B = sc.nextInt();
        int count2 = 0;
        for (int i = 1; i<=B;i++){
            if (B % i == 0){
                count2 += 1;
            }
        }
        System.out.println(count2-count1); 
    }
}
