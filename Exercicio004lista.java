/*
 * Exercicio proposto: 
 * 4.Faça um programa que receba o salário de um funcionário, calcule e mostre o novo salário, sabendo-se que este sofreu um aumento de 25%.
 */

package com.mycompany.exercicio004lista;

import java.util.Scanner;

/**
 *
 * @author Paulo Vinícius Sousa Lima
 */

public class Exercicio004lista {

    public static void calcularSalario(Scanner sc) {

        System.out.print("Digite o salario do funcionario (exs: '1.532,50', '850,23'...): ");
        double salario = sc.nextDouble();
        double salarioNovo = salario + (0.25d * salario);
        System.out.println("Salario (acrecentados os 25%): " + salarioNovo + "\n");

    }

    public static void main(String[] args) {

        int opcao = 1;
        Scanner sc = new Scanner(System.in);

        while (opcao != 0) {

            System.out.print(
                    "************************ MENU ************************\n1 - Calcular salario de funcionario com 25% de aumento\n0 - Sair\nOpcao escolhida: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    calcularSalario(sc);
                    break;
                case 0:
                    System.out.println("Fim!\n");
                    break;
                default:
                    System.out.println("Coloque um valor valido!\n");
                    break;
            }
        }

        sc.close();

    }
}
