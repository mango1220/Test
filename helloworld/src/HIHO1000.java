import java.util.Scanner;

/**
 * Created by mxcsky on 2015/1/25.
 */
public class HIHO1000 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = new String();
        while (in.hasNext()){
            str = in.nextLine();
            String[] array = str.split(" ");
            int sum = 0;
            sum = Integer.parseInt(array[0]) + Integer.parseInt(array[1]);
            System.out.println(sum);
        }


    }
}
