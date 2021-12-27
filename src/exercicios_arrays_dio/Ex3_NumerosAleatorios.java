package exercicios_arrays_dio;

import java.util.Random;

/*
* Programa para ler 20 números inteiros aleatórios
* entre a e 100 e armazenar em um vetor, e depois mostrar seus sucessor.
* */
public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {

        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;

        }
        System.out.print("Números Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");

        }
        System.out.print("\nSucessores dos números Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero + 1) + " ");
        }
    }
}
