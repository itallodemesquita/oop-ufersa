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

    public static void questao4(){
        Scanner input = new Scanner(System.in);

        System.out.print("\nDigite o primeiro valor: ");
        int varA = input.nextInt();

        System.out.print("Digite o segundo valor: ");
        int varB = input.nextInt();

        System.out.print("Digite o terceiro valor: ");
        int varC = input.nextInt();

        System.out.print("Digite o último valor: ");
        int varD = input.nextInt();


        System.out.printf("\nA + B = %d. A * B = %d\n", (varA + varB), (varA * varB));
        System.out.printf("A + C = %d. A * C = %d\n", (varA + varC), (varA * varC));
        System.out.printf("A + D = %d. A * D = %d\n", (varA + varD), (varA * varD));
        System.out.printf("B + C = %d. B * C = %d\n", (varB + varC), (varB * varC));
        System.out.printf("B + D = %d. B * D = %d\n", (varB + varD), (varB * varD));
        System.out.printf("C + D = %d. C * D = %d\n", (varC + varD), (varC * varD));
        

        input.close();
    }

    public static void questao5(){

        Scanner input = new Scanner(System.in);

        System.out.print("\nQual foi o tempo de viagem? (em horas) ");
        float tempo = input.nextFloat();

        System.out.print("Qual foi a velocidade média na viagem? (em km/h) ");
        float velocidade = input.nextFloat();

        float distancia = tempo * velocidade;

        float litros = distancia / 12;

        System.out.printf("\nVelocidade média: %.2f km/h\n", velocidade);
        System.out.printf("Tempo de viagem: %.2f horas.\n", tempo);
        System.out.printf("Distância total: %.2f km.\n", distancia);
        System.out.printf("Combustível gasto: %.2f L. \n", litros);

        input.close();
    }

    public static void questao6(){
        Scanner input = new Scanner(System.in);

        System.out.print("Qual é a temperatura atual (em ºC)? ");
        float temp = input.nextFloat();

        System.out.printf("\nA temperatura em Fahrenheit é de %.2f ºF.", ((9 * temp + 160) / 5));

        input.close();

    }

    public static void questao7(){
        
    }

    public static void questao8(){
        
    }

    public static void questao9(){
        
    }

    public static void questao10(){
        
    }

    public static void main(String[] args) {
        questao6();
    }
}
