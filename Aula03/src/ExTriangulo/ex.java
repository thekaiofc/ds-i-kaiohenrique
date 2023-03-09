
package ExTriangulo;
import javax.swing.JOptionPane;

public class ex {
    public static void main(String[] args) {
        
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado A do triângulo"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado B do triângulo"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado C do triângulo"));
        
        if(a == b && a == c){
           JOptionPane.showMessageDialog(null, "O triângulo é Equilátero");
        }
        else if(a != b && b != c){
            JOptionPane.showMessageDialog(null, "O triângulo é Escaleno");
        }else if(a != b && b != c || c == a && b == c){
            JOptionPane.showMessageDialog(null, "O triângulo é Isósceles");
        }
    }
    
}
