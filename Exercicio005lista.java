/*
 * Exercicio proposto: 
 * 5.Faça um programa que receba o salário de um funcionário e o percentual de aumento, calcule e mostre o valor do aumento e o novo salário.
 */

package com.mycompany.exercicio005lista;

import java.util.Scanner;

/**
 *
 * @author Paulo Vinícius Sousa Lima
 */

public class Exercicio005lista {

    public static void calcularSalarioComPercentualDeAumento(Scanner sc) {

        System.out.print("Digite o salario do funcionario (exs: '1.532,50', '850,23'...): ");
        double salario = sc.nextDouble();
        System.out.print("Digite o percentual de aumento (sem %)(exs: '25', '50'...): ");
        double percentual = sc.nextDouble();

        double salarioNovo = salario + (salario * (percentual / 100));

        System.out.println("\nSalario sem aumento: " + salario);
        System.out.print("Percentual de aumento: " + percentual + "%\n");
        System.out.println("Salario com aumento: " + salarioNovo + "\n");

    }

    public static void main(String[] args) {

        int opcao = 1;
        Scanner sc = new Scanner(System.in);

        while (opcao != 0) {

            System.out.print(
                    "****************************** MENU ******************************\n1 - Calcular salario de funcionario com percentual de aumento\n0 - Sair\nOpcao escolhida: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    calcularSalarioComPercentualDeAumento(sc);
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
