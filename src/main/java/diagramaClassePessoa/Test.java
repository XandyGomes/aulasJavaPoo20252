/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramaClassePessoa;

/**
 *
 * @author Alexandre
 */
public class Test {
    public static void main(String[] args) {
        Colaborador colab1 = new Colaborador();
        colab1.setNome("Alexandre");
        colab1.setBairro("Centro");
        colab1.setCidade("Franca");
        colab1.setCpf("123456789");
        colab1.setNasc(3,10,1980);
        
        
        Parceiro parc1 = new Parceiro();
        parc1.setNome("Fatec");
        parc1.setCnpj("321654987");
        parc1.setFundacao(null);
        
        System.out.println("Bairro do colaborador "+colab1.getNome()+ ": "+ colab1.getBairro());
        System.out.println("Nascimento do colaborador "+colab1.getNome()+ ": "+colab1.getNasc());
        System.out.println("Empresa parceira: "+ parc1.getNome());
        parc1.cadastrar();
        System.out.println("CNPJ da empresa "+parc1.getNome()+": "+parc1.getCnpj());
    }
}
