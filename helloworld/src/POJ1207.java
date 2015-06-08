import java.util.Scanner;

/**
 * Created by mxcsky on 2015/1/25.
 */
public class POJ1207 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = new String();
        while (in.hasNext()){
            str = in.nextLine();
            String[] array = str.split(" ");
            int i = Integer.parseInt(array[0]);
            int j = Integer.parseInt(array[1]);
            int t = 0;
            int signal = 0;
            int num = 0;
            int max = 0;
            int n = 0;
            if (i > j){
                t = i;
                i = j;
                j = t;
                signal = 1;
            }
            else {
                signal = 0;
            }
            for(int temp = i; temp <= j; temp++){
                n = temp;
                while (true){
                    if (n == 1){
                        num++;
                        break;
                    }
                    else {
                        if (n % 2 == 1){
                            n = 3 * n + 1;
                            num++;
                        }
                        else {
                            n = n / 2;
                            num++;
                        }
                    }
                }
                if (max < num){
                    max = num;
                }
                num = 0;
            }
            if (signal == 0){
                System.out.println(i+" "+j+" "+max);
            }
            else {
                System.out.println(j+" "+i+" "+max);
            }

        }
    }
}
