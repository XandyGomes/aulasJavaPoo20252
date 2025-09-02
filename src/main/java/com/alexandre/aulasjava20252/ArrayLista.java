/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alexandre.aulasjava20252;

import java.util.ArrayList;

/**
 *
 * @author Alexandre
 */
public class ArrayLista {
    public static void main(String[] args) {
        //criando uma ArrayList sem  definir o tamanho inicial
        ArrayList<String> lista = new ArrayList<>();
        
        //adicionando elementos da lista
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");
        
        //acessando elemmentos da lista
        for(String elemento : lista){
            System.out.println(elemento);
        }
        
        System.out.println("Apenas a posição 0: " + lista.get(0));
        
        //tamanho da lista
        System.out.println("Tamanho da lista: " + lista.size());
    }
}
