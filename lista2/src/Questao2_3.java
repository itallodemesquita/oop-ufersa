import java.util.Scanner;

public class Questao2_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n1 = input.nextInt();

        System.out.print("Digite um número inteiro: ");
        int n2 = input.nextInt();

        System.out.print("""
                O que deseja ver?
                (1) Ver se os dois números são múltiplos um do outro
                (2) Verificar se os números são pares
                (3) Verificar se a média dos números é maior ou igual a 7
                (4) Sair
                """);
        int opcao = input.nextInt();
        boolean encerrar = true;
        
        do {
            switch (opcao) {
                
                case 1:
                    if ((n1 % n2 == 0)) {
                        System.out.printf("%d é múltiplo de %d.", n1, n2);
                    } else if (n2 % n1 == 0) {
                        System.out.printf("%d é múltiplo de %d.", n2, n1);
                    } else {
                        System.out.print("Os dois números não são múltiplos.");
                    } break;
                
                case 2:
                    if ((n1 % 2 == 0) && (n2 % 2 == 0)) {
                        System.out.print("Um dos números é par.");
                    } else {
                        System.out.print("Nenhum dos números são pares.");
                    } break;

                case 3:
                    float media = (n1 + n2) / 2;
                    if (media >= 7) {
                        System.out.print("A média dos dois números é maior ou igual que 7.");
                    } else {
                        System.out.print("A média dos dois números é menor que 7.");
                    } break;

                case 4:
                    System.out.print("Saindo...");
                    encerrar = false;
                    break;
            }

        } while (encerrar);

        input.close();
        
    }
}