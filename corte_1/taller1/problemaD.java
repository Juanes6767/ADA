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
            casoRaro = ( (texto.split("0")[0] + String.join("", Arrays.copyOfRange(texto.split("0"), 1, texto.split("0").length)) ).equals(primero + segundo) ) || ( String.join("", (Arrays.copyOfRange(texto.split("0"), 0, texto.split("0").length-1)) + texto.split("0")[texto.split("0").length-1] ).equals(primero + segundo) );
            
            if ( (primero + segundo).equals(texto) || (segundo + primero ).equals(texto) || casoRaro){
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
