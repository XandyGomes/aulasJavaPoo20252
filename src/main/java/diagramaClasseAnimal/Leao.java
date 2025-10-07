/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramaClasseAnimal;

/**
 *
 * @author Alexandre
 */
public class Leao extends Animal{
    private boolean juba;

    public boolean isJuba() {
        return juba;
    }

    public void setJuba(boolean juba) {
        this.juba = juba;
    }
    
    String teste = "a";
    
    public String getJuba(){
        if(isJuba()){
            return "com juba";
        }else{
            return "sem juba";
        }
    }
    
    public void cacar(){
        System.out.println("O Leão "+getJuba()+" saiu para caçar!");
    }
}
