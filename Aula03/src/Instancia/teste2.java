
package Instancia;

import java.awt.TrayIcon;
import javax.swing.JOptionPane;


public class teste2 {
    public static void main(String[] args) {
   
    
    Funcalc chamar = new Funcalc();
try{
    
    int op = Integer.parseInt(JOptionPane.showInputDialog("Digite o operador"));
    
    if (op == 1){
    chamar.soma();
}
    else if(op == 2) {
        chamar.subtração();
    }
    else if(op == 3){
        chamar.divisao();
}
    else if(op == 4){
        chamar.multiplicacao();
    }
    else{
        System.out.println("Valor inválido!");
    }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Valor inválido");
    }
}
}