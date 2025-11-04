import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class myframe extends JFrame{
    private JPanel p,p1,p2;
    private JTextArea tx;
    private JButton b1,
    b2,b3,b4,b5,b6,b7,
    b8,b9,b10,b11,b12,
    b13,b14,b15,b16,b17;
    double fnum = 0, snum = 0, result = 0;
    String op = "";
    myframe(){

        p = new JPanel();
        p.setPreferredSize(new Dimension(300,450));
        p.setLayout(new FlowLayout());
        p.setBackground(Color.BLUE);


        p1 = new JPanel();
        tx = new JTextArea(1, 10);
        tx.setFont(new Font("Arial black", Font.BOLD,24));
        tx.setEditable(false);
        p1.add(tx);

        p2 = new JPanel();
        p2.setPreferredSize(new Dimension(250,400));
        p2.setLayout(new FlowLayout());
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b10 = new JButton("0");
        b11 = new JButton("+");
        b12 = new JButton("-");
        b13 = new JButton("*");
        b14 = new JButton("/");
        b15 = new JButton("%");
        b16 = new JButton("=");
        b17 = new JButton("AC");
        b1.setPreferredSize(new Dimension(70,40));
        b2.setPreferredSize(new Dimension(70,40));
        b3.setPreferredSize(new Dimension(70,40));
        b4.setPreferredSize(new Dimension(70,40));
        b5.setPreferredSize(new Dimension(70,40));
        b6.setPreferredSize(new Dimension(70,40));
        b7.setPreferredSize(new Dimension(70,40));
        b8.setPreferredSize(new Dimension(70,40));
        b9.setPreferredSize(new Dimension(70,40));
        b10.setPreferredSize(new Dimension(70,40));
        b11.setPreferredSize(new Dimension(70,40));
        b12.setPreferredSize(new Dimension(70,40));
        b13.setPreferredSize(new Dimension(70,40));
        b14.setPreferredSize(new Dimension(70,40));
        b15.setPreferredSize(new Dimension(70,40));
        b16.setPreferredSize(new Dimension(217,50));
        b17.setPreferredSize(new Dimension(217,50));

        b1.addActionListener(e -> tx.setText(tx.getText()+"1"));
        b2.addActionListener(e -> tx.setText(tx.getText()+"2"));
        b3.addActionListener(e -> tx.setText(tx.getText()+"3"));
        b4.addActionListener(e -> tx.setText(tx.getText()+"4"));
        b5.addActionListener(e -> tx.setText(tx.getText()+"5"));
        b6.addActionListener(e -> tx.setText(tx.getText()+"6"));
        b7.addActionListener(e -> tx.setText(tx.getText()+"7"));
        b8.addActionListener(e -> tx.setText(tx.getText()+"8"));
        b9.addActionListener(e -> tx.setText(tx.getText()+"9"));
        b10.addActionListener(e -> tx.setText(tx.getText()+"0"));
        b11.addActionListener(click ->{
            fnum = Double.parseDouble(tx.getText());
            op = "+";
            tx.setText("");
        });
        b12.addActionListener(click ->{
            fnum = Double.parseDouble(tx.getText());
            op = "-";
            tx.setText("");
        });
        b13.addActionListener(click ->{
             fnum = Double.parseDouble(tx.getText());
            op = "*";
            tx.setText("");
        });
        b14.addActionListener(click ->{
            fnum = Double.parseDouble(tx.getText());
            op = "/";
            tx.setText("");
        });
        b15.addActionListener(click ->{
            fnum = Double.parseDouble(tx.getText());
            op = "%";
            
            tx.setText("");
        });
        b16.addActionListener(click ->{
            snum = Double.parseDouble(tx.getText());
            if(op.equals("+")){
                result = fnum + snum;
            }
            else if(op.equals("-")){
                result = fnum - snum;
            }
            else if(op.equals("*")){
                result = fnum * snum;
            }
            else if(op.equals("/")){
                result = fnum / snum;
            }
            else if (op.equals("%")){
                if(snum != 0){
                    result = fnum % snum;
                }else{
                    tx.setText(tx.getText()+ "error: Divison by zero is not allowed");
                    return;
                }
                
            }      
            else{
                tx.setText(tx.getText()+"syntax error");
            }

            tx.setText(String.valueOf(result));
            fnum = result;
            op = "";
        });
        b17.addActionListener(click ->{
            tx.setText("");
        });

        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b10);
        p2.add(b11);
        p2.add(b12);
        p2.add(b13);
        p2.add(b14);
        p2.add(b15);
        p2.add(b16);
        p2.add(b17);


        p.add(p1);
        p.add(p2);

        add(p);



    }
   
    
}
