/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramaClassePessoa;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Alexandre
 */
public abstract class Fisica extends Pessoa {
    private String cpf;
    private String rg;
    private String genero;
    private Date nasc;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getNasc() {
        return nasc;
    }

    public void setNasc(int dia, int mes, int ano) {
        Calendar data = Calendar.getInstance();
        data.set(Calendar.YEAR, ano);
        data.set(Calendar.MONTH, mes -1);
        data.set(Calendar.DAY_OF_MONTH, dia);
        
        this.nasc = data.getTime(); 
    }
    
    
}
