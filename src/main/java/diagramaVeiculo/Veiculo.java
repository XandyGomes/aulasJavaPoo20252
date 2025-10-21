/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramaVeiculo;

/**
 *
 * @author Alexandre
 */
public abstract class Veiculo implements IVeiculo {
    
    private Integer velocidade;
    private String placa;
    private String chassi;
    private Integer ano;
    private Double preco;
    
    public static Double calcularValorVenda(Veiculo preco){
        return preco.getPreco() - (preco.getPreco() * 0.10);
    }

    public Integer getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Integer velocidade) {
        this.velocidade = velocidade;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    @Override
    public void desligar(){
        System.out.println("Desligado");
    }
    
    @Override
    public void ligar(){
        System.out.println("Ligado");
    }
    
   
}
