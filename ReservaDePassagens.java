import java.util.Random;
import java.util.Scanner;

public class ReservaDePassagens {
    public static void main(String[] args) {
        //        declarar a matriz
//        preenchem a matriz
//        passo 2:
//        exibem a matriz
//        pedir pra usuario digitar
//        verificar se esta ocupado
//        exibir mensagem se foi reservado ou5
//        percorri a matriz, atribuindo os valores aleatórios
        for (int fileira = 0; fileira < 28; fileira++) {
            for (int assento = 0; assento < 6; assento++) {
                aviao[fileira][assento] = random.nextBoolean();
            }
        }

//        criei a variavel executando que irá manter o loop abaixo até receber um diferente de 1
        int executando = 1;

//        laço de repetição da reserva
        do{

//            exibir todos os assentos ocupados / livres
            for (int fileira = 0; fileira < 28; fileira++) {
                for (int assento = 0; assento < 6; assento++) {
                    System.out.print((aviao[fileira][assento] ? "| OCUPADO |" : "|  LIVRE  |"));
                }
                System.out.println("\n");
            }

//            instanciando a classe Scanner para receber os inputs do usuário
            Scanner sc = new Scanner(System.in);

//          faz a leitura dos 2 valores (fileira / assento)
            System.out.println("Digite a fileira desejada (178): ");
            int fileira = sc.nextInt();

            System.out.println("Digite o assento desejado (Valor entre 1 e 6):");
            int assento = sc.nextInt();

//        se a posicao aviao[fileira][assento] for igual a true exibe mensagem de erro,
//        senão reserva
            if (aviao[fileira -1][assento -1]){
                System.out.println("Assento não disponivel");
            }else{
                aviao[fileira -1 ][assento - 1] = true;
                System.out.println("Assento Reservado com sucesso");
            }

            System.out.println("Deseja Continuar? (1 - Sim / 2 - Não)");
            executando = sc.nextInt();

        }while (executando == 1);

    }
}
