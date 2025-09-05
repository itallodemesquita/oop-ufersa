import java.util.Scanner;

public class lista1 {

    public static void questao1(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade mínima da peça: ");
        int minima = input.nextInt();

        System.out.print("Digite a quantidade maxima da peça: ");
        int maxima = input.nextInt();

        double estoqueMedio = (minima + maxima) / 2;    

        System.out.printf("\nO estoque medio da peça é %.2f", estoqueMedio);

        input.close();

    }

    public static void questao2(){
        Scanner input = new Scanner(System.in);

        System.out.print("Qual é a cotação atual do dólar? ");
        float cotacao = input.nextFloat();

        System.out.print("Quantos dólares você possui? ");
        float saldoDolar = input.nextFloat();

        float saldoReal = cotacao * saldoDolar;

        System.out.printf("Sua quantia em dólares equivale a R$ %f.", saldoReal);

        input.close();
    }

    public static void questao3(){
        Scanner input = new Scanner(System.in);

        System.out.print("Vendedor, digite o seu ID: ");
        int id = input.nextInt();

        System.out.print("Digite o código da peça: ");
        int idPeca = input.nextInt();

        System.out.print("Qual é o preço da peça?: ");
        float valorPeca = input.nextFloat();

        System.out.print("Quantas unidades foram vendidas? ");
        int qtd = input.nextInt();

        float total = valorPeca * qtd;

        System.out.printf("\nValor total da venda da peça %d: %f\n", idPeca, total);
        System.out.printf("Vendedor %d, sua comissão é de R$ %.2f.\n", id, (total * 0.05));

        input.close();
    }

    public static void main(String[] args) {
        questao3();
    }
}
