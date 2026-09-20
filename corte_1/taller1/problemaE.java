import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            long number = sc.nextLong();

            int count = 0;

            while (true) {

                // Convertimos el número a String
                String original = String.valueOf(number);

                // reversed contiene el número invertido
                String reversed = new StringBuilder(original)
                        .reverse()
                        .toString();

                // Comparamos original con reversed
                if (original.equals(reversed)) {
                    System.out.println(count);
                    break;
                }

                // Invertimos el String y lo convertimos nuevamente a número
                long reverseNumber = Long.parseLong(reversed);

                // Sumamos número + número invertido
                number = number + reverseNumber;

                count++;

                // Si llega a 1E10 o más, es sospechoso de Lychrel
                if (number >= 10000000000L) {
                    System.out.println("L");
                    break;
                }
            }
      

        sc.close();
    }
}
