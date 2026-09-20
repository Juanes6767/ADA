import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean encontrado= false;
        int N = sc.nextInt();
        int primero=0;
        int segundo=0;
        String texto = String.valueOf(N*N);
        for (int i = 1;i<texto.length();i++){
            primero = Integer.parseInt(texto.substring(0 ,i));
            segundo = Integer.parseInt(texto.substring(i,texto.length()));
                if ( primero+segundo  == N){
                    if (segundo!=0){
                    System.out.println("KAP");
                    encontrado= true;
                    break;
                }
        }
    }
        if (!encontrado){
            System.out.println("NO");
        }
}
}
