import java.util.Scanner;

public class PrintingOfFloat {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double num = input.nextDouble();

    System.out.printf("%.3f", num);
  }
}
