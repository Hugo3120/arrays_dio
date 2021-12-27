package exercicios_arrays_dio;

import java.util.Scanner;

/*
* Ler um vetor de 6 caracteres, e dizer quantas consoantes
* foram lidas e imprimir.
* */
public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;
        int cont = 0;

        do{
            System.out.println("Letra: ");
            String letra = scan.next();
            if(!(letra.equalsIgnoreCase("a")||
            letra.equalsIgnoreCase("e")||
            letra.equalsIgnoreCase("i")||
            letra.equalsIgnoreCase("o")||
            letra.equalsIgnoreCase("u"))){
                consoantes[cont] = letra;
                quantidadeConsoantes++;
            }
            cont++;


        }while(cont < consoantes.length);
        System.out.print("Consoantes: ");
        for ( String consoante: consoantes ) {
            if (consoante != null)
                System.out.print(consoante + " ");

        }
        System.out.println("\nQuantidades de consoantes " + quantidadeConsoantes);

    }
}
