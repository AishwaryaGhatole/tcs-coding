import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayInput {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String line = input.nextLine();
    String[] parts = line.split(",");
    int rows = 3, cols = 2;
    int[][] matrix = new int[rows][cols];

    int k = 0;
    
    for(int i = 0; i < rows; i++){
      for(int j = 0; j < cols; j++){
        matrix[i][j] = Integer.parseInt(parts[k].trim());
        k++;
      }
    }
    for(int i =0; i < rows; i++){
      System.out.println(Arrays.toString(matrix[i]));
    }
  }
}
