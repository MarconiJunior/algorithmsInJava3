import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Double idade;
    System.out.println("Qual a sua idade?");
    idade = scan.nextDouble();
    if (idade <= 7){
      System.out.println("Você está na categoria infantil.");
    } else if (idade >= 8 && idade <= 10 ){
      System.out.println("Você está na categoria juvenil.");
    }else if (idade >= 11 && idade <= 15 ){
      System.out.println("Você está na categoria de adolescentes.");
    }else if (idade >= 16 && idade <= 30 ){
      System.out.println("Você está na categoria de adultos.");
    }else {
      System.out.println("Você está na categoria senior.");
    }
    
  }
}
