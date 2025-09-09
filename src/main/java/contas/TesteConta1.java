/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contas;

import contas.Conta1;
import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class TesteConta1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //criar um objeto Conta1
        Conta1 minhaConta = new Conta1();
        
        //exibe o valor inicial do nome
        System.out.printf("O nome inicial é: %s%n%n", minhaConta.getName());
        
        System.out.print("Digite um nome: ");
        String nome = input.nextLine();
        minhaConta.setName(nome);
        
        System.out.printf("O nome em minhaConta é: %s%n%n", minhaConta.getName());
    }
    
}
