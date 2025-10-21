/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramaVeiculo;

/**
 *
 * @author Alexandre
 */
public class TesteDiagramaVeiculo {
    public static void main(String[] args) {
        
        Automovel auto = new Automovel();
        Motocicleta moto = new Motocicleta();
        
        System.out.println("===AUTOMÓVEL===");
        auto.ligar();;
        auto.acelerar(120);
        auto.frear(0);
        auto.desligar();
        auto.setPreco(75000.0);
        auto.setCor("Branco");
        auto.setPreco(auto.desconto(10.0));
        System.out.println("O valor de venda à vista do automóvel de cor " 
                + auto.getCor() 
                + " será de R$ " 
                + Veiculo.calcularValorVenda(auto));
        System.out.println("===============");
        
        System.out.println("===MOTOCICLETA===");
        moto.ligar();;
        moto.acelerar(80);
        moto.frear(0);
        moto.desligar();
        moto.setPreco(15000.0);
        moto.setPlaca("ABC123");
        System.out.println("O valor de venda à vista da motocicleta de placa " 
                + moto.getPlaca()
                + " será de R$ " 
                + Veiculo.calcularValorVenda(moto));
        System.out.println("===============");
        
        
    }
}
