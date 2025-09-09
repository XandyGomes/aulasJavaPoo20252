/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contas;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class TesteTodasContas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Conta1 obj1 = new Conta1();
        System.out.print("Digite o nome do obj1: ");
        String nome = entrada.nextLine();
        obj1.setName(nome);
        
        Conta2 obj2 = new Conta2("Gomes");
        Conta2 obj3 = new Conta2("Silva");
        
        System.out.printf("Os nomes de todos os objetos: %s %s %s",
                obj1.getName(), obj2.getName(), obj3.getName());
    }
}
