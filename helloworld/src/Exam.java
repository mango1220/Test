import java.util.Scanner;

/**
 * Created by mxcsky on 2015/1/26.
 */
public class Exam {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] array = new String[100];
        int length, plus, minus, max, i;
        i = 0;
        array[0] = str;
        array[1] = "";
        if (str.length() == 1){
            System.out.println(str);
        }
        else {
            while (true) {
                length = array[i].length();
                plus = array[i].lastIndexOf("+");
                minus = array[i].lastIndexOf("-");
                if (plus > minus){
                    max = plus;
                }
                else {
                    max = minus;
                }
                array[i+2] = str.substring(0, max-1);
                array[i+3] = str.substring(max+1);
                i = i + 2;

            }
        }

    }
}
