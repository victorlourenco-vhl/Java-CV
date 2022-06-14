/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Victor Windows
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        
        System.out.println("A nota é " + nota);
        // Formata a saida para duas casas decimais
        System.out.printf("A nota de %s é %.1f \n", nome, nota);
        // Desempenha a mesma função do printf 
        System.out.format("A nota de %s é %.1f \n", nome, nota);
    }
    
}
