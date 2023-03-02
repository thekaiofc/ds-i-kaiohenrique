
package Procedimento;
import javax.swing.JOptionPane;

public class Operador {
    
void soma() {
    
    int a = Integer.parseInt(JOptionPane.showInputDialog ("Digite um valor: "));
    int b = Integer.parseInt(JOptionPane.showInputDialog ("Digite um valor: "));;
    int soma = a + b;
    JOptionPane.showMessageDialog(null, "O valor da soma: " + soma);
}
void subtracao() {
    
    int a = Integer.parseInt(JOptionPane.showInputDialog ("Digite um valor: "));
    int b = Integer.parseInt(JOptionPane.showInputDialog ("Digite um valor: "));;
    int subt = a - b;
    JOptionPane.showMessageDialog(null, "O valor da soma: " + subt);
}
void divisao() {
    
    double a = Integer.parseInt(JOptionPane.showInputDialog ("Digite um valor: "));
    double b = Integer.parseInt(JOptionPane.showInputDialog ("Digite um valor: "));;
    double div = a / b;
    JOptionPane.showMessageDialog(null, "O valor da soma: " + div);
}
void multiplicacao() {
    
    double a = Integer.parseInt(JOptionPane.showInputDialog ("Digite um valor: "));
    double b = Integer.parseInt(JOptionPane.showInputDialog ("Digite um valor: "));;
    double mult = a * b;
    JOptionPane.showMessageDialog(null, "O valor da soma: " + mult);
}
}