import java.util.Scanner;

/**
 * Created by mxcsky on 2015/1/25.
 */
public class POJ1003 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(true) {
            double m = in.nextDouble();
            double sum = 0.0;
            int i = 1;
            if (m < 0.00001) {
                System.exit(0);
            }
            if (m <= 0.5) {
                System.out.println("1 card(s)");

            } else {
                while (sum < m) {
                    i++;
                    sum = sum + 1.0 / i;

                }
                System.out.println((i - 1) + " card(s)");
            }
        }
    }
}
