
package Exercício;

import javax.swing.JOptionPane;

public class desafio {
    
    void triangulo (){
        try{
        
        int base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base do triângulo"));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura do triângulo"));
        
        int area = (base*altura)/2;
        
        JOptionPane.showMessageDialog(null,"O valor da area do triângulo é: "+ area);
    }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Caractere inválido");
        }
    
}
    void retangulo (){
         try{
        
        int base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base do retângulo"));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura do retângulo"));
        
        int area = base*altura;
        
        JOptionPane.showMessageDialog(null,"O valor da area do retângulo é: "+ area);
    }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Caractere inválido");
        }
    }
    void quadrado (){
         try{
        
        int lado1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de um lado do quadrado"));
        int lado2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de outro lado do quadrado"));
        
        int area = lado1*lado2;
        
        JOptionPane.showMessageDialog(null,"O valor da area do quadrado é: "+ area);
    }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Caractere inválido");
        }
    }
    
}