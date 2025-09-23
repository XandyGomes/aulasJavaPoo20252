/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisao;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //Leia a porcentagem do IPI do usuário
        System.out.print("Digite a porcentagem do IPI: ");
        double porcentagemIpi = input.nextDouble();
        
        //Crie objetos das classes CalculadoraIPI e DadosCompra.
        CalculadoraIPI calculadoraIPI = new CalculadoraIPI(porcentagemIpi);
        DadosCompra produto1 = new DadosCompra();
        DadosCompra produto2 = new DadosCompra();
   
        //Leia os dados da compra do usuário.
        System.out.println("**Dados da Peça 1**");
        System.out.print("Código: ");
        int codPeca1 = input.nextInt();
        produto1.setCodPeca(codPeca1);
        System.out.print("Valor unitário: ");
        double valorPeca1 = input.nextDouble();
        produto1.setValorPeca(valorPeca1);
        System.out.print("Quantidade: ");
        int quantPeca1 = input.nextInt();
        produto1.setQuantPeca(quantPeca1);
        
        System.out.println("**Dados da Peça 2**");
        System.out.print("Código: ");
        int codPeca2 = input.nextInt();
        produto2.setCodPeca(codPeca2);
        System.out.print("Valor unitário: ");
        double valorPeca2 = input.nextDouble();
        produto2.setValorPeca(valorPeca2);
        System.out.print("Quantidade: ");
        int quantPeca2 = input.nextInt();
        produto2.setQuantPeca(quantPeca2);
        
        //calculo dos valores
        double valorTotalSemIpi = produto1.calcularValorTotalSemIpi() + produto2.calcularValorTotalSemIpi();
        double valorTotalComIpi = calculadoraIPI.calcularValorTotalComIpi(valorTotalSemIpi);
        double valorTotalIpi = valorTotalComIpi - valorTotalSemIpi;
        
        System.out.println("\n**Resultados:**");
        System.out.printf("Valor total dos produtos sem IPI: R$ %.2f\n", valorTotalSemIpi);
        System.out.printf("Valor total do IPI: R$ %.2f\n", valorTotalIpi);
        System.out.printf("Valor total dos produtos com IPI: R$ %.2f\n", valorTotalComIpi);        

                
                
        
        //impressão dos resultados
        
    }
}
