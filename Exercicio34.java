package exercicio34;

import java.util.Scanner;

public class Exercicio34 {

  public static void main(String[] args) {
    
    System.out.println("EXERCÍCIO 34");
    System.out.println("Elabore um algoritmo que, dada a idade de um nadador.\n"
            + "Classifique-o em uma das seguintes categorias:\n"
            + "a. Infantil A =  5 - 7  anos;\n"
            + "b. Infantil B =  8 - 10 anos;\n"
            + "c. Juvenil A  = 11 - 13 anos;\n"
            + "d. Juvenil B  = 14 - 17 anos;\n"
            + "e. Sênior     = 18 - 25 anos.\n"
            + "Apresentar mensagem “idade fora da faixa etária” quando for outro ano não contemplado;");
    System.out.println("----------------------------------");
    
    Scanner leitorIdade = new Scanner(System.in);
    
    System.out.println("Digite a idade do nadador: ");
    int idadeNadador = leitorIdade.nextInt();
    
    System.out.println("----------------------------------");
    
    if((idadeNadador >= 5) && (idadeNadador <= 7)){
      System.out.println("A categoria do nadador é INFANTIL A.");
    } else {
      if((idadeNadador >= 8) && (idadeNadador <= 10)){
        System.out.println("A categoria do nadador é INFANTIL B.");
      } else {
        if((idadeNadador >= 11) && (idadeNadador <= 13)){
          System.out.println("A categoria do nadador é JUVENIL A.");
        } else {
          if((idadeNadador >= 14) && (idadeNadador <= 17)){
            System.out.println("A categoria do nadador é JUVENIL B.");
          } else {
            if((idadeNadador >= 18) && (idadeNadador <= 25)){
              System.out.println("A categoria do nadador é SÊNIOR.");
            } else {
              System.out.println("Idade fora da faixa etária.");
            }
          }
        }
      }
    }
    
    
  }
  
}
