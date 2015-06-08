import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

/**
 * Created by mxcsky on 2015/3/9.
 */
public class TimeAction {
    public static void main(String[] args){
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(2000, listener);
        t.start();
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);

    }
}
class  TimePrinter implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        Date now = new Date();
        System.out.println("At the tone, the time is " + now);
        Toolkit.getDefaultToolkit().beep();
    }
}
