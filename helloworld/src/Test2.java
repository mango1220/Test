import java.util.Scanner;

/**
 * Created by xiaochi on 2015/1/24.
 */
public class Test2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int time = in.nextInt();
        if (time/100 >= 8){
            time = time - 800;
        }
        else {
            time = (time + 2400) - 800;
        }
        if (time < 10){
            System.out.println("0"+time);
        }
        else {
            System.out.println(time);
        }

    }
}
