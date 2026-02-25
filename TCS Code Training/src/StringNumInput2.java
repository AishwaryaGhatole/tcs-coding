import java.util.Arrays;
import java.util.Scanner;

public class StringNumInput2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String line = input.nextLine().trim();
    line = line.replaceAll("[\\[\\]]","");
    String[] parts = line.split(",");
    int[] arr = new int[parts.length];

    for(int i = 0; i < parts.length; i++){
      arr[i] = Integer.parseInt(parts[i]);
    }

    System.out.println(Arrays.toString(arr));
  }
}
