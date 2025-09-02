/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alexandre.aulasjava20252;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class CalculaAlturas {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        double maiorAltura = 0.0;
        double menorAltura = 99.9;
        double somaAlturasHomens = 0.0;
        int numMulheres = 0;
        int numHomens = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a altura da pessoa " + i + ": ");
            double altura = input.nextDouble();
            System.out.print("Digite o sexo da pessoa " + i + " (M/F): ");
            String sexo = input.next();

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
            if (altura < menorAltura) {
                menorAltura = altura;
            }
            if (sexo == "M" || sexo == "m") {
                somaAlturasHomens += altura;
                numHomens++;
            } else {
                numMulheres++;
            }
        }
        double mediaAlturaHomens = somaAlturasHomens / numHomens;
        System.out.println("Maior altura: " + maiorAltura);
        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Média altura homens: " + mediaAlturaHomens);
        System.out.println("Numero mulheres: " + numMulheres);

    }
}
