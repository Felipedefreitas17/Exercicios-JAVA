public class Hexadecimal {
    public static void main(String[] args) {
        int valor = 622441;
        int resto = 0;
        String hexadecimal = "";
        while (valor > 0) {
            resto = valor % 16;

            switch (resto) {
                case 10:
                    hexadecimal = "A" + hexadecimal;
                    break;
                case 11:
                    hexadecimal = "B" + hexadecimal;
                    break;
                case 12:
                    hexadecimal = "C" + hexadecimal;
                    break;
                case 13:
                    hexadecimal = "D" + hexadecimal;
                    break;
                case 14:
                    hexadecimal = "E" + hexadecimal;
                    break;
                case 15:
                    hexadecimal = "F" + hexadecimal;
                    break;
                default:
                    hexadecimal = resto + hexadecimal;
            }
            valor = valor / 16;

        }

        System.out.println(hexadecimal);
    }
}
