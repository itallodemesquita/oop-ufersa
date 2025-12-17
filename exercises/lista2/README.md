# Estruturas de seleção, repetição, matrizes, vetores...

Este guia serve como uma referência rápida ("cheat sheet") para os conceitos de estruturas de seleção, repetição, vetores (arrays), matrizes e a modularização de código com métodos em Java.

## 1. Estruturas de Seleção (Decisão)

Permitem que o programa escolha diferentes caminhos de execução com base em condições.

---

### if

* **Quando Usar:** Para executar um bloco de código apenas se uma condição for verdadeira.

* **Exemplo Prático:**

    ```java
    if (idade >= 18) {
        System.out.println("Maior de idade.");
    }
    ```

---

### if-else

* **Quando Usar:** Para escolher entre dois caminhos possíveis (um para `true`, outro para `false`).

* **Exemplo Prático:**

    ```java
    if (nota >= 7.0) {
        System.out.println("Aprovado");
    } else {
        System.out.println("Reprovado");
    }
    ```

---

### if-else if-else

* **Quando Usar:** Para testar uma série de condições em sequência, quando há mais de dois resultados possíveis.

* **Exemplo Prático:**

    ```java
    if (indice > 0.4) {
        System.out.println("Grupos 1 e 2 suspensos.");
    } else if (indice > 0.3) {
        System.out.println("Grupo 1 suspenso.");
    } else {
        System.out.println("Níveis aceitáveis.");
    }
    ```

---

### switch-case

* **Quando Usar:** Para comparar o valor de uma **única variável** contra uma lista de **valores exatos**. Ideal para menus.

* **Exemplo Prático:**

    ```java
    int opcao = 2;
    switch (opcao) {
        case 1:
            System.out.println("Adição");
            break;
        case 2:
            System.out.println("Subtração");
            break;
        default:
            System.out.println("Opção inválida.");
    }
    ```

---

### Operador Ternário ( `? :` )

* **Quando Usar:** Versão **compacta** de um `if-else` simples, geralmente para atribuir um valor a uma variável.

* **Exemplo Prático:**

    ```java
    String status = (idade >= 18) ? "Maior de idade" : "Menor de idade";
    ```

## 2. Estruturas de Repetição (Laços / Loops)

Permitem que um bloco de código seja executado múltiplas vezes, seja por um número definido de vezes ou enquanto uma condição for verdadeira.

---

### for

* **Quando Usar:** Quando você sabe **exatamente quantas vezes** quer repetir o bloco de código. Ideal para percorrer vetores ou executar uma tarefa um número fixo de vezes.

* **Exemplo Prático:**

    ```java
    // Imprime os números de 1 a 10
    for (int i = 1; i <= 10; i++) {
        System.out.println("Número: " + i);
    }
    ```

---

### while

* **Quando Usar:** Quando você quer repetir um bloco **enquanto** uma condição for verdadeira. O número de repetições pode ser desconhecido e depende da lógica do programa (ex: entrada do usuário).

* **Exemplo Prático:**

    ```java
    // Pede números até que um negativo seja digitado (padrão "sentinela")
    Scanner entrada = new Scanner(System.in);
    int numero = 0;

    while (numero >= 0) {
        System.out.print("Digite um número (negativo para sair): ");
        numero = entrada.nextInt();
        if (numero >= 0) {
            System.out.println("Você digitou: " + numero);
        }
    }
    System.out.println("Fim do programa.");
    ```

---

### do-while

* **Quando Usar:** Similar ao `while`, mas com a garantia de que o bloco de código será executado **pelo menos uma vez**, pois a condição é verificada no final.

* **Exemplo Prático:**

    ```java
    // Pede uma senha até que a correta seja digitada
    Scanner entrada = new Scanner(System.in);
    String senha;

    do {
        System.out.print("Digite a senha: ");
        senha = entrada.nextLine();
    } while (!senha.equals("admin123"));

    System.out.println("Acesso concedido!");
    ```

---

## 3. Vetores (Arrays) e Matrizes

Estruturas que permitem armazenar coleções de dados do mesmo tipo em uma única variável.

---

### Vetores (Arrays de 1 Dimensão)

* **O que é:** Uma lista de tamanho fixo para armazenar múltiplos valores do mesmo tipo. Os elementos são acessados por um índice, começando em 0.

* **Declaração e Inicialização:**

    ```java
    // Declara um vetor de 5 posições, inicializado com zeros
    int[] numeros = new int[5];

    // Declara e inicializa um vetor com valores definidos
    String[] nomes = {"Ana", "Bia", "Carlos"};
    ```

* **Acesso e Iteração:**

    ```java
    // Atribui um valor à primeira posição (índice 0)
    numeros[0] = 10;

    // Acessa o valor da segunda posição
    System.out.println("O segundo nome é: " + nomes[1]); // Saída: Bia

    // Itera sobre o vetor para imprimir todos os valores
    System.out.println("\nTodos os nomes:");
    for (int i = 0; i < nomes.length; i++) {
        System.out.println(nomes[i]);
    }
    ```

---

### Matrizes (Arrays de 2 Dimensões)

* **O que é:** Um "vetor de vetores". Pode ser visualizado como uma tabela com linhas e colunas, ideal para representar grades, tabuleiros, etc.

* **Declaração e Inicialização:**

    ```java
    // Declara uma matriz de 3 linhas e 4 colunas
    int[][] matriz = new int[3][4];

    // Declara e inicializa com valores
    int[][] tabela = {
        {1, 2, 3}, // Linha 0
        {4, 5, 6}  // Linha 1
    };
    ```

* **Acesso e Iteração:**

    ```java
    // Atribui um valor ao elemento na linha 0, coluna 1
    matriz[0][1] = 7;

    // Acessa o valor na linha 1, coluna 2 da 'tabela'
    System.out.println("Valor: " + tabela[1][2]); // Saída: 6

    // Itera sobre a matriz usando laços aninhados
    System.out.println("\nImprimindo a tabela completa:");
    for (int i = 0; i < tabela.length; i++) { // Percorre as linhas
        for (int j = 0; j < tabela[i].length; j++) { // Percorre as colunas da linha atual
            System.out.print(tabela[i][j] + "\t"); // \t para tabular
        }
        System.out.println(); // Pula para a próxima linha no console
    }
    ```

## 4. Métodos (Funções)

Blocos de código reutilizáveis que realizam uma tarefa específica. Ajudam a organizar e modularizar o programa.

### Estrutura de um Método

```java
public static tipoDeRetorno nomeDoMetodo(tipoDoParametro1 nomeDoParametro1, tipoDoParametro2 nomeDoParametro2) {
    // Corpo do método: código que realiza a tarefa
    return valorDeRetorno; // Obrigatório se o retorno não for 'void'
}
```

- **`public static`**: Modificadores de acesso e contexto (podem variar).
- **`tipoDeRetorno`**: O tipo de dado que o método "devolve" ao final de sua execução (`int`, `double`, `String`, `boolean`, etc.). Se o método não devolve nada, usa-se a palavra-chave **`void`**.
- **`nomeDoMetodo`**: O nome que você dará ao método (ex: `calcularMedia`, `verificarParidade`).
- **`(...)`**: Lista de parâmetros (os dados que o método precisa receber para trabalhar). Pode ser vazia.

### Exemplo Prático

O formato de projeto pedido na sua lista (`Main.java` + `QuestaoX.java`):

**Arquivo `Main.java`**
```java
public class Main {
    public static void main(String[] args) {
        // Criando uma instância da classe da questão
        QuestaoExemplo q = new QuestaoExemplo();
        q.run();
    }
}
```

**Arquivo `QuestaoExemplo.java`**
```java
public class QuestaoExemplo {

    // Método que recebe dois inteiros e retorna a soma deles
    public int somar(int a, int b) {
        return a + b;
    }

    // Método que não retorna nada (void), apenas exibe uma mensagem
    public void exibirSaudacao(String nome) {
        System.out.println("Olá, " + nome + "!");
    }

    // Método principal da classe da questão, onde a lógica é executada
    public void run() {
        // Chamando os métodos
        exibirSaudacao("Maria");

        int resultadoSoma = somar(10, 5);
        System.out.println("O resultado da soma é: " + resultadoSoma); // Imprime 15
    }
}
```