/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class Temperatura {
    public static void main(String []args){
      Scanner input = new Scanner(System.in);
      
      System.out.print("Digite a temperatura em Celsius: ");
      double C = input.nextDouble();
      double F, K, Re, Ra;
      F = C * 1.8 + 32;
      K = C + 273.15;
      Re = C * 0.8;
      Ra = C * 1.8 + 32 + 459.67;
      
      System.out.printf("Fahrenheint: %.2f°F\n", F);
      System.out.printf("Kelvin: %.2fK\n", K);
      System.out.printf("Reaumur: %.2f°Re\n", Re);
      System.out.printf("Rankine: %.2f°R\n", Ra);
      
    }
}
