/*
 * Exercicio proposto: 
 * 6.Faça um programa que receba o salário base de um funcionário, calcule e mostre o salário a receber, sabendo-se que o funcionário tem gratificação de 5% sobre o salário base e paga imposto de 7% sobre este salário.
 */

package com.mycompany.exercicio006lista;

import java.util.Scanner;

/**
 *
 * @author Paulo Vinícius Sousa Lima
 */

public class Exercicio006lista {

    public static void calculaSalarioComGratificacaoTirandoImposto(Scanner sc) {

        System.out.print("Digite o salario base do funcionario (exs: '1.532,50', '850,23'...): ");
        double salario = sc.nextDouble();

        salario = salario + (salario * 0.05) - (salario * 0.07);

        System.out.println("\nSalario a receber: " + salario);

    }

    public static void main(String[] args) {

        int opcao = 1;
        Scanner sc = new Scanner(System.in);

        while (opcao != 0) {

            System.out.print(
                    "************************************ MENU ************************************\n1 - Calcular salario base de funcionario com gratificacao e tirando imposto\n0 - Sair\nOpcao escolhida: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    calculaSalarioComGratificacaoTirandoImposto(sc);
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
