/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package diagramaVeiculo;

/**
 *
 * @author Alexandre
 */
public interface IVeiculo {
    
    void acelerar(Integer valor);
    
    void frear(Integer valor);
    
    void ligar();
    
    void desligar();
    
    double desconto(double desc);
    
}
