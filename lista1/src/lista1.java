import java.util.Scanner;

public class lista1 {

    public static void questao1(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade mínima da peça: ");
        int minima = input.nextInt();

        System.out.print("Digite a quantidade maxima da peça: ");
        int maxima = input.nextInt();

        double estoqueMedio = (minima + maxima) / 2;

        System.out.printf("\nO estoque medio da peça é %f", estoqueMedio);

        input.close();

    }
    public static void main(String[] args) {
        questao1();
    }
}
