/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alexandre.aulasjava20252;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class AplicandoArrayList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> array = new ArrayList<>();
        double soma = 0.0;
        double numeros = 0.0; 
        double media = 0.0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros = input.nextDouble();
            array.add(numeros);
            soma += numeros;
        }

        for (double num : array) {
            System.out.println(num);
        }

        media = soma / array.size();

        System.out.printf("\nMédia: %.2f\n", media);
    }
}
