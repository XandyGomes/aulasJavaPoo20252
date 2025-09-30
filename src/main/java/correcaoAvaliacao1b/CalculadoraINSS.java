/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correcaoAvaliacao1b;

/**
 *
 * @author Alexandre
 */
public class CalculadoraINSS {
    private double porcentagemINSS;

    public void setPorcentagemINSS(double porcentagemINSS) {
        this.porcentagemINSS = porcentagemINSS;
    }
    
    //cálculo do desconto
    public double calcularDescontoINSS(double salarioBruto){
        return salarioBruto * (porcentagemINSS / 100.0);
    }
       
}
