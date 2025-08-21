/*
 * Exercicio proposto: 
 * 3.Faça um programa que receba três notas e seus respectivos pesos, calcule e mostre a média ponderada.
 */

package com.mycompany.exercicio003lista;

import java.util.Scanner;

/**
 *
 * @author Paulo Vinícius Sousa Lima
 */

public class Exercicio003lista {

    public static void calculaMediaPonderada(Scanner sc) {

        float[] nota = new float[3];
        float[] peso = new float[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Coloque a nota         (ex: 2,5) [" + (i + 1) + "]: ");
            nota[i] = sc.nextFloat();
            System.out.print("Coloque o peso da nota (ex: 1,5) [" + (i + 1) + "]: ");
            peso[i] = sc.nextFloat();
        }

        double mediaPonderada = ((nota[0] * peso[0]) + (nota[1] * peso[1]) + (nota[2] * peso[2]))
                / (peso[0] + peso[1] + peso[2]);

        System.out.println("A media ponderada e: " + mediaPonderada);

    }

    public static void main(String[] args) {

        int opcao = 1;
        Scanner sc = new Scanner(System.in);

        while (opcao != 0) {
            System.out
                    .print("\n*********** MENU ***********\n1 - Calcular Media Ponderada\n0 - Sair\nOpcao escolhida: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    calculaMediaPonderada(sc);
                    break;
                case 0:
                    System.out.println("\nFim!\n");
                    break;
                default:
                    System.out.println("\nColoque um valor valido!");
                    break;
            }
        }

        sc.close();
    }
}
