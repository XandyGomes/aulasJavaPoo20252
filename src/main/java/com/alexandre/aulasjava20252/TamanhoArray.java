/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alexandre.aulasjava20252;

/**
 *
 * @author Alexandre
 */
public class TamanhoArray {
    public static void main(String[] args) {
        int[] arrayUm = {12,3,5,68,9,6,73,44,456,65,321};
        int[] arrayDois = {43,42,4,8,55,21,2,45};
        
        if(arrayUm.length > 8){
            System.out.println("Tamanho do ArrayUm - Maior que 8");
        }else{
            System.out.println("Tamanho do ArrayUm - Menor que 8");
        }
        
        System.out.println("Tamanho do ArrayDois = "+arrayDois.length);  
    }
}
