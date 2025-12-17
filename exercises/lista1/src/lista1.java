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
        System.out.printf("tempo de viagem: %.2f horas.\n", tempo);
        System.out.printf("Distância total: %.2f km.\n", distancia);
        System.out.printf("Combustível gasto: %.2f L. \n", litros);

        input.close();
    }

    public static void questao6(){
        Scanner input = new Scanner(System.in);

        System.out.print("Qual é a temperatura atual (em ºC)? ");
        float tempo = input.nextFloat();

        System.out.printf("\nA temperatura em Fahrenheit é de %.2f ºF.", ((9 * tempo + 160) / 5));

        input.close();

    }

    public static void questao7(){
        Scanner input = new Scanner(System.in);

        System.out.print("Qual é a temperatura atual (em ºF)? ");
        float tempo = input.nextFloat();

        System.out.printf("\nA temperatura em Celsius é de %.2f ºC.", ((tempo - 32) * 5 / 9));

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
        Scanner input = new Scanner(System.in);
        int buffer;

        System.out.print("\nDigite um número inteiro 1: ");
        int num1 = input.nextInt();

        System.out.print("\nDigite um número inteiro 2: ");
        int num2 = input.nextInt();

        System.out.print("\nDigite um número inteiro 3: ");
        int num3 = input.nextInt();

        System.out.print("\nDigite um número inteiro 4: ");
        int num4 = input.nextInt();

        System.out.print("\nDigite um número inteiro 5: ");
        int num5 = input.nextInt();

        // Condições para ordenar o maior número (posição 5)
        if (num1 > num2) { buffer = num1; num1 = num2; num2 = buffer; }
        if (num2 > num3) { buffer = num2; num2 = num3; num3 = buffer; }
        if (num3 > num4) { buffer = num3; num3 = num4; num4 = buffer; }
        if (num4 > num5) { buffer = num4; num4 = num5; num5 = buffer; }

        // Condições para armazenar o segundo maior (posição 4)
        if (num1 > num2) { buffer = num1; num1 = num2; num2 = buffer; }
        if (num2 > num3) { buffer = num2; num2 = num3; num3 = buffer; }
        if (num3 > num4) { buffer = num3; num3 = num4; num4 = buffer; }

        // Condições para armazenar o terceiro maior (posição 3)
        if (num1 > num2) { buffer = num1; num1 = num2; num2 = buffer; }
        if (num2 > num3) { buffer = num2; num2 = num3; num3 = buffer; }

        // Condição para a posição 2
        if (num1 > num2) { buffer = num1; num1 = num2; num2 = buffer; }

        System.out.printf("Ordem crescente: %d, %d, %d, %d, %d", num1, num2, num3, num4, num5);
        System.out.printf("\nOrdem decrescente: %d, %d, %d, %d, %d", num5, num4, num3, num2, num1);

        input.close();
    }

    public static void questaoc4(){
        Scanner input = new Scanner(System.in);

        System.out.print("\nDigite um número inteiro 1: ");
        int num1 = input.nextInt();
        System.out.print("\nDigite um número inteiro 2: ");
        int num2 = input.nextInt();

        if (num1 < num2) {
            System.out.printf("\nA diferença do maior número pro maior é de %d.", (num2 - num1));
        } else {
            System.out.printf("\nA diferença do maior número pro maior é de %d.", (num1 - num2));
        }

        input.close();
    }

    public static void questaoc5(){
        Scanner input = new Scanner(System.in);

        System.out.print("\nDigite a nota 1: ");
        float nota1 = input.nextFloat();

        System.out.print("Digite a nota 2: ");
        float nota2 = input.nextFloat();

        System.out.print("Digite a nota 3: ");
        float nota3 = input.nextFloat();

        System.out.print("Digite a nota 4: ");
        float nota4 = input.nextFloat();

        float media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 6) {

            System.out.printf("\nMédia: %.2f (Aprovado).", media);

        } else {

            System.out.printf("\nMédia: %.2f (Recuperação).", media);
            System.out.print("\nDigite a nota de recuperação: ");
            float notafinal = input.nextFloat();

            float mediafinal = (media + notafinal) / 2;

            if (mediafinal >= 6) {
                System.out.printf("\nMédia final: %.2f (Aprovado).", mediafinal);
            } else {
                System.out.printf("\nMédia final: %.2f (Reprovado).", mediafinal);
            }
        }

        input.close();
    }

    public static void questaoc6(){
        Scanner input = new Scanner(System.in);

        System.out.print("\nDigite o primeiro número: ");
        float num1 = input.nextFloat();

        System.out.print("Digite o segundo número: ");
        float num2 = input.nextFloat();

        if (num1 == num2) {

            System.out.print("\nOs dois números são iguais.");

        } else if (num1 > num2) {

            System.out.printf("\nMaior número: %.2f", num1);
            System.out.printf("\nMenor número: %.2f", num2);

        } else {
            System.out.printf("\nMaior número: %.2f", num2);
            System.out.printf("\nMenor número: %.2f", num1);
        }

        input.close();
    }

    public static void questaoc7(){
        Scanner input = new Scanner(System.in);

        System.out.print("\nDigite um número inteiro: ");
        int num = input.nextInt();

        if (num >= 0 && num <= 9) {
            System.out.print("O valor é válido.");
        } else {
            System.out.print("Valor inválido");
        }

        input.close();
    }

    public static void questaoc8(){
        Scanner input = new Scanner(System.in);

        System.out.print("\nDigite o código: ");
        int code = input.nextInt();

        if ((code == 1) || (code == 2) || (code == 3)) {
            System.out.print("Código válido!");

            switch (code) {
                case 1:
                    System.out.print("\nCódigo: um");
                    break;
                case 2:
                    System.out.print("\nCódigo: dois");
                    break;
                case 3:
                    System.out.print("\nCódigo: três");
                    break;
                
            }
        } else {
            System.out.println("O código é inválido!");
        }

        input.close();
    }

    public static void questaoc9(){
        Scanner input = new Scanner(System.in);

        System.out.print("\nDigite a medida do lado A: ");
        float ladoA = input.nextFloat();

        System.out.print("Digite a medida do lado B: ");
        float ladoB = input.nextFloat();

        System.out.print("Digite a medida do lado C: ");
        float ladoC = input.nextFloat();

        if ((ladoA < (ladoB + ladoC) && ladoB < (ladoC + ladoA) && ladoC < (ladoA + ladoB))) {
            System.out.println("\nMedidas válidas!");

            if ((ladoA == ladoB) && ladoB == ladoC) {
                System.out.println("O triângulo é equilátero!");
            } else if ((ladoA == ladoB) || (ladoB == ladoC) || (ladoA == ladoC)) {
                System.out.println("O triângulo é isóceles!");
            } else {
                System.out.println("O triângulo é escaleno!");
            }
        } else {
            System.out.println("Os lados informados não formam um triângulo!");
        }

        input.close();
    }

    public static void questaoc10(){
        Scanner input = new Scanner(System.in);
        int menor = 99999;
        int maior = 0;

        System.out.print("Digite o número A: ");
        int a = input.nextInt();
        if (a < menor) {
            menor = a;
        }
        if (a > maior) {
            maior = a;
        }

        System.out.print("Digite o número B: ");
        int b = input.nextInt();
        if (b < menor) {
            menor = b;
        }
        if (b > maior) {
            maior = b;
        }

        System.out.print("Digite o número C: ");
        int c = input.nextInt();
        if (c < menor) {
            menor = b;
        }
        if (c > maior) {
            maior = c;
        }

        System.out.printf("\nMenor * maior = %d", (menor * maior));
        System.out.printf("\nmaior / menor = %.2f", (float) maior / menor);


        input.close();
    }

    public static void questaoc11(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = input.nextInt();

        if (num >= 0) {
            System.out.printf("%d é um número positivo.", num);
        } else {
            System.out.printf("%d é um número negativo.", num);
        }

        input.close();
    }

    public static void questaoc12(){
        Scanner input = new Scanner(System.in);

        int a = 0;
        int b = 0;

        System.out.print("Digite um número: ");
        int num = input.nextInt();

        if (num >= 0) {
            a = num;

        } else {
            b = num;
        }

        System.out.printf("Valor de A = %d\nValor de B = %d", a, b);

        input.close();
    }

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("""
                Questões feitas em sala.
                Escola a questão que quer ver de 1 a 10 (entrada, processamento e saída) e da 11 a 22 (condicionais):\t""");
        int questao = input.nextInt();

        switch (questao) {
            case 1:
                questao1();
                break;
            case 2:
                questao2();
                break;
            case 3:
                questao3();
                break;
            case 4:
                questao4();
                break;
            case 5:
                questao5();
                break;
            case 6:
                questao6();
                break;
            case 7:
                questao7();
                break;
            case 8:
                questao8();
                break;
            case 9:
                questao9();
                break;
            case 10:
                questao10();
                break;
            case 11:
                questaoc1();
                break;
            case 12:
                questaoc2();
                break;
            case 13:
                questaoc3();
                break;
            case 14:
                questaoc4();
                break;
            case 15:
                questaoc5();
                break;
            case 16:
                questaoc6();
                break;
            case 17:
                questaoc7();
                break;
            case 18:
                questaoc8();
                break;
            case 19:
                questaoc9();
                break;
            case 20:
                questaoc10();
                break;
            case 21:
                questaoc11();
                break;
            case 22:
                questaoc12();
                break;
            default:
                System.out.println("Questão inválida!");
        }

        input.close();

    }
}
