public class Fatorial {
    public static void main(String[] args) {
        double i = 6;

        if (i < 100 && i > 0) {
            double fatorial = 1;
            while (i > 1) {
                fatorial = i * fatorial;
                i--;
            }
            System.out.printf("%.0f", fatorial);
        } else {
            System.out.println("Entre um numero entre 1 e 100");
        }

    }
}