import jdk.nashorn.internal.ir.Symbol;

public class EstruturasRepeticao {
    public static void main(String[] args) {

        int i = 9;

//        executa pelo menos uma vez, depois
//        avalia a condição para saber se continua
        do{
            // código a ser executado
            System.out.println("do while");
        }while(i > 9);

//        verifica a condição para depois executar
        while (i > 9){
            System.out.println("while");
        }

//        for: executar uma vez para até a variavel atender a condição
//        pode declarar a variavel no próprio parametro do for
//        for (inicializacao da variavel; condicao de continuar ; incremento da variavel)

        for(int j = 0; j < 10 ; j++ ){
            System.out.println("for"  + j);
        }

//        for Each
//        iterar, percorrer um vetor em todas as suas posições

        String[] texto = new String[8];

        texto[1] = "João";
        texto[0] = "Maria";
        texto[0] = "Fatima";

        String stringConcatenada =    "JoãoMariaFatima";

        for (String arg: texto){
            System.out.println("forEach" + arg);
        }


    }
}
