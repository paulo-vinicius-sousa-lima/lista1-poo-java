/*
 * Exercicio proposto: 
 * 2.Faça um programa que receba três notas, calcule e mostre a média aritmética entre elas.
 */

package com.mycompany.exercicio002lista;

import java.util.Scanner;

/**
 *
 * @author Paulo Vinícius Sousa Lima
 */

public class Exercicio002lista {

    public static void calculaMedia(Scanner sc) {

        System.out.print("Coloque a primeira nota: ");
        float n1 = sc.nextFloat();
        System.out.print("Coloque a segunda nota: ");
        float n2 = sc.nextFloat();
        System.out.print("Coloque a terceira nota: ");
        float n3 = sc.nextFloat();

        float media = (n1 + n2 + n3) / 3;

        System.out.print("A media e: " + media);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 1;

        while (opcao != 0) {

            System.out.print("\n***** MENU *****\n1 - Calcular media\n0 - Sair\nOpcao escolhida: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    calculaMedia(sc);
                    break;
                case 0:
                    System.out.println("\nFIM!\n");
                    break;
                default:
                    System.out.println("\nDigite um valor valido!");
                    break;
            }

        }

        sc.close();

    }
}
