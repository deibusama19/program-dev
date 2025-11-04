import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Apps {
    public static void main(String[] args) throws Exception {
        myframe frame = new myframe();
        frame.setTitle("calculator");
        frame.setSize(300 , 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}
