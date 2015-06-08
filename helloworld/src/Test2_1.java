import java.util.Scanner;

/**
 * Created by xiaochi on 2015/1/24.
 */
public class Test2_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int R = input/10;
        int C = input%10;
        String str = new String();
        switch (C){
            case 1:
                str = str + "Faint signals, barely perceptible";
                break;
            case 2:
                str = str + "Very weak signals";
                break;
            case 3:
                str = str + "Weak signals";
                break;
            case 4:
                str = str + "Fair signals";
                break;
            case 5:
                str = str + "Fairly good signals";
                break;
            case 6:
                str = str + "Good signals";
                break;
            case 7:
                str = str + "Moderately strong signals";
                break;
            case 8:
                str = str + "Strong signals";
                break;
            case 9:
                str = str + "Extremely strong signals";
                break;
            default:
                break;
        }
        str = str + ", ";
        switch (R){
            case 1:
                str = str + "Unreadable";
                break;
            case 2:
                str = str + "Barely readable, occasional words distinguishable";
                break;
            case 3:
                str = str + "Readable with considerable difficulty";
                break;
            case 4:
                str = str + "Readable with practically no difficulty";
                break;
            case 5:
                str = str + "Perfectly readable";
                break;
            default:
                break;

        }
        str = str + ".";
        System.out.println(str);
    }
}
