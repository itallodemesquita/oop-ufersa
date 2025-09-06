import java.util.Scanner;

/* Quick copy and paste

    Scanner input = new Scanner(System.in);

    input.close();

 */

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
        Scanner input = new Scanner(System.in);

        System.out.print("Qual é a temperatura atual (em ºF)? ");
        float temp = input.nextFloat();

        System.out.printf("\nA temperatura em Celsius é de %.2f ºC.", ((temp - 32) * 5 / 9));

        input.close();
        
    }

    public static void questao8(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a medida do raio da lata (em cm): ");
        float radius = input.nextFloat();

        System.out.print("Digite a medida da altura da lata (em cm): ");
        float height = input.nextFloat();

        System.out.printf("\nO volume da lata de óleo é de aproximadamente %.2f cm quadrados.", (3.14159 * (radius * radius) * height));

        input.close();
    }

    public static void questao9(){
        Scanner input = new Scanner(System.in);

        System.out.print("Você tem quantos anos? ");
        int anos = input.nextInt();
        int idadeDias = (anos * 365);

        System.out.print("...e quantos meses? ");
        int meses = input.nextInt();
        idadeDias = idadeDias + (meses * 30);

        System.out.print("...e quantos dias de vida? ");
        int dias = input.nextInt();
        idadeDias = idadeDias + dias;

        System.out.printf("\nVocê já viveu o total de %d dias de vida!", idadeDias);

        input.close();
    }

    public static void questao10(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = input.nextInt();

        System.out.printf("\n%d é igual a %d? %b", num1, num2, (num1 == num2));
        System.out.printf("\n%d é diferente de %d? %b", num1, num2, (num1 != num2));
        System.out.printf("\n%d é maior que %d? %b", num1, num2, (num1 > num2));
        System.out.printf("\n%d é menor que %d? %b", num1, num2, (num1 < num2));
        System.out.printf("\n%d é maior ou igual a %d? %b", num1, num2, (num1 >= num2));
        System.out.printf("\n%d é menor ou igual a %d? %b", num1, num2, (num1 <= num2));

        input.close();
        
    }

    public static void questaoc1(){
        Scanner input = new Scanner(System.in);

        System.out.print("\nDigite um número inteiro (A): ");
        int nA = input.nextInt();

        System.out.print("Digite um número inteiro (B): ");
        int nB = input.nextInt();

        if (nA != nB) {

            System.out.printf("\nValor de A (antes da troca) = %d.", nA);
            System.out.printf("\nValor de B (antes da troca) = %d.\n", nB);

            int buffer = nA;
            nA = nB;
            nB = buffer;

            System.out.printf("\nValor de A (depois da troca) = %d.", nA);
            System.out.printf("\nValor de B (depois da troca) = %d.", nB);

        } else {

            System.out.print("\nOs números A e B são iguais.");
        }



        input.close();
    }

    public static void questaoc2(){
        Scanner input = new Scanner(System.in);

        System.out.print("\nDigite um número inteiro: ");
        int num = input.nextInt();

        if (num >= 0) {
            System.out.printf("\nO módulo do número %d é %d", num, num);
        } else {
            int modulus = num * (-1);
            System.out.printf("\nO módulo do número %d é %d", num, modulus);
        }

        input.close();
    }

    public static void questaoc3(){

    }

    public static void questaoc4(){

    }

    public static void questaoc5(){

    }

    public static void questaoc6(){

    }

    public static void questaoc7(){

    }

    public static void questaoc8(){

    }

    public static void questaoc9(){

    }

    public static void questaoc10(){

    }

    public static void questaoc11(){

    }

    public static void questaoc12(){

    }

    public static void main(String[] args) {
        questaoc1();
    }
}
