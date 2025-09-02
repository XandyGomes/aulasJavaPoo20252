/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alexandre.aulasjava20252;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class CalculaProduto {
    int number;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, z, result;
        
        System.out.print("Digite o primeiro número: ");
        x = input.nextInt();
        
        System.out.print("Digite o segundo número: ");
        y = input.nextInt();
        
        System.out.print("Digite o terceiro número: ");
        z = input.nextInt();
        
        result = x * y * z;
        
        System.out.printf("O produto é %d", result);
    }
}
