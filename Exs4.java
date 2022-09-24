import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
    Double vA;
    Double vB;
    Double vC;
      
    vA = Double.parseDouble(JOptionPane.showInputDialog("Dígite o valor para o lado A do triângulo:"));
    vB = Double.parseDouble(JOptionPane.showInputDialog("Dígite o valor para o lado B do triângulo:"));
    vC = Double.parseDouble(JOptionPane.showInputDialog("Dígite o valor para o lado C do triângulo:"));
    
    if (vA > vB-vC || vB > vA-vC || vC > vA-vB ) {
      JOptionPane.showMessageDialog(null, "O triângulo é real");
     } else {
      JOptionPane.showMessageDialog(null, "O triângulo não existe");
    }
  }
}
