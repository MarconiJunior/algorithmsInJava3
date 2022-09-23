import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
    Double nota1;
    Double nota2;
    nota1 = Double.parseDouble(JOptionPane.showInputDialog("Dígite a primeira nota."));
    nota2 = Double.parseDouble(JOptionPane.showInputDialog("Dígite a segunda nota nota."));
    if((nota1 + nota2)/2 >= 7){
      JOptionPane.showMessageDialog(null, "Aluno aprovado!");
    }else{
      JOptionPane.showMessageDialog(null, "Aluno reprovado!");
      
    }
  }
}
