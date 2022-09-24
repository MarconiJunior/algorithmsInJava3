import javax.swing.JOptionPane;
import java.lang.*;

public class Main{
  public static void main (String[] args) {
    JOptionPane.showMessageDialog(null, "Follow the example of: Δ = b²-4ac | x = (-b ± √Δ)/2a");
    double a = Double.parseDouble(JOptionPane.showInputDialog("Input the number for a: "));
    double b = Double.parseDouble(JOptionPane.showInputDialog("Input the number for b: "));
    double c = Double.parseDouble(JOptionPane.showInputDialog("Input the number for c: "));

    double delta = (b * b) - (4 * a * c);
    if (delta > 0) {
    double bhaskaraOne = (b + Math.sqrt(delta)) / (2*a);
    double bhaskaraTwo = (b - Math.sqrt(delta)) / (2*a);
      JOptionPane.showMessageDialog(null, "Δ = " + delta + " x' = " + bhaskaraOne + " x'' = " + bhaskaraTwo);
    } else {

    JOptionPane.showMessageDialog(null, "Δ =" + delta + " The equation isn't have root.");
      }


  }
  
}
