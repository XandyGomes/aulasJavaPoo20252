/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correcaoAvaliacao1b;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //entrada
        System.out.print("Código do funcionário: ");
        int codigo = input.nextInt();

        System.out.print("Porcentagem do INSS (%): ");
        double porcentagemINSS = input.nextDouble();

        System.out.print("Salário bruto (R$): ");
        double salarioBruto = input.nextDouble();
        
        //objetos
        CalculadoraINSS calc = new CalculadoraINSS();
        calc.setPorcentagemINSS(porcentagemINSS);
        
        DadosFuncionario dados = new DadosFuncionario(codigo, salarioBruto);
        
        //cálculos
        double descontoINSS = calc.calcularDescontoINSS(dados.getSalarioBruto());
        double valeAlimentacao = dados.calcularValeAlimentacao();
        double totalReceber = dados.getSalarioBruto() - descontoINSS + valeAlimentacao;
        
        // Saída
        System.out.println("\n=== RESUMO FOLHA ===");
        System.out.println("Código do funcionário: " + dados.getCodigoFuncionario());
        System.out.printf("Salário bruto: R$ %.2f%n", dados.getSalarioBruto());
        System.out.printf("Desconto INSS (%.2f%%): R$ %.2f%n", porcentagemINSS, descontoINSS);
        System.out.printf("Vale-alimentação: R$ %.2f%n", valeAlimentacao);
        System.out.printf("Salário líquido (Total a receber): R$ %.2f%n", totalReceber);        
    }
}
