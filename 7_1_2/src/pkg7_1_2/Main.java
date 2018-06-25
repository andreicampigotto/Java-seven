package pkg7_1_2;

import console.Console;

public class Main {

    public static void main(String[] args) {
        int max = 11;
        int vetor[] = new int[max];
        

        for (int i = 0; i < max; i++) {
            vetor[i] = i;
        }

        for (int i = max-1; i > 0; i--) {
            
            System.out.println("Numero: " + vetor[i]);
        }
    }
}


