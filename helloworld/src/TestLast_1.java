import java.util.Scanner;

/**
 * Created by xiaochi on 2015/1/24.
 */
public class TestLast_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int re = 0;
        int sum = 0;
        String out = new String();
        for (int i = n; i <= m; i++){
            re = judge(i);
            if (re != 0){
                out = out + " " + re;
            }
        }
        out = out.trim();
        System.out.println(out);

    }
    public static int judge(int i){
        int sum = 0;
        if (i != 1){
            for (int j = 1; j < i; j++){
                if (i%j == 0){
                    sum = sum + j;
                }
            }
            if (sum == i){
                return i;
            }

        }
        return 0;

    }
}
