/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correcaoAvaliacao1b;

/**
 *
 * @author Alexandre
 */
public class DadosFuncionario {

    private int codigoFuncionario;
    private double salarioBruto;

    public DadosFuncionario(int codigoFuncionario, double salarioBruto) {
        this.codigoFuncionario = codigoFuncionario;
        this.salarioBruto = salarioBruto;
    }

    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    //cálculo do vale-alimentação
    public double calcularValeAlimentacao() {
        if (salarioBruto <= 2000) {
            return 300.0;

        } else {
            return 0.0;
        }
    }

}
