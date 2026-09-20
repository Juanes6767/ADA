import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String texto = String.valueOf(N*N);
        boolean encontrado = true;
        for (int i = 1; i<=N ;i++) {
            if ( (String.valueOf(i) + String.valueOf(N-i)).equals(texto) ){
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
