/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisao;

/**
 *
 * @author Alexandre
 */
public class CalculoDeNotas {
    
    public static void main(String[] args) {
        //valores fixos
        double nota1 = 7.5;
        double nota2 = 5.0;
        double nota3 = 8.0;
        
        //chamadas dos metodos
        double media = calcularMedia(nota1,nota2,nota3);
        double maior = maiorNota(nota1,nota2,nota3);
        double menor = menorNota(nota1, nota2, nota3);
        String status = status(media);
        
        //impressão dos resultados
        System.out.printf("Notas: %.1f, %.1f, %.1f%n", nota1, nota2, nota3);
        System.out.printf("Média = %.2f%n", media);
        System.out.printf("Maior nota = %.1f%n", maior);
        System.out.printf("Menor nota = %.1f%n", menor);
        System.out.println("Situação: " + status);
  
    }
    //método para calcular média
    public static double calcularMedia(double n1, double n2, double n3){
        return (n1+n2+n3)/3.0;
    }
    //método para encontrar a maior nota
    public static double maiorNota(double n1, double n2, double n3){
        double maior = n1;
        if(n2 > maior) maior = n2;
        if(n3 > maior) maior = n3;
        return maior;
    }
    //método para encontrar a menor nota
    public static double menorNota(double n1, double n2, double n3){
        double menor = n1;
        if(n2 < menor) menor = n2;
        if(n3 < menor) menor = n3;
        return menor;
    }
    //método para verificar situação do aluno
    public static String status(double media){
        if(media >= 6.0){
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }

    
}
