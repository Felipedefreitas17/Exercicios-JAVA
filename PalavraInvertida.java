public class PalavraInvertida {
    public static void main(String[] args) {
//        carro => orrac
//        main = > niam
        String palavra = "teste";

        char[] vetorChar = new char[5];
        vetorChar[0]='c';

        System.out.println(palavra.indexOf("sabado"));

        System.out.println(palavra.charAt(0));
        System.out.println(palavra.length());

        String palavra2 = "t";
        System.out.println(palavra.equals(palavra2));
        System.out.println(palavra.length());

        for (int i = palavra.length() - 1; i >= 0; i--){
            System.out.print(palavra.charAt(i));
        }
        System.out.println("\n");

        byte[] caracteres = palavra.getBytes();

        for (int i = caracteres.length - 1; i >= 0; i--){
            System.out.print((char) caracteres[i]);
        }


    }
}
