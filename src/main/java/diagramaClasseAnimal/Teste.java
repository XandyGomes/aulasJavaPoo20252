/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramaClasseAnimal;

/**
 *
 * @author Alexandre
 */
public class Teste {
    public static void main(String[] args) {
        Cavalo cavalo1 = new Cavalo();
        Cavalo cavalo2 = new Cavalo();
        Leao leao1 = new Leao();
        Leao leao2 = new Leao();
        
        cavalo1.setRaca("Mangalarga");
        cavalo1.setTamanho((float)2.5);
        cavalo1.setCor("Preto com manchas brancas");

        cavalo2.setRaca("Quarto de Milha");
        cavalo2.setTamanho(3);
        cavalo2.setCor("Branco com manchas pretas");
        
        leao1.setCor("Amarelo");
        leao1.setJuba(true);
        leao1.setTamanho(1);
        
        leao2.setCor("Branco");
        leao2.setJuba(false);
        leao2.setTamanho(2);
        
        System.out.println("###Cavalo 01###");
        System.out.println(cavalo1.getRaca());
        System.out.println(cavalo1.getTamanho());
        System.out.println(cavalo1.getCor());
        cavalo1.fugir();
        
        System.out.println("###Cavalo 02###");
        System.out.println(cavalo2.getRaca());
        System.out.println(cavalo2.getTamanho());
        System.out.println(cavalo2.getCor());
        cavalo2.comer();
        
        System.out.println("###Leão 01###");
        System.out.println(leao1.getCor());
        System.out.println(leao1.getTamanho());
        System.out.println(leao1.getJuba());
        leao1.comer();
        
        System.out.println("###Leão 02###");
        System.out.println(leao2.getCor());
        System.out.println(leao2.getTamanho());
        System.out.println(leao2.getJuba());
        leao2.cacar();
       
    }
}
