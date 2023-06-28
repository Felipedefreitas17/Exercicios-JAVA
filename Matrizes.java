import java.util.Random;

public class Matrizes {
    public static void main(String[] args) {


        int[][] matriz1 = new int[3][2];
        int[][] matriz2 = new int[2][3];
        int[][] matriz3 = new int[2][2];


        Random random = new Random();

        //preenche matriz 1
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                matriz1[i][j] = random.nextInt(100);
            }
        }

        //preenche matriz 2
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matriz2[i][j] = random.nextInt(100);
            }
        }

        // mostra matriz1
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println("\n");
        }


        // mostra matriz2
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println("\n");
        }


    }
}