package p1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Counter extends JFrame {

    Container c;
    JTextField tf;
    JButton count, reset;
    int number = 0;

    public Counter() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.white);

        tf = new JTextField();
        tf.setBounds(100, 5, 180, 40);
        c.add(tf);

        count = new JButton("Count");
        count.setBounds(80, 60, 80, 40);
        c.add(count);

        reset = new JButton("Reset"); // 
        reset.setBounds(240, 60, 80, 40);
        c.add(reset);

        count.addActionListener((ActionEvent ae) -> {
            try { 
                number = Integer.parseInt(tf.getText());
                System.out.println(number);
                number++; 
                tf.setText(Integer.toString(number)); 
            } catch (NumberFormatException ex) {
               
            }
        });

        reset.addActionListener((ActionEvent ae) -> {
            number = 0; 
            tf.setText("0"); 
        });
    }

    public static void main(String[] args) {
        Counter frame = new Counter();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(5, 10, 400, 200);
        frame.setTitle("Counter");
    }
}