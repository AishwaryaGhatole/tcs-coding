import java.util.*;

public class StringNumInput{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Give a Number Input : ");
        String line = input.nextLine();
        String[] parts = line.split(" ");
        int[] arr = new int[parts.length];

        for(int i = 0; i < parts.length; i++){
            arr[i] = Integer.parseInt(parts[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}

// "123456"
//[123456]
// [1,2,3,4,5,6]
