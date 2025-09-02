/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alexandre.aulasjava20252;

/**
 *
 * @author Alexandre
 */
public class Declaracao_Array {
    public static void main(String[] args) {
        //[] - são inseridos em uma variável que referencia um array
        int[] a = new int[4];
        
        //outra maneira de fazer a declaração de Array
        int[] b;
        b = new int[10];
        
        //declarando vários arrays
        int[] r = new int[44], k = new int[23];
        
        //{} - inicializar valores em um array na declaração
        int[] iniciaValores = {12,32,54,6,8,89,64,6};
        
        //declara um array de inteiros
        int[] meuArray;
        
        //aloca memória para 10 inteiros
        meuArray = new int[10];
        
        //inicializar valores
        
        meuArray[0] = 100;
        meuArray[1] = 85;
        meuArray[2] = 88;
        meuArray[3] = 93;
        meuArray[4] = 123;
        meuArray[5] = 3444;
        meuArray[6] = 1;
        meuArray[7] = 105;
        meuArray[8] = 99;
        meuArray[9] = 233;
        //meuArray[10] = 622; estoura a pilha
        
        System.out.println(meuArray[9]);
        System.out.println(meuArray[2]);
        
        
       
 
    }
}
