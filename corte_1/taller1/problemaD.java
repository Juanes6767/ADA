import java.util.Scanner;
import java.util.Arrays;
class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String texto = String.valueOf(N*N);
        boolean encontrado = true;
        boolean casoRaro = false;
        String primero = "";
        String segundo = "";
        for (int i = 1; i<=N ;i++) {
            primero = String.valueOf(i);
            segundo = String.valueOf(N-i);
            casoRaro= ( (texto.split("0")[0] + segundo).equals(primero + segundo)) ||  ( (primero + texto.split("0")[texto.split("0").length-1]).equals( primero + segundo) );
            
            if ( (primero + segundo).equals(texto) || casoRaro){
                System.out.println("KAP");
                encontrado = true;
                break;
            }
            
            else{
                encontrado = false;
            }
            }
        if (encontrado == false){
            System.out.println("NO");
        }
    }
}
