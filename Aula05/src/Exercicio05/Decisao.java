package Exercicio05;

import javax.swing.JOptionPane;

public class Decisao {

    void idade() {

        try {
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));

            if (idade >= 18) {
                 JOptionPane.showMessageDialog(null, "Maior de idade");
            } else {
                JOptionPane.showMessageDialog(null, "Menor de idade");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Caractere inválido");
        }
    }

    void soma() {

        try {
            int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
            int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
            int soma = a + b;
            
            JOptionPane.showMessageDialog(null, "O valor da soma é: " + soma);


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Caractere inválido");
        }
    }
    void sub (){
        try {
            int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
            int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
            int sub = a - b;
            
            JOptionPane.showMessageDialog(null, "O valor da subtração é: " + sub);

        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Caractere inválido");
        }
    }
}
