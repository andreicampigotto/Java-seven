
package pkg7_1_5;
import console.Console;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
          int max = 11;
        int vetor[] = new int[max];
        Random n = new Random();
        int x = 0, y = 0 ;

        for (int i = 1; i < max; i++) {

            vetor[i] = n.nextInt(101);
        }
        int menor = 999;
        int maior = 0;

        for (int i = 1; i < max; i++) 
        {
            //Console.writeLn("Número " + i + ": " + vetor[i]);
            if(vetor [i] < menor)
            {
            menor = vetor [i];
            x = i;
            }
            
            if(vetor [i] > maior)
            {
            maior = vetor [i];
            y = i;
            }
        }
        Console.writeLn("Menor " + x + ": " + menor);
        Console.writeLn("Maior " + y + ": " + maior);
        
    }
}

