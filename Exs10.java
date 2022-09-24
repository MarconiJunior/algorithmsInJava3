import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int dia;
    System.out.println("Dígite um número de 1 até 7:");
    dia = scan.nextInt();
    if (dia == 1){
      System.out.println("O dia da semana correspondente ao número é: Domingo");
    } else if (dia == 2){
      System.out.println("O dia da semana correspondente ao número é: Segunda");
    } else if (dia == 3){
      System.out.println("O dia da semana correspondente ao número é: Terça");
    } else if (dia == 4){
      System.out.println("O dia da semana correspondente ao número é: Quarta");
    } else if (dia == 5){
      System.out.println("O dia da semana correspondente ao número é: Quinta");
    } else if (dia == 6){
      System.out.println("O dia da semana correspondente ao número é: Sexta");
    } else if (dia == 7){
      System.out.println("O dia da semana correspondente ao número é: Sábado");
    } else {
      System.out.println("Não existe um dia da semana correspondente ao número!");
    }
    
  }
}
