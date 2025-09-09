/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplos;

/**
 *
 * @author Alexandre
 */
public class CalculoDeNotasStatic {

    public static void main(String[] args) {
        
        double media = calcularMedia(7.5, 5.0, 8.0);
        System.out.println("Media = " + media);
    }

    public static double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3.0;
    }
}
