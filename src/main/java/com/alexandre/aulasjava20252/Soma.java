/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alexandre.aulasjava20252;

import java.util.Scanner;


public class Soma {
    public static void main(String[] args) {
        //criar um scanner para obter entrada a partir
        //da janela de comando
         
        Scanner input = new Scanner(System.in);
        int number1, number2, sum, sum2;
        
        System.out.println("PROGRAMA DE SOMA");
        System.out.print("Digite o primeiro numero: ");
        number1 = input.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        number2 = input.nextInt();
        
        sum = number1 + number2;
        sum2 = number2 + number2;
        
        System.out.printf("A soma1 é %d e a soma2 é %d", sum, sum2);
    }
}
