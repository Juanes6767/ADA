// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
import java.math.BigInteger;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int number = sc.nextInt();
        BigInteger count = BigInteger.ZERO;
        while (true){
            int original = number;
            int reversed = 0;
            while (number != 0) {
                reversed = reversed * 10 + number % 10;
                number /= 10;
            }
        if (original == reversed){
            System.out.println(count);
            break;
        }
        if (count.compareTo(BigInteger.valueOf(10000000000L))==-1){
        System.out.println("L");
            break;
        }
        number = number + reversed;
        count.add(BigInteger.ONE);
            
        }
        
    }
}

