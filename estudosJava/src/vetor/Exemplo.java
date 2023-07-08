package vetor;

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        float[] listaNotas = new float[5];

        float soma = 0;
        float media = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            listaNotas[i] = ler.nextFloat();
            soma = soma + listaNotas[i];
        }

        // Soma
        System.out.println("Soma das notas: " + soma);

        // Media
        media = soma / listaNotas.length;
        System.out.println("Média das notas: " + media);

        // Maior nota
        float maiorNota = listaNotas[0];
        for (int i = 0; i < listaNotas.length; i++) {
            if (listaNotas[i] > maiorNota) {
                maiorNota = listaNotas[i];
            }
        }
        System.out.println("Maior nota: " + maiorNota);

        // Notas acima da média
        System.out.println("Notas acima da média: ");
        for (int i = 0; i < listaNotas.length; i++) {
            if (listaNotas[i] > media) {
                System.out.println(listaNotas[i]);
            }
        }

        ler.close();
    }
}
