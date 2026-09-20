// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int producto = 1;
        boolean esMultiplo = true;
        boolean breakage = true;
        String[] list = sc.nextLine().split(" ");
        
        Arrays.sort(list);
        int mayor = Integer.valueOf(list[list.length-1]);
        for (int i = 0;i<list.length;i++){
            producto*= Integer.valueOf(list[i]);
        }
 
        for (int i = mayor;i<producto;i+=mayor){
            for (int j = 0; j < list.length; j++) {
            if (i % Integer.valueOf(list[j]) != 0 || i == Integer.valueOf(list[j])) {
                System.out.println(i);
                breakage= true;
                break;
                }
            }
            if (breakage){}
            break;
    }
}}
