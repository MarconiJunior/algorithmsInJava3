import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n1;
    int n2;
    System.out.println("Digite um número:");
    n1 = scan.nextInt();
    System.out.println("Digite outro número:");
    n2 = scan.nextInt();
    int escolha;
    System.out.println("1 para somar; 2 para subtrair; 3 para multiplicar e 4 para dividir");
    escolha = scan.nextInt();
    if (escolha == 1){
      System.out.println(n1 + n2);
    } else if (escolha == 2){
      System.out.println(n1 - n2);
    } else if (escolha == 3){
      System.out.println(n1 * n2);
    } else if (escolha == 4){
      System.out.println(n1 /n2);
    } else {
      System.out.println("Opção inválida");
    }
    
  }
}
