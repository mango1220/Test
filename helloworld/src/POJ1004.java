import java.util.Scanner;

/**
 * Created by mxcsky on 2015/1/25.
 */
public class POJ1004 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double sum = 0.0;
        for (int i = 0; i < 12; i++){
            sum = sum + in.nextDouble();
        }
        System.out.printf("$%.2f", sum/12);
    }
}
