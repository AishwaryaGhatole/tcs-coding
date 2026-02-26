import java.util.Scanner;

public class ShiftingNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String msg = input.next().toUpperCase();
    char keyChar = input.next().charAt(0);

    int keyValue = keyChar - 'A' + 1;

    for (int i = 0; i < msg.length(); i++){
      char letter = msg.charAt(i);
      int letterValue = letter - 'A' + 1;
      
      int increpted = keyValue + letterValue;

      System.out.print(increpted + " ");
    }
  }
}



// H E L L O 
// 8 5 12 12 15

// T = 20

// 28 25 32 32 35


