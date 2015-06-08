import java.util.Scanner;

/**
 * Created by xiaochi on 2015/1/24.
 */
public class Test1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double F = in.nextFloat();
        double C = 0.0;
        C = (F-32)/(9.0/5.0);
        System.out.println((int)C);

    }
}
