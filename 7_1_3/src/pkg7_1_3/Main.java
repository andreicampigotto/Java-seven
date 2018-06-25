package pkg7_1_3;

import console.Console;

public class Main {

    public static void main(String[] args) {

        int max = 11;
        int vetor[] = new int[max];

        for (int i = 1; i < max; i++) {
            vetor[i] = i;
        }

        for (int i = 1; i < max; i++) {
            if (vetor[i] % 2 == 0) {
                Console.writeLn("Número: " + vetor[i]);
                vetor[i] = vetor [i] -1;
                Console.writeLn("Número: " + vetor[i]);
            }
        }
    }
}