import java.util.Scanner;
import java.util.Arrays;
class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean zero= false;
        if (String.valueOf(N).charAt(String.valueOf(N).length()-1)=='0') {
            System.out.println("NO");
            zero=true;
        }
        else{
        String texto = String.valueOf(N * N);

for (int corte = 1; corte < texto.length(); corte++) {
    String primero = texto.substring(0, corte);
    String segundo = texto.substring(corte);

    if (Integer.parseInt(primero) + Integer.parseInt(segundo) == N) {
        System.out.println("KAP");
        return;
    }
}
        }
if (zero == false){
System.out.println("NO");
}
    }
}
