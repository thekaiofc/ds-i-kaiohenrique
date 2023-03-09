/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Instancia;

import javax.swing.JOptionPane;


public class teste {
    public static void main(String[] args) {
       Funcalc chamar = new Funcalc();
       
     String op = JOptionPane.showInputDialog("Digite o operador matemático");
    
     if (op.equals("+")){
         chamar.soma();
    }
     else if(op.equals("-")){
         chamar.subtração();
     }
     else if(op.equals("/")){
         chamar.divisao();
     }
     else if(op.equals("*")){
         chamar.multiplicacao();
     }
     else {
         System.out.println("Valor inválido");
     }
     
    
}
}