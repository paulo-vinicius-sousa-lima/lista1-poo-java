/*
 * Exercicio proposto: 
 * 1.Faça um programa que receba quatro números inteiros, calcule e mostre a soma desses números.
 */

package com.mycompany.exercicio001lista;

import java.util.Scanner;

/**
 *
 * @author Paulo Vinícius Sousa Lima
 */

public class Exercicio001lista {

    public static void soma4Numeros(Scanner sc) {

        int soma = 0, numero;

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o numero [" + (i + 1) + "]: ");
            numero = sc.nextInt();
            soma = soma + numero;
        }

        System.out.println("A soma e: " + soma);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 1;

        while (opcao != 0) {

            System.out.print("\n***** MENU *****\n1 - Somar 4 numeros\n0 - Sair\nOpcao escolhida: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    soma4Numeros(sc);
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
