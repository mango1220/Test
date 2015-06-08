import java.util.Scanner;

/**
 * Created by xiaochi on 2015/1/24.
 */
public class TestLast {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n  = in.nextInt();
        int m = n;
        String str = new String();
        int j = 0;
        for (int i = 2; i <= n; i++){
            while (n != i){
                if (n%i == 0){
                    str = str + i + "x";
                    n = n / i;

                }
                else {
                    break;
                }
            }
            j = i;
        }
        str = m + "=" + str + j;
        System.out.println(str);
    }
}
