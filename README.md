# Exercício 1072 – Intervalo 2 | Java

## 📌 Descrição

Este projeto resolve o exercício **1072 – Intervalo 2**, da plataforma [Beecrowd](https://judge.beecrowd.com/pt/problems/view/1072).

O programa lê uma quantidade de números inteiros e verifica quantos estão **dentro** e quantos estão **fora** do intervalo de 10 a 20, incluindo os extremos.

## 🛠️ Tecnologias utilizadas

- Java
- Scanner para entrada de dados
- Estrutura de repetição `while`
- Estrutura condicional `if/else`
- Operadores lógicos e relacionais

## 💻 Código-fonte

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i = 1, x, n, in = 0, out = 0;

        x = scanner.nextInt();

        while (i <= x) {
            n = scanner.nextInt();

            if (n >= 10 && n <= 20) {
                in = in + 1;
            } else {
                out = out + 1;
            }

            i++;
        }

        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
```

## 🧠 Lógica do programa

1. O programa lê um número inteiro `x`, que representa a quantidade de números que serão analisados.
2. Inicializa os contadores `in` e `out` com zero.
3. Utiliza um laço `while` para ler exatamente `x` números.
4. Para cada número, verifica a condição `n >= 10 && n <= 20`.
5. Se a condição for verdadeira, incrementa o contador `in`.
6. Caso contrário, incrementa o contador `out`.
7. Ao final, apresenta a quantidade de números dentro e fora do intervalo.

## 📥 Exemplo de entrada

```text
4
14
123
10
-25
```

## 📤 Exemplo de saída

```text
2 in
2 out
```

## 🔎 Explicação do exemplo

| Número | Resultado |
|---|---|
| 14 | Dentro do intervalo |
| 123 | Fora do intervalo |
| 10 | Dentro do intervalo |
| -25 | Fora do intervalo |

**Resultado:** 2 números dentro e 2 números fora do intervalo.

## 📚 Conceitos praticados

- Leitura de dados com `Scanner`
- Laços de repetição com `while`
- Condições com `if/else`
- Operador lógico `&&` (E)
- Operadores relacionais `>=` e `<=`
- Contadores e incremento de variáveis

## 🎯 Objetivo

Praticar estruturas de repetição e condições em Java, desenvolvendo a capacidade de analisar valores numéricos e contabilizar resultados conforme regras estabelecidas.

---

**Plataforma:** Beecrowd  
**Problema:** 1072 – Intervalo 2  
**Linguagem:** Java
