
package Exercício;

import java.awt.TrayIcon;
import javax.swing.JOptionPane;

public class teste {
    public static void main(String[] args) {
        
        
        desafio chamar = new desafio ();
        
        String forma =JOptionPane.showInputDialog("Digite a forma geométrica que quer calcular a área (1 para triangulo, 2 para retangulo e 3 para quadrado");
        
        if(forma.equals("1")){
            chamar.triangulo();
            
        }else if(forma.equals("2")){
            chamar.retangulo();
        }else if(forma.equals("3")){
            chamar.quadrado();
         
    }
    
    }
}
