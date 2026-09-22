import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        String[] list = sc.nextLine().split(" ");
        int producto = 1;
        for (int i = 0;i<list.length;i++){
            producto*= Integer.valueOf(list[i]);
        }
        int mayor = 0;
        int gcd = 0;

        // Encontrar el mayor
        for (int i = 0; i < list.length; i++) {
            int num = Integer.parseInt(list[i]);

            if (num > mayor) {
                mayor = num;
            }
        }

        // Probar posibles divisores
        for (int i = 1; i <= mayor; i++) {

            boolean esGcd = true;

            for (int j = 0; j < list.length; j++) {
                int num = Integer.parseInt(list[j]);

                if (num % i != 0) {
                    esGcd = false;
                    break;
                }
            }

            if (esGcd) {
                gcd = i;
            }
        }

        System.out.println(producto/gcd);
    }
}
